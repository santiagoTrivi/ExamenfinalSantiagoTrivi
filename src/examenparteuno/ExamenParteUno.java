/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenparteuno;

import java.io.IOException;

/**
 *
 * @author Carvajal-Triviño
 */
// este es el codigo de la parte 1
class Nodo{
    int dato;
    Nodo sig, prev;
    Nodo(int dato){
        this.dato = dato;
    }
}
class listaEnlazada{
    Nodo inicio;
    Nodo ultimo;
    void insertar(int valor){
        Nodo nuevo = new Nodo(valor);
        if(inicio == null){
            inicio = nuevo;
            inicio.sig = inicio;
            inicio.prev = ultimo;
            ultimo = nuevo;
        }else{
            ultimo.sig = nuevo;
            nuevo.sig = inicio;
            nuevo.prev = ultimo;
            ultimo = nuevo;
            inicio.prev = ultimo;
        }
    }
    void mostrar(){
        Nodo aux = inicio;
        do {
            System.out.println(aux.dato);
            aux = aux.sig;
        } while (aux != inicio);
    }
    int cantidad(){
        if (ultimo == null){
            return 0;
        }
        Nodo auxUltimo = ultimo;
        int cant = 1;
        do {
            cant = cant + 1;
            auxUltimo = auxUltimo.prev;
        } while (auxUltimo != inicio);
        return cant;
    }
}
public class ExamenParteUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        System.out.println("---------------parte1: lista circular doblemente enlazada------------------");
        listaEnlazada lista = new listaEnlazada();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(5);
        lista.insertar(6);
        lista.insertar(52);
        lista.insertar(70);
        lista.insertar(20);
        lista.insertar(20);
        lista.mostrar();
        System.out.println(lista.ultimo.dato);
        
        int cantidadNodos = lista.cantidad();
        System.out.println("Cantidad de nodos en esta lista " + cantidadNodos);
        
        System.out.println("---------------parte2: comparacion de matrices------------------");
        matriz comparacion = new matriz();
        String url = "matriz1.txt"; // matriz que voy a crear o guardar
        String ur2 = "matriz2.txt"; // matriz que ya esta en la carpeta del projeto 
        int [][] cont = {{1,2,3,4,5},{6,7,8,9,10}}; // matris que quiero guardar
        int [][] cont3 = new int[2][4];
        int [][] cont4 = {{1,1,3,4,5},{6,7,8,9,10}};
        int[][] cont2 = new int[2][5];

        
        comparacion.guardarmatrix(cont, url); // gaurdando cualquier matrix
        comparacion.leerMatriz(cont2, url);
        System.out.println("comparando matriz1.txt con la matrix previamente cargada y otra matrix");
        boolean comp = comparacion.comparar(cont); // comparando si matrix leida de un archivo es igual a la matrix guarada 
        boolean co = comparacion.comparar(cont4); // comparando si la  otra matris leida es igual a la matris guarada
        System.out.println("respuesta: " + comp);
        System.out.println("respuesta: " + co);
        System.out.println("leyendo otra matriz y comparandola con otrar matriz");
        comparacion.leerMatriz(cont3, ur2);
        boolean comp2 = comparacion.comparar(cont4); // comparando si matrix leida de un archivo es igual a la matrix guarada 
        System.out.println(comp2);
        
        System.out.println("---------------parte3: lista simple------------------");

        ListaSimple listaS = new ListaSimple();
        listaS.insertar(1);
        listaS.insertar(2);
        listaS.insertar(3);
        listaS.insertar(4);
        listaS.insertar(5);
        listaS.insertar(6);
        listaS.insertar(52);
        listaS.insertar(70);
        listaS.insertar(20);
        listaS.insertar(20);
        listaS.mostrar();
        //listaS.modoinverso();
        System.out.println("---------------parte4:------------------");
        System.out.println("¿Cuál es el archivo que permite ignorar los cambios que se realicen sobre determinados archivos dentro de un repositorio?");
        System.out.println("Respuesta: .gitignore");
        System.out.println("---------------parte5:------------------");
        System.out.println("¿Cual es el comando que permite iniciar un repositorio de Git en cualquier carpeta?");
        System.out.println("Respuesta: git init, creando una carpeta oculta (.git) el cual es el repositorio git");
    }   
    
}
