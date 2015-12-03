/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Jose Carrillo Mendez
 * @author Cristiam Jimenez Chacon
 */
public class Cliente {

    //Variables
    private String nombre;
    private char prioridad;
    private int tiempo;

    private Cliente siguiente;

    //Contructor 
    public Cliente(String nombre, char prioridad, int tiempo) {

        this.nombre = nombre;
        this.prioridad = prioridad;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(char prioridad) {
        this.prioridad = prioridad;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
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
