package com.jorgesoasti.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity {

    double latitud;
    double longitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irAMapaCotopaxi(View v){

        latitud = -0.6833442923452632;
        longitud = -78.43945400264897;

        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("lugar", "Cotopaxi");
        i.putExtra("descrip", "Volcan activo");
        i.putExtra("latitud", latitud);
        i.putExtra("longitud", longitud);
        startActivity(i);
    }

    public void irAMapaGalapagos(View v){

        latitud = -0.6238674980520243;
        longitud = -90.36987678554692;

        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("lugar","Galapagos");
        i.putExtra("descrip", "Islas encantadas");
        i.putExtra("latitud", latitud);
        i.putExtra("longitud", longitud);
        startActivity(i);
    }

    public void irAMapaMitadMundo(View v){

        latitud = -0.002208149438835428;
        longitud = -78.45587448623814;

        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("lugar","Mitad del Mundo");
        i.putExtra("descrip", "El centro del mundo");
        i.putExtra("latitud", latitud);
        i.putExtra("longitud", longitud);
        startActivity(i);
    }

    public void irAMapaPanecillo(View v){

        latitud = -0.22891857517063832;
        longitud = -78.51857380417027;

        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("lugar","El Panecillo");
        i.putExtra("descrip", "La Virgen del Panecillo");
        i.putExtra("latitud", latitud);
        i.putExtra("longitud", longitud);
        startActivity(i);
    }
}
