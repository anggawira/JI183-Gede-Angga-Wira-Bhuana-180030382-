package com.example.rentalmobil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private Context context;
    private ArrayList<menu> menus;

    public MenuAdapter(Context ncontext, ArrayList<menu> menumobil){
        context = ncontext;
        menus = menumobil;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.menu_item,parent,false);
        return new MenuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        menu menubaru= menus.get(position);
        String gambarbaru= menubaru.getImage();
        String harga=menubaru.getHargasewa();
        String nama=menubaru.getNama();

        holder.tvnamadata.setText(nama);
        holder.tvhargasewadata.setText(harga);
        Glide
                .with(context)
                .load(gambarbaru)
                .centerCrop()
                .into(holder.imdata);

    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {
        public ImageView imdata;
        public TextView tvhargasewadata;
        public TextView tvnamadata;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            imdata=itemView.findViewById(R.id.imgmenu);
        tvhargasewadata=itemView.findViewById(R.id.tvharga);
        tvnamadata=itemView.findViewById(R.id.tvnama);
        }
    }
}
