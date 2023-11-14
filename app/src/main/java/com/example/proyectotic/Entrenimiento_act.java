package com.example.proyectotic;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Entrenimiento_act extends AppCompatActivity {

    String[] items = {"Hora1", "Hora2", "Hora3", "Hora4"};

    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapter_items;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_entretenimiento);

        autoCompleteTextView = findViewById(R.id.games_txt);
        adapter_items = new ArrayAdapter<String>(this,R.layout.lista_items,items);
        autoCompleteTextView.setAdapter(adapter_items);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Item: " + item, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
