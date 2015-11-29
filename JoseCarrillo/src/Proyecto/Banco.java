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
public class Banco {
 
    ListaSimple listaTotal; 
    ListaSimple listaAtendiendo; 
    ListaSimple caja1;
    ListaSimple caja2;
    ListaSimple caja3;
    ListaSimple caja4;
    ListaSimple caja5;
    private String[] clientes = {"Juan", "Luis", "Maria", "Jenny", "Roberto", "Mariela"};
    private char[] prioridades = {'A', 'B', 'C', 'D'};
    int totalClientes = (int) (Math.random() * 100 + 20);
    
    
    public Banco() {
        listaTotal = new ListaSimple();
        listaAtendiendo = new ListaSimple();
        caja1 = new ListaSimple();
        caja2 = new ListaSimple();
        caja3 = new ListaSimple();
        caja4 = new ListaSimple();
        caja5 = new ListaSimple();
        generarClientes();
    }
    
    public void crear() {
        int tiempo = (int) ((Math.random() * 22) + 3);
        int cli = (int) (Math.random() * 5);
        int pri = (int) (Math.random() * 3);
        String nombre = clientes[cli];
        char prioridad = prioridades[pri];
        Cliente cliente = new Cliente(nombre, prioridad, tiempo);
        listaTotal.insertarInicio(cliente);
    }

   
    public void generarClientes() {
        
        for (int x = 0; x < totalClientes; x++) {
            crear();
        }
    }
    
    
}
