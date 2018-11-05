package com.curso.tarea3calendario.services;

import android.content.ContentValues;
import android.util.Log;

import com.curso.tarea3calendario.Database;
import com.curso.tarea3calendario.MainActivity;
import com.curso.tarea3calendario.modelo.Celebracion;
import com.curso.tarea3calendario.modelo.Evento;

import java.util.ArrayList;

public class RepositorioDatos {

    private static final RepositorioDatos instancia = new RepositorioDatos();
    Database db;
    public static RepositorioDatos getInstancia(){
        return instancia;
    }

    public ArrayList<Evento> obtenerEventosEnFecha(int dia, int mes, int year){
        ArrayList<Evento> list = new ArrayList<>();

        db = MainActivity.getDatabase();
        Log.d("db","dia:"+dia);
        Log.d("db","mes:"+mes);

        Log.d("db", ""+db.recuperaCelebracionesEnDiaMes(dia,mes));
        ArrayList<Celebracion> listCeleb = db.recuperaCelebracionesEnDiaMes(dia,mes);
        Log.d("Celeb",""+listCeleb);
        for (int i =0; i < listCeleb.size(); i++) {
            list.add(new Evento(listCeleb.get(i).getDescripción(),0,listCeleb.get(i).stringAMostrar(year)));
        }
        /* Retornar una   lista de los eventos para desplegar al usuario*/
        return list;

    }

    public void agregarFecha(String dia, String mes, String año, String descripcion){

        db.agregaCelebracion(dia,mes,año,descripcion);

    }




    public String numeroMesANombre(int mes){
        switch (mes){
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
                default: return "Mes no existe";
        }
    }

    /*Incluir funciones para la consulta a la base de datos*/

    /*Los datos ya deben estar procesados al momento en que llegan al usuario*/
}
