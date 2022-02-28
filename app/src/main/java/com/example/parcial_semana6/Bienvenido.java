package com.example.parcial_semana6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bienvenido extends AppCompatActivity {
    Button Siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);
        Siguiente = (Button) findViewById(R.id.btSiguiente);

        Siguiente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                Intent packageContext;
                Intent i = new Intent(Bienvenido.this, Menu.class);
                startActivity(i);

            }
        });
    }
}