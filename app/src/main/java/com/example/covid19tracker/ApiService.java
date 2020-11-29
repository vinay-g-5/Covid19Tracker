package com.example.covid19tracker;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/summary")
    Call<ArrayList<Covid>> getCovid();
}
