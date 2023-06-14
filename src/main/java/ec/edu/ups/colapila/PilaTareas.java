/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.colapila;

import java.util.Stack;

/**
 *
 * @author LAB-05
 */
public class PilaTareas<T> {

    private Stack<Tarea<T>> pilaTareas;

    public PilaTareas() {
        this.pilaTareas = new Stack<>();
    }

    public void agregarTarea(Tarea<T> tarea) {
        pilaTareas.push(tarea);
    }

    public Tarea<T> procesarTarea() {
        Tarea<T> tareaProcesada = pilaTareas.pop();
        return tareaProcesada;
    }

    public boolean estaVacia() {
        return pilaTareas.empty();
    }

}
