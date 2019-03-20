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

        ArrayList<String> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            myList.add("String number " + (i+1));
        }

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(myList, this);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}
