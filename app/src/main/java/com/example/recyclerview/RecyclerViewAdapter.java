package com.example.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<RecyclerViewRowClass> myArray = new ArrayList<>();
    private Context context;
    private LayoutInflater mInflater;

    public RecyclerViewAdapter(ArrayList<RecyclerViewRowClass> myArray, Context context) {
        this.myArray = myArray;
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.recycler_view_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String str = myArray.get(i).text;
        Boolean aboolean = myArray.get(i).isChecked;
        viewHolder.textView.setText(str);
        viewHolder.checkBox.setChecked(aboolean);
    }

    @Override
    public int getItemCount() {
        return myArray.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        private CheckBox checkBox;

        ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.recycler_row_text);
            checkBox = itemView.findViewById(R.id.recycler_row_checkbox);
        }
    }

}


