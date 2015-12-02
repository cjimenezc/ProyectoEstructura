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

    //Declaracion de variables
    ListaSimple listaTotal; //Contiene los 20-120 clientes aleatorios
    ListaSimple listaAtendiendo; //Contiene más 20 clientes por prioridad
    ListaSimple caja1;
    ListaSimple caja2;
    ListaSimple caja3;
    ListaSimple caja4;
    ListaSimple caja5;
    private String[] clientes = {"Juan", "Luis", "Maria", "Jenny", "Roberto", "Mariela"};
    private char[] prioridades = {'A', 'B', 'C', 'D'};
    private int totalClientes = (int) (Math.random() * (121-20)+20);

    //Constructur inicializacion de variables
    public Banco() {
        listaTotal = new ListaSimple();
        listaAtendiendo = new ListaSimple();
        caja1 = new ListaSimple();
        caja2 = new ListaSimple();
        caja3 = new ListaSimple();
        caja4 = new ListaSimple();
        caja5 = new ListaSimple();
        
        generarClientes();
        
        //Muestra listaTotal de clientes
         System.out.println("Lista total de clientes: ");
         listaTotal.mostrarLista(); 
    }

    /*
     * crea un cliente con atributos (tiempo, nombre, prioridad) aleatorias
     * y lo inserta en la listaTotal
     */
    public void crear() {
        int tiempo = (int) (Math.random() * (26-5)+5);
        int cli = (int) (Math.random() * 6);
        int pri = (int) (Math.random() * 4);
        String nombre = clientes[cli];
        char prioridad = prioridades[pri];
        Cliente cliente = new Cliente(nombre, prioridad, tiempo);
        listaTotal.insertarInicio(cliente);
    }

    /*
     * crea entre 20-120 clientes utilizando la variable totalClientes
     * la cual fue inicializada con un random de 20-120
     */
    public void generarClientes() {

        for (int x = 0; x < totalClientes; x++) {
            crear();
        }
    }   }
