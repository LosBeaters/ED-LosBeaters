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
public class A01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("¿De cuántos escalones es su escalera?: ");
        long n = sc.nextLong();
        clase_a01.Factorial(n);
    }
    
}
