package com.example.maytinh;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    Context context;
    ArrayList<PhepTinh> data = null;
    int layoutResource;

    public Adapter(Context context, ArrayList<PhepTinh> data, int layoutResource) {
        this.context = context;
        this.data = data;
        this.layoutResource = layoutResource;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        View row = inflater.inflate(layoutResource, viewGroup , false);
        return  new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.kq.setText(data.get(i).getKq());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView kq;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            kq = itemView.findViewById(R.id.lskq);

        }
    }
}
