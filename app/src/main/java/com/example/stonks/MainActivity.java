package com.example.stonks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<StockCard> stockcards;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.addButton:
                search();
                return true;
        }
        return super.onOptionsItemSelected(item);
        }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        stockcards= new ArrayList<>();


    }

    private void search(){
        EditText searchBar =findViewById(R.id.searchBar);
        String requestedTicker=  searchBar.getText().toString();

        findTickerDetails(requestedTicker);
        stockcards.add(new StockCard(requestedTicker,"1.5%"));
        updateCards();
    }

    private void updateCards(){
        recyclerView=findViewById((R.id.recyclerView));
        recyclerView.setHasFixedSize(true);
        layoutManager= new LinearLayoutManager(this);
        adapter= new Adapter(stockcards);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void findTickerDetails(String requestedTicker){


    }
}