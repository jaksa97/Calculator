package veljkojaksic.calculator.Refrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {
    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl("https://api.vatcomply.com/").addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
