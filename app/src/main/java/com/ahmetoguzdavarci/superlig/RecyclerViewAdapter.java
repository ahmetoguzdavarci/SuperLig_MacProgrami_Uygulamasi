package com.ahmetoguzdavarci.superlig;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>{
    private List<String> liste;

    public RecyclerViewAdapter(List<String> liste) {
        this.liste = liste;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View view=layoutInflater.inflate(R.layout.activity_second, viewGroup,false);

        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.tvRecycler.setText(liste.get(position));
    }

    @Override
    public int getItemCount() {
        return liste.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{

        TextView tvRecycler;
        public RecyclerViewHolder(@NonNull View itemView) {

            super(itemView);
            tvRecycler=itemView.findViewById(R.id.tvRecycler);
        }
    }
}
