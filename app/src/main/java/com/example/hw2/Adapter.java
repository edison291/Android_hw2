package com.example.hw2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private List<ItemData> data;

    Adapter(Context context, List<ItemData> data){
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }

    public List<ItemData> getData() {
        return this.data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemData itemData = data.get(position);
        holder.itemName.setText(itemData.getItemName());
        holder.itemImage.setImageResource(itemData.getItemImage());
        holder.cardView.setOnClickListener((view -> {
            Intent intent = new Intent(view.getContext(), ItemDetails.class);
            intent.putExtra("itemName", itemData.getItemName());
            intent.putExtra("itemImage", itemData.getItemImage());
            intent.putExtra("itemDesc", itemData.getItemDesc());
            intent.putExtra("itemUrl", itemData.getItemUrl());
            view.getContext().startActivity(intent);
        }));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView itemImage;
        TextView itemName;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.itemImage);
            itemName = itemView.findViewById(R.id.textItemName);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
