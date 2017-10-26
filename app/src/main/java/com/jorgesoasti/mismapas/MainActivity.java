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

/******
 public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

 GoogleMap m_map;
 boolean mapReady = false;

 MarkerOptions renton;
 MarkerOptions everett;
 MarkerOptions montlake;

 LatLng rentonLL = new LatLng(40.7584,-73.9957);
 LatLng everettLL = new LatLng(40.8384,-73.9757);
 LatLng montlakeLL = new LatLng(40.7284,-73.9657);

 static final CameraPosition TOKIO = CameraPosition.builder()
 .target(new LatLng(35.6895,139.6917))
 .zoom(17)
 .bearing(90)
 .tilt(45)
 .build();

 static final CameraPosition NEWYORK = CameraPosition.builder()
 .target(new LatLng(40.784,-73.9857))
 .zoom(21)
 .bearing(0)
 .tilt(45)
 .build();

 static final CameraPosition SEATTLE = CameraPosition.builder()
 .target(new LatLng(47.6204,-122.3491))
 .zoom(17)
 .bearing(0)
 .tilt(45)
 .build();

 static final CameraPosition DUBLIN = CameraPosition.builder()
 .target(new LatLng(53.3478,6.2597))
 .zoom(17)
 .bearing(90)
 .tilt(45)
 .build();

 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);

 renton = new MarkerOptions()
 .position(new LatLng(40.7584,-73.9957))
 .title("Renton")
 .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher));

 everett = new MarkerOptions()
 .position(new LatLng(40.7384,-73.9757))
 .title("Everett")
 .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher));

 montlake = new MarkerOptions()
 .position(new LatLng(40.7284,-73.9657))
 .title("Montlake")
 .icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher));


 //TIPOS DE MAPAS: NORMAL, SATELITE, HYBRID
 Button btnMap = (Button) findViewById(R.id.btnMap);
 btnMap.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 if(mapReady)
 m_map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
 }
 });

 Button btnSatelite = (Button) findViewById(R.id.btnSatelite);
 btnSatelite.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 if(mapReady)
 m_map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
 }
 });

 Button btnHybrid = (Button) findViewById(R.id.btnHibrid);
 btnHybrid.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 if(mapReady)
 m_map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
 }
 });

 MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
 mapFragment.getMapAsync(this);

 /***VOLAR A ALGUN LUGAR CON ANIMACION DE CAMARA
 Button btnSeattle = (Button) findViewById(R.id.btnSeattle);
 btnSeattle.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 if(mapReady)
 flyTo(SEATTLE);
 }
 });

 Button btnTokio = (Button) findViewById(R.id.btnTokio);
 btnTokio.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 if(mapReady)
 flyTo(TOKIO);
 }
 });

 Button btnDublin = (Button) findViewById(R.id.btnDublin);
 btnDublin.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 if(mapReady)
 flyTo(DUBLIN);
 }
 });
 **/

/**
    }

@Override
public void onMapReady(GoogleMap googleMap) {
        //TIPOS DE MAPAS: NORMAL, SATELITE, HYBRID
        mapReady=true;
        m_map = googleMap;
        LatLng newYork = new LatLng(40.7484,-73.9857);
        CameraPosition target = CameraPosition.builder().target(newYork).zoom(15).build();
        m_map.moveCamera(CameraUpdateFactory.newCameraPosition(target));

        //Markers
        m_map.addMarker(renton);
        m_map.addMarker(everett);
        m_map.addMarker(montlake);

        //Polyline
        m_map.addPolyline(new PolylineOptions().geodesic(true)
        .add(rentonLL)
        .add(everettLL)
        .add(montlakeLL)
        .add(rentonLL));

        //Circle
        m_map.addCircle(new CircleOptions()
        .center(rentonLL)
        .radius(5000)
        .strokeColor(Color.GREEN)
        .fillColor(Color.argb(64,0,255,0)));

        //VOLAR A ALGUN LUGAR CON ANIMACION DE CAMARA
        /*
        mapReady=true;
        m_map = googleMap;
        m_map.moveCamera(CameraUpdateFactory.newCameraPosition(NEWYORK));
        m_map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        flyTo(NEWYORK);
        */
        }
/**
private void flyTo(CameraPosition target){
        m_map.animateCamera(CameraUpdateFactory.newCameraPosition(target), 10000, null);
        }
        }


        ******/
