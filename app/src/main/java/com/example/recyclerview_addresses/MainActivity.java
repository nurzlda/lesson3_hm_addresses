package com.example.recyclerview_addresses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> addresses = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);

        addresses.add("Улица Амавлянова(1)");
        addresses.add("Улица Амир-Тимур(5)");
        addresses.add("47-ая улица");
        addresses.add("Улица Аскара Шакирова(30)");
        addresses.add("9-ая улица Джим(1)");
        addresses.add("Улица Раимбекова ");
        addresses.add("Улица Шакирова А.");
        addresses.add("Улица Ленина");
        addresses.add("Улица Курманжан-Датка");
        addresses.add("Улица Алишера Навои");
        addresses.add("Улица Джим (9)");
        addresses.add("Улица Мырзалы Аматова, БЦ");
        addresses.add("Улица Гапара Айтиеева");
        addresses.add("Улица Масаслиева");


        AddressesAdapter adapter = new AddressesAdapter(addresses);
        recyclerView.setAdapter(adapter);
    }
}