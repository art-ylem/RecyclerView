package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recycler_view);

        ArrayList<RecyclerViewRowClass> myList = new ArrayList<>();
        for(int i = 1; i < 101; i++){

            myList.add(new RecyclerViewRowClass("My Text" + i, true));
        }

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(myList, this);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}
