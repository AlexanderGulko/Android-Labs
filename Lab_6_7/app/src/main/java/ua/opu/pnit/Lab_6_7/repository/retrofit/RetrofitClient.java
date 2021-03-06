package ua.opu.pnit.Lab_6_7.repository.retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import ua.opu.pnit.Lab_6_7.repository.retrofit.model.AuthRequest;
import ua.opu.pnit.Lab_6_7.repository.retrofit.model.AuthResponse;

public interface RetrofitClient {

    @POST("/auth")
    Call<AuthResponse> auth(@Body AuthRequest request);

    @GET("/me")
    Call<Void> checkToken(@Header("Authorization") String authToken);
}
