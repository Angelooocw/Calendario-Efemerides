package com.curso.tarea3calendario.modelo;

public class Evento {
    private String titulo;
    private int tipo;
    private String texto;

    public Evento(String titulo, int tipo, String texto) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
