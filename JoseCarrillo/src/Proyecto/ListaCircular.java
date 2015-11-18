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
public class ListaCircular {
    public class ListasCirculares {

        private NodoDoble primero;

        public ListasCirculares() {
            this.primero = null;
        }

        public boolean esVacia() {
            if (primero == null) {
                return true;
            } else {
                return false;
            }
        }

        public void insertarElementos(Cliente dato) {
            NodoDoble nuevo = new NodoDoble(dato);
            if (esVacia()) {
                primero = nuevo;
                primero.siguiente = primero;
            } else {
                nuevo.siguiente = primero.siguiente;
                primero.siguiente = nuevo;
            }
        }

        
         public void eliminar(String dato){
         NodoDoble aux=primero;
         if(primero.siguiente==primero && primero.dato.getNombre().equals(dato)){
         primero.siguiente=null;
         primero=null;
         }else{
         if(aux.dato.getNombre().equals(dato)){
         eliminarcabecera();
         }else{
         while(aux.siguiente!=primero){
         if(aux.siguiente.dato.getNombre().equals(dato)){
         NodoDoble eliminar=aux.siguiente;
         aux.siguiente=aux.siguiente.siguiente;
         eliminar.siguiente=null;
         break;
         }
         aux=aux.siguiente;
         }
         }
         }
         }
         
        public void eliminarcabecera() {
            if (!esVacia()) {
                NodoDoble aux = primero;
                while (aux.siguiente != primero) {
                    aux = aux.siguiente;
                }
                primero = primero.siguiente;
                aux.siguiente = primero;
            }
            primero.siguiente = null;
            primero = null;
        }

        public void eliminarLista() {
            if (!esVacia()) {
                primero.siguiente = null;
                primero = null;
            }
        }

        public int Tamaño() {
            NodoDoble aux = primero;
            int cont = 0;
            if (!esVacia()) {
                cont++;
                while (aux.siguiente != primero) {
                    cont++;
                    aux = aux.siguiente;
                }
            }
            return cont;
        }

    }
}
