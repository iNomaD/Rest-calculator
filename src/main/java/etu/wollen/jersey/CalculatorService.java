package etu.wollen.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.net.URLDecoder;

@Path("/calc")
public class CalculatorService {
    @GET
    @Path("/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public Calculator.Result calculate(@PathParam("param") String param) {
        try {
            String request = URLDecoder.decode(param, "UTF-8");
            Calculator.Result res = Calculator.calculate(request);
            return res;
        }
        catch (java.io.UnsupportedEncodingException e){
            e.printStackTrace();
            Calculator.Result res = new Calculator.Result();
            res.setValid(false);
            res.setErrText(e.getMessage());
            return res;
        }
    }
}
