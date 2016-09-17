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
public class Secuencial extends Busquedas {

   
    @Override
    public int Busqueda(int[] vector, int e) {
        for (int i=0;i < vector.length;i++){ //Ciclo para recorrer las posiciones de nuestro arreglo
            if(vector[i]== e){ //Si la posicion del arreglo en la que estamos es igual al número que queremos buscar la bandera se hara verdadera declarando que el elemento ha sido encontrado.
               return i; //Imprimimos el número de veces que tuvo que recorrerse el ciclo para encontrar el número
            }
        }
    return -1;
    }
}
