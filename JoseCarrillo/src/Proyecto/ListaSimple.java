/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Jose Carrillo
 */
public class ListaSimple {

    private Cliente nodo;

    public ListaSimple() {
        this.nodo = null;
    }

    //verifica si la lista esta vacia o no
    public boolean esVacia() {
        if (nodo == null) {
            return true;
        }
        return false;
    }

    //inserta un nodo  
    public void insertarInicio(Cliente cliente) {
        Cliente nuevo = cliente;
        if (esVacia()) {
            nodo = nuevo;
        } else {
            nuevo.setSiguiente(nodo);
            nodo = nuevo;
        }
    }

    
    public void insertarFinal(Cliente cliente) {
        Cliente nuevo = cliente;
        if (esVacia()) {
            nodo = nuevo;
        } else {
            Cliente aux = nodo;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public void eliminaFin() {
        if (!esVacia()) {
            Cliente aux = nodo;
            while (aux.getSiguiente().getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(null);
        }
    }

    public void eliminarEntreNodos(int pos) {
        if (!esVacia()) {
            Cliente aux = nodo;
            Cliente aux2 = aux;
            int size = size();
            int pos_recorrido = 0;
            if (pos == 0) {
                eliminarInicio();
            } else if (pos == size) {
                eliminaFin();
            } else if (pos > 0 && pos < size) {
                while (pos_recorrido != pos) {
                    aux2 = aux;
                    aux = aux.getSiguiente();
                    pos_recorrido++;
                }
                aux2.setSiguiente(aux.getSiguiente());
            }
        }
    }

    public void eliminarInicio() {
        if (!esVacia()) {
            nodo = nodo.getSiguiente();
        }
    }

    public int size() {
        Cliente aux = nodo;
        int cont = 0;
        if (!esVacia()) {
            cont++;
            while (aux.getSiguiente() != null) {
                cont++;
                aux = aux.getSiguiente();
            }
        }
        return cont;
    }

    public Cliente get(int posicion) {
        Cliente aux = nodo;
        int contador = 0;
        while (contador != posicion) {
            aux = aux.getSiguiente();
            contador++;
        }
        return aux;
    }

    public void mostrarLista() {
        Cliente aux = nodo;
        if (!esVacia()) {
            while (aux.getSiguiente() != null) {
                System.out.println(aux.getNombre() + ", " + aux.getTiempo()
                        + ", " + aux.getPrioridad());
                aux = aux.getSiguiente();
            }
        }
    }
}