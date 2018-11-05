package com.curso.tarea3calendario.listaevento;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.curso.tarea3calendario.R;
import com.curso.tarea3calendario.modelo.Evento;

public class EventoViewHolder extends RecyclerView.ViewHolder{

    private TextView tituloEvento;
    private TextView descripcion;

    public EventoViewHolder(View itemView) {
        super(itemView);
        this.tituloEvento = (TextView) itemView.findViewById(R.id.item_tituloevento);
        this.descripcion = (TextView) itemView.findViewById(R.id.item_descripcion);
    }

    public void updateUI(Evento event){
        tituloEvento.setText(event.getTitulo());
        descripcion.setText(event.getTexto());
        if(event.getTexto()==" "){
            
        }
    }
}
