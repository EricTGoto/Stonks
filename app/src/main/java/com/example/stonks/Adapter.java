package com.example.stonks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<StockCard> stockCards;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView ticker;
        public TextView dayDayPerformance;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ticker=itemView.findViewById(R.id.tickerText);
            dayDayPerformance=itemView.findViewById(R.id.dayDayPerformance);
        }
    }

    public Adapter(ArrayList<StockCard> stockCards){
        this.stockCards=stockCards;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.stockcards,parent,false);
        ViewHolder vh= new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        StockCard s= stockCards.get(position);

        holder.ticker.setText(s.getTicker());
        holder.dayDayPerformance.setText(s.getDayDayPerformance());
    }

    @Override
    public int getItemCount() {
        return stockCards.size();
    }
}
