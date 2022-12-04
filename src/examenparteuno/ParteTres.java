/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenparteuno;

/**
 *
 * @author Carvajal-Triviño
 */
class Node{
    int dato;
    Node sig;
    Node(int dato){
        this.dato = dato;
    }
}
class ListaSimple {

    Node inicio;
    int cont;
        
    public ListaSimple(){
        inicio = null;
        cont = 0;
    }
    boolean isEmpty(){
        return this.inicio == null; 
    }
        
    void insertar(int item){
        Node loNuevo = new Node(item);
        if (inicio == null){ 
                inicio = loNuevo; 
        }else{
            Node aux = inicio;
            while (aux.sig != null){
                aux = aux.sig;
            }
            aux.sig = loNuevo;
        }
        cont += 1;
            
    }
        
    void mostrar(){
        Node aux = inicio;
        while(aux != null){
            System.out.println(aux.dato);
            aux = aux.sig;
        }
        
    }
    void motrarultimo(){
        Node aux = inicio;
        while(aux.sig != null){
            aux = aux.sig;
        }
        System.out.println(aux.dato);
    }
    
    void eliminar(int item){
        Node aux = inicio;
        Node prev = null;
        while(aux.dato != item){
            prev = aux;
            aux = aux.sig;
        }
        prev.sig = aux.sig;
        cont -= 1;
    }
    Node sacar(){
        if(inicio == null){
            System.out.println("Lista Vacia");
            return null;
        }else{
            Node aux = inicio;
            //Nodo prev = null;
            while(aux.sig.sig != null){
                aux = aux.sig;
            }
            Node temp = aux.sig;
            aux.sig = null;
            return temp;
        }
    }
    
    int logitud(){
        return cont;
    }
    
    void anexar(int position, int item){
        Node loNuevo = new Node(item);
        int counterPosition = 0;
        Node aux = inicio;
        Node prev = null;
        while (counterPosition < position ){
            counterPosition += 1;
            prev = aux;
            aux = aux.sig;
        }
        prev.sig = loNuevo;
        loNuevo.sig = aux;
    }

    void modoinverso(){ // respuesta uno
        if(!isEmpty()){
            int n = this.sacar().dato; // metodo para obtener el ultino elemento
            this.modoinverso(); // llamada del metodo recursivo
            this.insertar(n);
        }
        this.mostrar(); // metodo mostrar
    }

 
     
}
public class ParteTres {
    
}
