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

    //Insertar un nodo al inicio de la lista simple
    public void insertarInicio(Cliente cliente) {
        Cliente nuevo = cliente;
        if (esVacia()) {
            nodo = nuevo;
        } else {
            nuevo.setSiguiente(nodo);
            nodo = nuevo;
        }
    }

    //Insertar un nodo al final de la lista simple
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

    //Eliminar el ultimo nodo de la lista simple
    public void eliminaFin() {
        if (!esVacia()) {
            Cliente aux = nodo;
            while (aux.getSiguiente().getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(null);
        }
    }

    //Eliminar un nodo entre nodos de la lista simple
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

    //Eliminar el nodo del inicio de la lista simple
    public void eliminarInicio() {
        if (!esVacia()) {
            nodo = nodo.getSiguiente();
        }
    }

    //Tamaño de la lista simple
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

    //imprimi la lista simple
    public void mostrarLista() {
        Cliente aux = nodo;
        if (!esVacia()) {
            while (aux != null) {
                System.out.println("Nombre: " + aux.getNombre() + ", Tiempo: " + aux.getTiempo()
                        + " minutos" + ", Prioridad: " + aux.getPrioridad());
                aux = aux.getSiguiente();
            }
        }
    }
}
