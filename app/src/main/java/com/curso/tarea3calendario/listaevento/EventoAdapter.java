package com.curso.tarea3calendario.listaevento;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.curso.tarea3calendario.R;
import com.curso.tarea3calendario.modelo.Evento;
import java.util.ArrayList;

public class EventoAdapter extends RecyclerView.Adapter<EventoViewHolder>{

   private ArrayList<Evento> eventos;

    public EventoAdapter(ArrayList<Evento> eventos){
        this.eventos=eventos;
    }

    public EventoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistaEvento = LayoutInflater.from(parent.getContext()).inflate(R.layout.info_evento,parent,false);
        return new EventoViewHolder(vistaEvento);
    }


    @Override
    public void onBindViewHolder(@NonNull EventoViewHolder holder, int position) {
        Evento event = eventos.get(position);
        holder.updateUI(event);
    }

    @Override
    public int getItemCount() {
        return eventos.size();
    }
}
