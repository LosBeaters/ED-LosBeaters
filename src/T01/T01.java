/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T01;

import java.util.Scanner;

/**
 *
 * @author CarlosManuel
 */
public class T01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //Codigo para poder digitalizar datos
        System.out.print("Digitalice su número base: ");
        long x = sc.nextLong(); //Lo que el usuario digitalize se guardara en dicho valor
        System.out.print("Digitalice su número exponente: ");
        long n = sc.nextLong(); //Lo que el usuario digitalize se guardara en dicho valor
        System.out.println(class_t01.Potencia(n, x)); //Imprimira el valor que el metodo de la clase regrese
        
    }
    
}
