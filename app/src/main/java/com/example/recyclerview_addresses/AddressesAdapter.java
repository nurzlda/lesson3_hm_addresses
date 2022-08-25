package com.example.recyclerview_addresses;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AddressesAdapter extends RecyclerView.Adapter<AddressesViewHolder> {

    private ArrayList<String> addresses;

    public AddressesAdapter(ArrayList<String> addresses) {
        this.addresses = addresses;
    }

    @NonNull
    @Override
    public AddressesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AddressesViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_addresses, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AddressesViewHolder holder, int position) {
        holder.bind(addresses.get(position));
    }

    @Override
    public int getItemCount() {
        return addresses.size();
    }
}
