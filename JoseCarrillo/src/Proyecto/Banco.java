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
    }

    /*
     * Retorna el siguiente cliente con la mayor prioridad de la
     * "listaAtendiendo", y borra este cliente de la "listaAtendiendo" en el proceso.
     */
    private Cliente getSig() {
        for (int i = 0; i < prioridades.length; i++) {
            char Char = prioridades[i];
            
            for (int j = 0; j < listaAtendiendo.size(); j++) {
                Cliente cliente = listaAtendiendo.get(j);
                
                if (cliente.getPrioridad() == Char){
                    listaAtendiendo.eliminarEntreNodos(j);
                    cliente.setSiguiente(null);
                    return cliente;
                }
            }
        }
        return null;
    }

    /*
     * Agrega un cliente de la listaAtendiendo a la lista del cajero1
     */
    private void agregarCajero1() {
        if (listaAtendiendo.size() != 0) {
            Cliente cliente = getSig();
            caja1.insertarInicio(cliente);
        }
    }

    /*
     * Agrega un cliente de la listaAtendiendo a la lista del cajero2
     */
    private void agregarCajero2() {
        if (listaAtendiendo.size() != 0) {
            Cliente cliente = getSig();
            caja2.insertarInicio(cliente);
        }
    }

    /*
     * Agrega un cliente de la listaAtendiendo a la lista del cajero3
     */
    private void agregarCajero3() {
        if (listaAtendiendo.size() != 0) {
            Cliente cliente = getSig();
            caja3.insertarInicio(cliente);
        }
    }

    /*
     * Agrega un cliente de la listaAtendiendo a la lista del cajero4
     */
    private void agregarCajero4() {
        if (listaAtendiendo.size() != 0) {
            Cliente cliente = getSig();
            caja4.insertarInicio(cliente);
        }
    }

    /*
     * Agrega un cliente de la listaAtendiendo a la lista del cajero5
     */
    private void agregarCajero5() {
        if (listaAtendiendo.size() != 0) {
            Cliente cliente = getSig();
            caja5.insertarInicio(cliente);
        }
    }

    /*
     * Retorna el siguiente cliente de la "listaTotal" la cual
     * contiene a los clientes con mayor prioridad.
     * Además borra este cliente de la "listaTotal" en el proceso.
     */
    private Cliente getSigPrioridad() {
        Cliente cliente = listaTotal.get(0);
        listaTotal.eliminarInicio();
        cliente.setSiguiente(null);
        return cliente;
    }

    /*
     * Calcula los datos "Clientes atendidos", "Tiempo total" y "Tiempo promedio"
     * Para la caja(ListaSimple) que resiva por parametro.
     * Luego devuelve estos datos en un String.
     */
    private String datosCaja(ListaSimple caja) {

        Cliente aux  = caja.get(0);;
        int tiempoT = 0;
        int size = caja.size();
        int i;

        for (i = 0; i < size; i++) {
            tiempoT += aux.getTiempo();
            aux = aux.getSiguiente();
        }
        String resultado = "Clientes atendidos: " + i + "\nTiempo total: " + tiempoT +" minutos"
                + "\nTiempo promedio: " + tiempoT / i+" minutos";
        System.out.println("Lista clientes");
        caja.mostrarLista();
        return resultado;
    }

    /*
     * Despliega el resultado obtenido por el programa en consola
     */
    private void mostrarResultado() {
        System.out.println("\nResultados obtenidos: ");
        System.out.println("Total de clientes que entraron en el banco: " + totalClientes);
        System.out.println("\nCaja1");
        System.out.println(datosCaja(caja1));
        System.out.println("\nCaja2");
        System.out.println(datosCaja(caja2));
        System.out.println("\nCaja3");
        System.out.println(datosCaja(caja3));
        System.out.println("\nCaja4");
        System.out.println(datosCaja(caja4));
        System.out.println("\nCaja5");
        System.out.println(datosCaja(caja5));
    }

    /*
     * Main del proyecto
     * Inicializa 1 contador por caja luego llena la "listaAtendiendo" con 20 clientes
     * Luego agrega un cliente a cada cajero y repite este proceso hasta
     * acabar con todos los clientes en la "listaAtendiendo" la cual esta constatemente
     * siendo cargada con más clientes de la "listaTotal"
     * Al final muestra todos los datos obtenidos
     */
    public void iniciar() {
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        
        while (listaAtendiendo.size() < 20) {
            Cliente cliente = getSigPrioridad();
            listaAtendiendo.insertarFinal(cliente);
        }
        agregarCajero1();
        agregarCajero2();
        agregarCajero3();
        agregarCajero4();
        agregarCajero5();
        
        while (!listaAtendiendo.esVacia()) {
            
            while (listaAtendiendo.size() < 20 && !listaTotal.esVacia()) {
                Cliente cliente = getSigPrioridad();
                listaAtendiendo.insertarFinal(cliente);
            }
            if (cont1 == caja1.get(0).getTiempo()) {
                cont1 = 0;
                agregarCajero1();
            }
            if (cont2 == caja2.get(0).getTiempo()) {
                cont2 = 0;
                agregarCajero2();
            }
            if (cont3 == caja3.get(0).getTiempo()) {
                cont3 = 0;
                agregarCajero3();
            }
            if (cont4 == caja4.get(0).getTiempo()) {
                cont4 = 0;
                agregarCajero4();
            }
            if (cont5 == caja5.get(0).getTiempo()) {
                cont5 = 0;
                agregarCajero5();
            }
            
            cont1++;
            cont2++;
            cont3++;
            cont4++;
            cont5++;
        }
        mostrarResultado();
    }
}
