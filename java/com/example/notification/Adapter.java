package com.example.notification;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.security.PublicKey;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private ArrayList<Item> itemArrayList;

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView1;
        public TextView imageView;
        public TextView textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1=itemView.findViewById(R.id.textViewName);
            imageView=itemView.findViewById(R.id.imageView);
            textView2=itemView.findViewById(R.id.textViewDescription);
        }
    }

    public Adapter(ArrayList<Item> arrayList){
        itemArrayList=arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout,parent,false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Item currentitem=itemArrayList.get(position);

        holder.textView1.setText(currentitem.getTitle());
        holder.imageView.setText(currentitem.getImage());
        holder.textView2.setText(currentitem.getDate());

    }

    @Override
    public int getItemCount() {
        return itemArrayList.size();
    }
}
