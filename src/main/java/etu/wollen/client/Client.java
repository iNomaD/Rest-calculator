package etu.wollen.client;
import etu.wollen.jersey.Calculator;
import retrofit.Call;
import retrofit.JacksonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

import java.io.IOException;
import java.net.URLEncoder;

public class Client {
    private static String APIUrl = "http://localhost:3333/rest/";
    private static APIService service = null;

    private static void init(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        service = retrofit.create(APIService.class);
    }

    public static Calculator.Result sendRequest(String request){
        if(service == null) init();
        try {
            String uri = URLEncoder.encode(request, "UTF-8");
            Call<Calculator.Result> call = service.calculate(uri);
            Response<Calculator.Result> response = call.execute();
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args){
        String request = "";
        if(args.length > 0){
            request = args[0];
        }
        else{
            System.out.println("Empty request. You should insert expression as a parameter.");
            return;
        }

        Calculator.Result res = sendRequest(request);
        if(res == null){
            System.out.println("Error: null response. Service is likely unavailable.");
        }
        else{
            if(res.isValid()){
                System.out.println("Result: "+res.getValue());
            }
            else{
                System.out.println("Error: "+res.getErrText());
            }
        }
    }
}
