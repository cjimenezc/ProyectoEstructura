/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Carrillo
 */
public class Cliente {
    private String nombre;
    public char prioridad;
    private int fila;
    private int tiempo;

    public Cliente(String nombre, char prioridad, int fila, int tiempo) {

        this.nombre = nombre;
        this.prioridad = prioridad;
        this.fila = fila;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public char getPrioridad() {
        return prioridad;
    }

    public int getFila() {
        return fila;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrioridad(char prioridad) {
        this.prioridad = prioridad;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return nombre + "" + prioridad + "" + fila + "" + tiempo;
    }

}
