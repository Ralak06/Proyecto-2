/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancokarlabarquerogonzalez;

/**
 *
 * @author Karla
 */
public class NodoCola {
    int dato;
    NodoCola siguiente;
    public NodoCola(int d){
        dato=d;
        siguiente=null;
        
        
        
    }

    public NodoCola(int dato, NodoCola siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
    
}
