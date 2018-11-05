package com.curso.tarea3calendario.modelo;

import android.util.Log;

public class Celebracion {
    private int day;
    private int month;
    private int year;
    private String descripción;

    public Celebracion(int day, int month, int year, String descripción) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.descripción = descripción;
    }

    public Celebracion(int day, int month, String descripción) {
        this.day = day;
        this.month = month;
        this.year = -99;
        this.descripción = descripción;
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String stringAMostrar(int yearQuery){
        if(year != -99){
            Log.d("Transform",""+year);
            Log.d("Transform",""+yearQuery);
            int aux = yearQuery - year;
            return "Celebración número "+aux;
        }
        else return " ";
    }
}
