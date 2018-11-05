package com.curso.tarea3calendario.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.curso.tarea3calendario.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContentFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match


    // TODO: Rename and change types of parameters



    public ContentFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment ContentFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContentFragment newInstance() {
        ContentFragment fragment = new ContentFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_content, container, false);

        FragmentManager fm = getActivity().getSupportFragmentManager();
        CalendarioFragment calendar;
        CalendarioFragment calendar_landscape;
        InfoFragment infoFragment;
        boolean detaildate = false;

        if(getResources().getConfiguration().orientation==1){
            Log.d("XYZ",""+1);
            calendar = CalendarioFragment.newInstance();
            fm.beginTransaction().add(R.id.container_calendar_port,calendar).commit();
        }
        else{
            Log.d("XYZ",""+2);
            calendar_landscape = CalendarioFragment.newInstance();
            fm.beginTransaction().add(R.id.calendario_2,calendar_landscape).commit();
            infoFragment = InfoFragment.newInstance();
            fm.beginTransaction().add(R.id.info_land,infoFragment).commit();

        }


        // Inflate the layout for this fragment
        return v;
    }

}
