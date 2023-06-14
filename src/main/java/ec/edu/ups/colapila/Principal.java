/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ec.edu.ups.colapila;

import java.lang.reflect.Array;

/**
 *
 * @author LAB-05
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Colas y Pilas implementación generica.");

        //Instanciar objetos ColaTarea
        ColaTarea<String> colaTarea = new ColaTarea<>();
        ColaTarea<Integer> colaTareaInt = new ColaTarea<>();
        ColaTarea<int[]> colaTareaArregloEntero = new ColaTarea<>();
        ColaTarea<String[]> colaTareaArregloString = new ColaTarea<>();

        //Instanciar objetos PilaTarea
        PilaTareas<Integer> pilaTarea = new PilaTareas<>();
        PilaTareas<ColaTarea> pilaTareaArreglo = new PilaTareas<>();

        //Ingreso (String)
        colaTarea.agregarTarea(new Tarea(1, "Tarea 1"));
        colaTarea.agregarTarea(new Tarea(2, "Tarea 2"));
        colaTarea.agregarTarea(new Tarea(3, "Tarea 3"));

        //Ingreso(Integer)
        pilaTarea.agregarTarea(new Tarea(4, 4));
        pilaTarea.agregarTarea(new Tarea(5, 5));
        pilaTarea.agregarTarea(new Tarea(6, 6));

        //Ingreso(Integer [])
        Tarea<int[]> t2 = new Tarea(8, new int[]{212, 21});
        colaTareaArregloEntero.agregarTarea(t2);
        colaTareaArregloEntero.agregarTarea(new Tarea(9, new int[]{212, 21}));

        while (!colaTarea.estaVacia()) {

            Tarea<String> tareaProcesada = colaTarea.procesarTarea();
            System.out.println("Procesando tarea de la cola \n\t Sale--> " + tareaProcesada.getId() + " - " + tareaProcesada.getAtributo());
        }

        System.out.println("\n----------");

        while (!pilaTarea.estaVacia()) {

            Tarea<Integer> tareaProcesada = pilaTarea.procesarTarea();
            System.out.println("Procesando tarea de la cola \n\t Sale--> " + tareaProcesada.getId() + " - " + tareaProcesada.getAtributo());

        }

        System.out.println("\n----------");

        while (!colaTareaArregloEntero.estaVacia()) {

            Tarea<int[]> tareaProcesada = colaTareaArregloEntero.procesarTarea();
            System.out.println("Procesando tarea de la cola \n\t Sale--> " + tareaProcesada.getId() + " - " + tareaProcesada.getAtributo());
        }

    }
}
