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
            myList.add(new RecyclerViewRowClass("My Text1", true));
            myList.add(new RecyclerViewRowClass("My Text2", false));
            myList.add(new RecyclerViewRowClass("My Text3", true));

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(myList, this);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}
