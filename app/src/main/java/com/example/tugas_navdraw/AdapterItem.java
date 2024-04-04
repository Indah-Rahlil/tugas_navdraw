package com.example.tugas_navdraw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterItem extends RecyclerView.Adapter<AdapterItem.ViewHolder>{
    List<Item_MakMin> listData;
    private LayoutInflater mInflater;
    Context context;
    public AdapterItem(List<Item_MakMin> listData){
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterItem.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterItem.ViewHolder holder, int position) {
        Item_MakMin makmin = listData.get(position);
        holder.namaItem.setText(makmin.getNamaItem());
        holder.deskripsi.setText(makmin.getDeskripsiItem());
        holder.image.setImageResource(makmin.getImageItem());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView namaItem, deskripsi;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaItem = itemView.findViewById(R.id.namaItem);
            deskripsi = itemView.findViewById(R.id.deskripsi);
            image = itemView.findViewById(R.id.image);
        }
    }
}
