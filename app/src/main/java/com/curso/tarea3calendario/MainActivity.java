package com.curso.tarea3calendario;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.curso.tarea3calendario.fragments.ContentFragment;
import com.curso.tarea3calendario.fragments.EventosFecha;
import com.curso.tarea3calendario.services.RepositorioDatos;

public class MainActivity extends AppCompatActivity {

    private static Database db;

    private static MainActivity mainActivity;

    public static Database getDatabase(){
        return db;
    }

    public static MainActivity getMainActivity() {
        return mainActivity;
    }
    private static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new Database(this);

        //muestrafechas();
        mainActivity.setMainActivity(this);

        FragmentManager fm = getSupportFragmentManager();
        Fragment contentFragment =  fm.findFragmentById(R.id.container_main);

        if(contentFragment==null){
            Log.d("FragmentNew","Nuevo fragment creado");
            contentFragment = ContentFragment.newInstance();
            fm.beginTransaction().
                    add(R.id.container_main,contentFragment).commit();

        }

        Log.d("Orientation", ""+getResources().getConfiguration().orientation);

    }

    public void muestrafechas(){
        db.abre();
        Cursor c = db.recuperaCelebracion();
        if (c.moveToFirst()) {
            do {
                MuestraFecha(c);
            } while(c.moveToNext());
        }
        else {
            DisplayToast("Base de datos Contactos está vacía");
        }
        c.close();
        db.cierra();
    }

    public void MuestraFecha(Cursor c) {
        DisplayToast("id: " + c.getString(0) + "\n" +
                "dia: " + c.getString(1) + "\n" +
                "mes: " + c.getString(2) + "\n" +
                "año: " + c.getString(3) + "\n" +
                "descripcion: " + c.getString(4));
    }

    private void DisplayToast(String mensaje) {
        Toast.makeText(getBaseContext(), mensaje, Toast.LENGTH_SHORT).show();
    }
    public void cargarEventosEnFecha(int dia, int mes, int year){

        if(getResources().getConfiguration().orientation==1){
            getSupportFragmentManager().beginTransaction().
                    replace(R.id.container_main,EventosFecha.newInstance(dia,mes,year)).
                    addToBackStack(null).commit();
        }

        else{
            getSupportFragmentManager().beginTransaction().
                    replace(R.id.info_land,EventosFecha.newInstance(dia,mes,year)).
                    addToBackStack(null).commit();
        }

    }

    public void agregar(View v){
        startActivity(new Intent("agregar"));
    }

}
