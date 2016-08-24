/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A05;

import java.util.Scanner;

/**
 *
 * @author CarlosManuel
 */
public class A05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); //Codigo para poder digitalizar datos
        System.out.print("Tamaño del arreglo: "); //Imprime lo que le esta pidiendo al usuario
        int a = sc.nextInt(); //Solicita al usuario el tamaño para el arreglo
        int v[] = new int [a]; //Declaramos y especificamos el tamaño del arreglo
        for (int i = 0; i < v.length; i++) { //Ciclo donde recorrera todo el arreglo para poder digitalizar valores
            System.out.print("Número en arreglo[" + i + "]: "); //Imprime lo que le esta pidiendo al usuario
            v[i] = sc.nextInt(); //Se digitaliza el valor dentro de cada posición del arreglo
        } //Fin del ciclo
        class_a05.Seleccion(v); //Se manda a llamar el metodo dentro de la clase
    }
    
}
