package edu.sfsu.the_cocktail_database.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import edu.sfsu.the_cocktail_database.models.DataModel;

/**
 * Recycler View Adapter
 */

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {
    Context context;
    ArrayList<DataModel> model;
    public AdapterRecyclerView(ArrayList<DataModel> model) {
       this.model = model;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View view) {
            super(view);
        }
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}