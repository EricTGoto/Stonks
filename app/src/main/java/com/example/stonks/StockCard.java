package com.example.stonks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StockCard extends AppCompatActivity {
    private String ticker;
    private String dayDayPerformance;

    public StockCard(String ticker, String dayDayPerformance){
        this.ticker=ticker;
        this.dayDayPerformance=dayDayPerformance;
    }

    public String getTicker(){
        return ticker;
    }

    public String getDayDayPerformance(){
        return dayDayPerformance;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stocks_page);
    }

}