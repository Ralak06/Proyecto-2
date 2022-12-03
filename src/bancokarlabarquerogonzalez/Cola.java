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
public class Cola {

    NodoCola inicio, fin;
    int tama;

    public Cola() {
        inicio = fin = null;
        tama = 0;

    }

    public boolean estavacia() {
        return inicio == null;

    }

    public void insertar(int ele) {
        NodoCola nuevo = new NodoCola(ele);
        if (estavacia()) {
            inicio = nuevo;

        } else {
            fin.siguiente = nuevo;

        }
        fin = nuevo;
        tama++;

    }

    public int quitar() {
        int aux = inicio.dato;
        inicio = inicio.siguiente;
        tama--;
        return aux;
    }

    public int inicioCola() {
        return inicio.dato;

    }

    public int tamanioCola() {
        return tama;

    }

}
