/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A05;

/**
 *
 * @author CarlosManuel
 */
public class class_a05 {
    
    public static void Seleccion(int v[]){
        int t; //Declarar la variable temporal
        MostrarVector(v); //Llamar el método MostrarVector
        for (int i = 0; i < v.length - 1; i++) { /*Ciclo donde recorrera desde la posición 0 hasta la posición final menos uno, 
                                                    es decir, si termina hasta 5 el ciclo recorrera hasta el 4. Dicho ciclo 
                                                    recorre el arreglo para ir comprobando con el otro ciclo que siempre el 
                                                    valor izquierdo sea menor con el valor derecho, sucesivamente hasta que sea 
                                                    completamente un ordenamiento de menor a mayor*/
            int m = i; //Apuntador, El valor de m es igual al valor de i
            for (int j = i + 1; j < v.length; j++) { /*Ciclo donde recorrera desde la posición 1 hasta el final del arreglo para 
                                                        ir comprobando con el otro ciclo que el valor izquierdo sea menor con el 
                                                        derecho, sucesivamente hasta llegar al ordenamiento de menor a mayor*/
                if (v[j] < v[m]) { /*Esta condición aplica en caso de que el valor del vector en la posición j sea menor que el 
                                        valor del vector en la posición m*/
                    m = j; //El valor de m cambia al valor de j
                } //Fin de la condición
            } //Fin del ciclo
            t = v[i]; //Temporal es igual al valor del vector en la posición i
            v[i] = v[m]; //El vector en la posición i es igual al valor del vector en la posición m
            v[m] = t; //El vector en la posición m es igual al valor de temporal
        } //Fin del ciclo
        MostrarVector(v); //Llamar el método MostrarVector
    }
    
    public static void MostrarVector(int v[]) {
        for (int i = 0; i < v.length; i++) { /*Ciclo donde recorre todo el arreglo para poder imprimir los valores que existen en 
                                                dichas posiciones*/
            System.out.print("[" + v[i] + "]"); //Imprime el valor que existe en dichas posiciones
        } System.out.println(); //Imprime un salto de linea
        //return 0; En caso de ser un método de algún tipo ya sea int, entre otro, puede regresar cualquier valor ya que no se usara
    }
}
