package com.example.tugasday6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DetailModel extends RecyclerView.Adapter<DetailModel.ViewHolder> {
    private ArrayList<DiorModel> diorModel;
    private Context context;
    public DetailModel (Context context, ArrayList<DiorModel> diorModel) {
        this.context = context;
        this.diorModel = diorModel;
    }

    public DetailModel(ArrayList<DiorModel> diorModel) {
        this.context = context;
        this.diorModel = diorModel;
    }

    @NonNull
    @Override
    public DetailModel.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DetailModel.ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.diorProduk.setImageResource(diorModel.get(position).getGmbrProduk());
        holder.namaProduk.setText(diorModel.get(position).getNamaProduk());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("nama", diorModel.get(position).getNamaProduk());
                intent.putExtra("logo", diorModel.get(position).getGmbrProduk());

                intent.putExtra("detail_tambahan2", diorModel.get(position).getDetailHargaB());
                intent.putExtra("detail_tambahan3", diorModel.get(position).getDetailWarnaB());
                intent.putExtra("detail_tambahan4", diorModel.get(position).getDetailTipeB());
                intent.putExtra("detail_tambahan5", diorModel.get(position).getDetailUkuranB());
                intent.putExtra("detail_tambahan6", diorModel.get(position).getDetailUPanjangb());
                intent.putExtra("detail_tambahan7", diorModel.get(position).getDetailTipeKerah());
                intent.putExtra("detail_tambahan8", diorModel.get(position).getDetailDibuat());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return diorModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView namaProduk;
        ImageView diorProduk;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            diorProduk = itemView.findViewById(R.id.dior_product);
            namaProduk = itemView.findViewById(R.id.nama_product);
        }
    }
}
