package com.example.recyclerview_addresses;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddressesViewHolder extends RecyclerView.ViewHolder {

    private TextView tvAddresses;

    public AddressesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvAddresses = itemView.findViewById(R.id.tv_addresses);
    }

    public void bind(String addresses){
        tvAddresses.setText(addresses);
    }

}
