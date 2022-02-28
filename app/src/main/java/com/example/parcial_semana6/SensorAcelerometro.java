package com.example.parcial_semana6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class SensorAcelerometro extends AppCompatActivity {
    SensorManager sensorManager;
    Sensor sensor;
    SensorEventListener sensorEventListener;
    int whip = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_acelerometro);
        Button bVolver5 = (Button)findViewById(R.id.bVolver5);
        bVolver5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vuelva = new Intent(SensorAcelerometro.this,Menu.class);
                startActivity(vuelva);
            }
        });

        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        final TextView sonido = (TextView)findViewById(R.id.tvSonido);
        if(sensor == null)
            finish();

        sensorEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                float x = sensorEvent.values[0];
                System.out.println("valor giro"+x);
                if (x < -5 && whip == 0) {
                    whip++;
                    getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                } else if (x > 5 && whip == 1) {
                    whip++;
                    getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                }
                if (whip == 2) {
                    sound();
                    whip = 0;
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };
        start();
    }
    private void sound(){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.latigo);
        mediaPlayer.start();
    }
    private void start(){

        sensorManager.registerListener(sensorEventListener,sensor,SensorManager.SENSOR_DELAY_NORMAL);
    }

    private void stop(){
        sensorManager.unregisterListener(sensorEventListener);
    }
    protected void onPause() {
        stop();
        super.onPause();
    }
    @Override
    protected void onResume() {
        start();
        super.onResume();
    }
}