package com.example.fortnitestatsdisplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fortnitestatsdisplayer.model.FortniteResponse;

import org.w3c.dom.Text;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Button searchButton;
    private EditText platformText;
    private EditText usernameText;
    private TextView textView;
    private Button recentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        wireWidgets();
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchLifeTimeStats();
            }
        });
        recentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchRecentStats();
            }
        });
    }


    private void wireWidgets() {
        searchButton = findViewById(R.id.button_main_search);
        recentButton = findViewById(R.id.recent_main_button);
        usernameText = findViewById(R.id.text_main_search);
        platformText = findViewById(R.id.text_main_platform);
        textView = findViewById(R.id.textView2);
    }

    private void searchRecentStats(){

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://api.fortnitetracker.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        FortniteService service = retrofit.create(FortniteService.class);

        Call<FortniteResponse> recipeResponseCall = service.searchByPlayer(platformText.getText().toString(), usernameText.getText().toString());

        recipeResponseCall.enqueue(new Callback<FortniteResponse>() {
            @Override
            public void onResponse(Call<FortniteResponse> call, Response<FortniteResponse> response) {
                if (response.body().getRecentMatches() != null) {

                    Log.d("ENQUEUE", "onResponse: " + response.body().toString());

                    //totals the stats for the last 10 matches
                    int x = 0;
                    int a = 0;
                    int b = 0;
                    int c = 0;
                    int d = 0;
                    for(int j = 0; j <= 9; j++)
                    {
                        x += response.body().getRecentMatches().get(j).getKills();
                        a += response.body().getRecentMatches().get(j).getTop1();
                        b += response.body().getRecentMatches().get(j).getTop3();
                        c += response.body().getRecentMatches().get(j).getTop5();
                        d += response.body().getRecentMatches().get(j).getTop6();

                    }
                    textView.setText(
                            "Kills: " + x +"\n" +
                            "Top 1s: " + a + "\n" +
                            "Top 3s: " + b + "\n" +
                            "Top 5s: " + c + "\n" +
                            "Top 6s: " + d + "\n");

                } else {
                    textView.setText("Please reenter search querys");
                }
            }

            @Override
            public void onFailure(Call<FortniteResponse> call, Throwable t) {
                Log.d("ENQUEUE", "onFailure: " + t.getMessage());

            }
        });
    }




    private void searchLifeTimeStats() {

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://api.fortnitetracker.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        FortniteService service = retrofit.create(FortniteService.class);

        Call<FortniteResponse> recipeResponseCall = service.searchByPlayer(platformText.getText().toString(), usernameText.getText().toString());

        recipeResponseCall.enqueue(new Callback<FortniteResponse>() {
            @Override
            public void onResponse(Call<FortniteResponse> call, Response<FortniteResponse> response) {
                if (response.body().getLifeTimeStats() != null) {

                    Log.d("ENQUEUE", "onResponse: " + response.body().toString());

                    //displays the various stats from the lifeTime Stats List
                    String x = "";
                    for(int j = 7; j <= 11; j++)
                    {
                    x = x + "\n" + response.body().getLifeTimeStats().get(j).getKey().toString() + ": " + response.body().getLifeTimeStats().get(j).getValue().toString();
                    }
                    textView.setText(x);

                } else {
                    textView.setText("Please reenter search querys");
                }
            }

            @Override
            public void onFailure(Call<FortniteResponse> call, Throwable t) {
                Log.d("ENQUEUE", "onFailure: " + t.getMessage());

            }
        });
    }

}









