/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A01;

import java.util.Scanner;

/**
 *
 * @author CarlosManuel
 */
public class A02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.print("Digitalice un número a transformar en binario: ");
        long n = sc.nextLong();
        //System.out.println(n/2);
        class_a02.Bi(n);
        
    }
    
}
