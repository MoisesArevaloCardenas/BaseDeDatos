/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.colapila;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author LAB-05
 */
public class ColaTarea<T> {

    private Queue<Tarea<T>> colaTareas;

    public ColaTarea() {
        colaTareas = new LinkedList<>();
    }

    public void agregarTarea(Tarea<T> tarea) {
        colaTareas.offer(tarea);

    }

    public Tarea<T> procesarTarea() {
        Tarea<T> tareaProcesada = colaTareas.poll();
        return tareaProcesada;
    }

    public boolean estaVacia() {
        return colaTareas.isEmpty();
    }

}
