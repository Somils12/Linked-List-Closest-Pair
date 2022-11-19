/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.distanciamin_simplelist;

/**
 *
 * @author Somils
 */
public class ListaSimple {

    Nodo head;
    int tam;

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    static class Nodo {

        punto data;
        Nodo next;

        // Constructor
        Nodo(punto d) {

            data = d;
            next = null;
        }
    }

    public static ListaSimple insertar(ListaSimple list, punto data) {
        Nodo nuevo_nodo = new Nodo(data);
        nuevo_nodo.next = null;
        if (list.head == null) {
            list.head = nuevo_nodo;
        } else {
            Nodo last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = nuevo_nodo;
        }
        list.tam = list.tam + 1;
        return list;
    }

    public static void imprimir(ListaSimple list) {
        Nodo nodoActual = list.head;
        System.out.print("La lista es: ");
        while (nodoActual != null) {
            System.out.print(nodoActual.data + " ");
            nodoActual = nodoActual.next;
        }
        System.out.println();
    }

    public static ListaSimple eliminar(ListaSimple list, punto dato) {
        Nodo nodoActual = list.head, prev = null;
        if (nodoActual != null && nodoActual.data == dato) {
            list.head = nodoActual.next; // Changed head
            System.out.println(dato + " fue eliminado");
            return list;
        }
        while (nodoActual != null && nodoActual.data != dato) {
            prev = nodoActual;
            nodoActual = nodoActual.next;
        }
        if (nodoActual != null) {
            prev.next = nodoActual.next;

            System.out.println(dato + " fue eliminado");
            list.tam = list.tam - 1;
        }
        if (nodoActual == null) {
            System.out.println(dato + " no encontrado");
        }
        return list;
    }

    /*   public static void main(String[] args) {
        ListaSimple list = new ListaSimple();
           list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        printList(list);

        delete(list, 1);
        printList(list);
         
}*/
}
