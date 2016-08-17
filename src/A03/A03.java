/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A03;

import java.util.Scanner;

/**
 *
 * @author CarlosManuel
 */
public class A03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int a, n, p;
        System.out.print("Número de arreglos: ");
        a = sc.nextInt();
        int ar[] = new int[a];
        for(int i = 0; i <= ar.length - 1; i++){
            System.out.print("Digitalice el número: ");
            ar[i] = sc.nextInt();
        }
        System.out.print("Que número esta buscando: ");
        n = sc.nextInt();
        p = class_a03_BS.BS(ar, n);
        System.out.println("Recorriste " + p + " veces");
    }
    
}
