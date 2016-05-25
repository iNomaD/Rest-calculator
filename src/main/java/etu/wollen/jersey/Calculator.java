package etu.wollen.jersey;

import etu.wollen.antlr.ExprLexer;
import etu.wollen.antlr.ExprParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class Calculator {
    static class ThrowingErrorListener extends BaseErrorListener {

        public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                throws ParseCancellationException {
            throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
        }
    }

    public static class Result{
        private boolean isValid;
        private double value;
        private String errText;

        public boolean isValid() {
            return isValid;
        }

        public void setValid(boolean valid) {
            isValid = valid;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public String getErrText() {
            return errText;
        }

        public void setErrText(String errText) {
            this.errText = errText;
        }
    }

    public static Result calculate(String expr){
        Result res = new Result();
        try {
            ANTLRInputStream in = new ANTLRInputStream(expr);
            ExprLexer lexer = new ExprLexer(in);
            lexer.removeErrorListeners();
            lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExprParser parser = new ExprParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
            res.setValue(parser.eval().value);
            res.setValid(true);
        }
        catch(ParseCancellationException e){
            res.setValid(false);
            res.setErrText(e.getMessage());
        }
        catch(RecognitionException e){
            res.setValid(false);
            res.setErrText(e.getMessage());
        }

        return res;
    }
}
