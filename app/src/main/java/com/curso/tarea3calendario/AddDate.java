package com.curso.tarea3calendario;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.curso.tarea3calendario.modelo.Celebracion;

import java.util.ArrayList;

public class AddDate extends AppCompatActivity {

    Spinner tipoFecha;
    ArrayAdapter<CharSequence> adaptador;
    TextView descripcion,fecha_in;

    Database db;

    EditText titulo,dia,mes,año;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_date_layout);

        db = MainActivity.getDatabase();

        tipoFecha = (Spinner) findViewById(R.id.tipo_spinner);
        adaptador = ArrayAdapter.createFromResource(this, R.array.tipo_array, android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tipoFecha.setAdapter(adaptador);

        titulo = findViewById(R.id.input_descrip);
        dia = findViewById(R.id.fecha_input);
        mes = findViewById(R.id.fecha_input3);
        año = findViewById(R.id.fecha_input4);

        tipoFecha.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                String item = parent.getItemAtPosition(position).toString();
                descripcion = (TextView) findViewById(R.id.input_descrip);

                //Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

                if (item.equals("Cumpleaños")){
                    descripcion.setHint("Nombre del cumpleañero(a)");
                } else {
                    descripcion.setHint("Ingrese un Título");
                }
            }

            public void onNothingSelected(AdapterView<?> parentView){

            }
        });
    }
    public void agregarfecha(View v){

        db.abre();

        db.agregaCelebracion(dia.getText().toString(),mes.getText().toString(),año.getText().toString(),titulo.getText().toString());

        db.cierra();

        DisplayToast("Celebracion agregada");
        startActivity(new Intent("android.intent.action.MAIN"));

    }

    private void DisplayToast(String mensaje) {
        Toast.makeText(getBaseContext(), mensaje, Toast.LENGTH_SHORT).show();
    }
}
