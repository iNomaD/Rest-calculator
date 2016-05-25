package etu.wollen.client;
import etu.wollen.jersey.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ClientTest {
    private static double delta = 0.0000001;
    private static final Map<String, Double> validData = new HashMap<String, Double>();
    private static final Set<String> invalidData = new HashSet<String>();

    @Before
    public void setupValidData(){
        validData.put("-15+4", -11.0);
        validData.put("10+(-4)*(-(-5))", -10.0);
        validData.put("((4+5))", 9.0);
        validData.put("100/5/4", 5.0);
        validData.put("3/0", Double.POSITIVE_INFINITY);
        validData.put("0*(5/0)", Double.NaN);
    }

    @Before
    public void setupInvalidData(){
        invalidData.add("34//5");
        invalidData.add("abcd");
        invalidData.add("--5");
        invalidData.add("5**7");
    }

    @After
    public void tearDownData(){
        validData.clear();
        invalidData.clear();
    }

    @Test
    public void testValidData() throws Exception {
        for(Map.Entry<String, Double> entry : validData.entrySet()){
            String request = entry.getKey();
            double value = entry.getValue();

            Calculator.Result res = Client.sendRequest(request);
            assertNotNull(res);
            assertTrue(res.isValid());
            assertEquals(value, res.getValue(), delta);
        }
    }

    @Test
    public void testInvalidData() throws Exception {
        for(String request : invalidData){
            Calculator.Result res = Client.sendRequest(request);
            assertNotNull(res);
            assertTrue(!res.isValid());
        }
    }
}
