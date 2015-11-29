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
    private char prioridad;
    private int tiempo;

    public Cliente siguiente;

    //contructor 
    public Cliente(String nombre, char prioridad, int tiempo) {

        this.nombre = nombre;
        this.prioridad = prioridad;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public char getPrioridad() {
        return prioridad;
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

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Cliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cliente siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return nombre + "" + prioridad + "" + tiempo;
    }
}
