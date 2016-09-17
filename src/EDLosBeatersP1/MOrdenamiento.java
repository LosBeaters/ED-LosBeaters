/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDLosBeatersP1;

/**
 * 
 * @author Los beaters
 * "Una vez programador, siempre programador"
 * Mariana Villegas
 * Josue Ramirez
 * Carlos Vargas 
 * Yesus Becerril 
 * Irving Rocha
 */
public interface MOrdenamiento { //Se crea una clase interface donde declaramos los métodos de ordenamiento
    
    
    public void MSeleccion(int vector[]); //Método de ordenamiento de selección
    
    public void MBurbuja(int vector[]); //Método de ordenamiento Burbuja
    
    public int[] MMSort (int vector[]); //Método de ordenamiento MergeSort
    
    public void MQSort (int vector[], int inicio, int fin); //Método de ordenamiento QuickSort
    
}
