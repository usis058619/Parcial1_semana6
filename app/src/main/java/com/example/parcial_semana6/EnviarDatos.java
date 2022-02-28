package com.example.parcial_semana6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnviarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_datos);

        final EditText eNombre = (EditText)findViewById(R.id.etNombre);
        final  EditText eEdad = (EditText)findViewById(R.id.etEdad);
        Button EnviarDatos = (Button) findViewById(R.id.btEnviarDatos);

        EnviarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = eNombre.getText().toString();
                String edad = eEdad.getText().toString();
                Bundle pasarDatos = new Bundle();
                pasarDatos.putString("pNombre", nombre);
                pasarDatos.putString("pEdad", edad);
                Intent siga = new Intent(EnviarDatos.this, RecibirDatos.class);
                siga.putExtras(pasarDatos);
                startActivity(siga);
            }
        });
    }
}