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
public class Cola {
    public Cliente dato;

    public Cola siguiente;
    private Cola top;
    private Cola ultimo;

    public Cola(Cliente dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Cola() {
        top = ultimo = null;
    }

    public boolean esVacia() {
        return (top == null);
    }

    public void encolar(Cliente dato) {
        Cola temp = new Cola(dato);
        if (esVacia()) {
            top = ultimo = temp;
        } else {
            ultimo.siguiente = temp;
            ultimo = temp;
        }
        System.out.println("ingresado: " + ultimo.dato);
    }

    public void desencolar() {
        if (esVacia()) {
            System.out.println("Error al desencolar");
        } else {
            top = top.siguiente;
        }
    }

    public void print() {
        Cola aux = top;
        System.out.println("\n Cola:");
        while (aux != null) {
            System.out.println(aux.dato);
            aux = aux.siguiente;
        }
    }

    public int size() {
        Cola aux = top;
        int contador = 0;
        while (aux != null) {
            contador++;
            aux = aux.siguiente;
        }
        return contador;
    }

    public Cola get(int posicion) {
        Cola aux = top;
        int contador = 0;
        while (contador != posicion) {
            aux = aux.siguiente;
            contador++;
        }
        return aux;
    }
}
