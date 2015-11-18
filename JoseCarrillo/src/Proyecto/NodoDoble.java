/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Cristiam
 */
public class NodoDoble {

     public Cliente dato;
    public NodoDoble siguiente;
    public NodoDoble anterior;

    public NodoDoble(Cliente dato) {
        this.dato = dato;
        siguiente = null;
        anterior = null;
    }

}

