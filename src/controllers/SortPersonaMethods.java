package controllers;
import models.Persona;
public class SortPersonaMethods {
    
    public void insertionSort (Persona[] personas){
        for (int i = 1; i < personas.length; i++) {
            Persona aux = personas[i];
            
            int j = i;

            while (j > 0 && personas[j - 1].getCriterioOrdenamiento() > aux.getCriterioOrdenamiento()) {
                personas[j] = personas[j - 1];
                j--;
            }

            personas[j] = aux;
        }
    }
    
    public void quickSort(Persona[] personas, int inicio, int fin) {
    while (inicio < fin) {
        int indicePivote = particionar(personas, inicio, fin);

       // Evalúa qué mitad es más pequeña para procesarla primero 
        if (indicePivote - inicio < fin - indicePivote) {
            quickSort(personas, inicio, indicePivote - 1);
            inicio = indicePivote + 1;
        } else {
            quickSort(personas, indicePivote + 1, fin);
            fin = indicePivote - 1; 
        }
    }
}

    private int particionar(Persona[] personas,int inicio,int fin){
        Persona pivote = personas[fin];
        int i = inicio-1;
        for (int j = inicio; j < fin; j++) {
            if (personas[j].getCriterioOrdenamiento() <= pivote.getCriterioOrdenamiento()) {
                i++;
                intercambiar(personas,i,j);
            }
        }
        intercambiar(personas,i+1,fin);
        return i+1;
    }
    private void intercambiar(Persona[] personas,int i,int j){
        Persona aux = personas[i];
        personas[i] = personas[j];
        personas[j] = aux;
    }
}
