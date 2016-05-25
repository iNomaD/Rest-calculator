package etu.wollen.client;

import etu.wollen.jersey.Calculator;
import retrofit.http.GET;
import retrofit.Call;
import retrofit.http.Path;

public interface APIService {
    @GET("calc/{expr}")
    Call<Calculator.Result> calculate(@Path("expr") String expr);
}
