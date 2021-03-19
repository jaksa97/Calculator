package veljkojaksic.calculator.Refrofit;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitInterface {
    @GET("rates?")
    Call<JsonObject> getExchangeCurrency(@Query("base") String currency);
}
