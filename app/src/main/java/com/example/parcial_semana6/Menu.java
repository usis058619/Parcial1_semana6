package com.example.parcial_semana6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button EnviarDatos , Tabs , SensorProximidad ,  SensorAcelerometro , Musica , ReproductorVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        EnviarDatos = (Button) findViewById(R.id.btEnviarDatos);
        Tabs = (Button) findViewById(R.id.btTabs);
        SensorProximidad = (Button) findViewById(R.id.btSensorProximidad);
        Musica = (Button) findViewById(R.id.btMusica);
        SensorAcelerometro = (Button) findViewById(R.id.btSensorAcelerometro);
        ReproductorVideo = (Button) findViewById(R.id.btReproductorVideo);


        EnviarDatos.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {


                Intent packageContext;
                Intent i = new Intent(Menu.this, EnviarDatos.class);
                startActivity(i);
            }
        });
        Tabs.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {


                Intent packageContext;
                Intent i = new Intent(Menu.this, Tabs.class);
                startActivity(i);
            }
        });
        SensorProximidad.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                Intent packageContext;
                Intent i = new Intent(Menu.this, SensorProximidad.class);

                startActivity(i);
            }
        });
        SensorAcelerometro.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                Intent packageContext;
                Intent i = new Intent(Menu.this, SensorAcelerometro.class);
                startActivity(i);
            }
        });
        Musica.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                Intent packageContext;
                Intent i = new Intent(Menu.this, Musica.class);
                startActivity(i);
            }
        });
        ReproductorVideo.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                Intent packageContext;
                Intent i = new Intent(Menu.this, ReproductorVideo.class);
                startActivity(i);
            }
        });
    }
}
