package com.curso.tarea3calendario.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;

import com.curso.tarea3calendario.AddDate;
import com.curso.tarea3calendario.MainActivity;
import com.curso.tarea3calendario.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CalendarioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CalendarioFragment extends Fragment {

    CalendarView calendario;
    Button addFecha;

    // TODO: Rename and change types of parameters


    public CalendarioFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment CalendarioFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CalendarioFragment newInstance() {
        CalendarioFragment fragment = new CalendarioFragment();
        Log.d("NEW","calendar created");
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_calendario, container, false);
        // Inflate the layout for this fragment

        this.calendario =  (CalendarView) v.findViewById(R.id.calendario_id);
        calendario.setMaxDate(1815364800000L);
        calendario.setMinDate(946695600000L);

        calendario.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                Log.d("Date", ""+ dayOfMonth+ "-" + month+"-"+year );
                MainActivity.getMainActivity().cargarEventosEnFecha(dayOfMonth,month+1,year);

            }
        });

        this.addFecha = (v.findViewById(R.id.add_date_btn));
        addFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),AddDate.class));
            }
        });

        //

        return v;
    }
}
