import models.*;
import utils.BenchMarking;

import java.util.concurrent.Callable;

import controllers.SortPersonaMethods;
public class App {
    public static void main(String[] args) throws Exception {
        int[] samples = {10_000,50_000,100_000};
        
        for (int i = 0; i < samples.length; i++) {
            System.out.println("\n Tamaño "+samples[i] + " \n ");
            medirTiempos(generarPersonas(samples[i]),"Desordenado ");
            System.out.println("\n");
             medirTiempos(crearArregloIncrementado(generarPersonas(samples[i])), "Casi Ordenado + 1  ");
             
        }
        

    }
    public static Persona[] generarPersonas(int cantidad){
        Persona[] personas = new Persona[cantidad];
        for (int i = 0; i < cantidad; i++) {
            String nombre = "Persona" + (i+1);
            int edad = (int) (Math.random()*101);
            personas[i] = new Persona(nombre,edad);
        }
        return personas;
    }

    public static void medirTiempos(Persona[] personas, String escenario){
        SortPersonaMethods controller= new SortPersonaMethods();

        Persona[] copiaInsertion = personas.clone();
        Persona[] copiaQuick = personas.clone();

        Callable<Void> functionInsertion = ()->{
            controller.insertionSort(copiaInsertion);
            return null;            
        };

        Resultado rInsertion = BenchMarking.medirTiempo(functionInsertion,"Insertion",escenario,personas.length);
        System.out.println(rInsertion.getAlgoritmo()+ " = " + rInsertion);

        Callable<Void> functionQuick = ()->{
            controller.quickSort(copiaQuick, 0, copiaQuick.length-1);
            return null;            
        };

        Resultado rQuick1 = BenchMarking.medirTiempo(functionQuick,"QuickSort",escenario,personas.length);
        System.out.println(rQuick1.getAlgoritmo()+ " = " + rQuick1);

    }
    public static Persona[] crearArregloIncrementado(Persona[] personas){

        SortPersonaMethods controller= new SortPersonaMethods();

        controller.insertionSort(personas);
        Persona[] personasIncrementado = new Persona[personas.length+1];
        for (int i = 0; i < personas.length; i++) {
            personasIncrementado[i] = personas[i];
        }
        int edad = (int) (Math.random()*101);

        personasIncrementado[personas.length] = new Persona("Persona Agregada", edad);
       
        return personasIncrementado;
    }
}
