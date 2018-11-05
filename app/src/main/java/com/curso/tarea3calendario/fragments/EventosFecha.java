package com.curso.tarea3calendario.fragments;


import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.curso.tarea3calendario.R;
import com.curso.tarea3calendario.listaevento.EventoAdapter;
import com.curso.tarea3calendario.modelo.Celebracion;
import com.curso.tarea3calendario.modelo.Evento;
import com.curso.tarea3calendario.services.RepositorioDatos;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EventosFecha#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EventosFecha extends Fragment {
    private int day;
    private int month;
    private int year;
    TextView fechaTextView;
    public EventosFecha() {

    }

    public static EventosFecha newInstance(int day,int month, int year) {
        EventosFecha fragment = new EventosFecha();
        Bundle args = new Bundle();
        args.putInt("day",day);
        args.putInt("month",month);
        args.putInt("year",year);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("wololo", "on create");
        Log.d("getArguments", ""+getArguments());
        if (getArguments() != null) {

            Bundle args = getArguments();
            this.day = args.getInt("day");
            this.month = args.getInt("month");
            this.year = args.getInt("year");
            Log.d("wololo", ""+day+" "+month+" "+year);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

                //Eventos de prueba
        ArrayList<Evento> testEvento = new ArrayList<>();
        testEvento = RepositorioDatos.getInstancia().obtenerEventosEnFecha(day,month,year);

        //testEvento.add(new Evento("Cumple Camilo",1,"cumple 22"));
        //testEvento.add(new Evento("Dia de la pizza",2,"Que no falte el pepperoni"));
        Log.d("wololo",""+testEvento.size());


        View v = inflater.inflate(R.layout.fragment_eventos_fecha, container, false);
        fechaTextView = v.findViewById(R.id.evento_fecha_top);
        TextView vacio = v.findViewById(R.id.evento_fecha_vacio);
        fechaTextView.setText("Efemérides "+this.day+" de "+RepositorioDatos.getInstancia().numeroMesANombre(this.month)+".");
        RecyclerView recyclerView =(RecyclerView) v.findViewById(R.id.eventos_recyclerview);

        EventoAdapter adapter;
        adapter = new EventoAdapter(testEvento);
        recyclerView.setAdapter(adapter);
        if(adapter.getItemCount()>0){
            vacio.setVisibility(View.INVISIBLE);

        }
        else{
            vacio.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.INVISIBLE);
        }



        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(),layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

        return v;
    }

}
