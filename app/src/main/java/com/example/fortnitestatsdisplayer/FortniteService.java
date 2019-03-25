package com.example.fortnitestatsdisplayer;

import com.example.fortnitestatsdisplayer.model.FortniteResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FortniteService {

    @GET("profile/{platform}/{epicNickName}")
    @Headers("TRN-Api-Key: 4cca4c77-ef6b-40a6-83ab-b188b3633f92")

    Call<FortniteResponse> searchByPlayer(
            @Path("platform")String platform,
            @Path("epicNickName")String epicNickName);


}


