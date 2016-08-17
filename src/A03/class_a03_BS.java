/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A03;

/**
 *
 * @author CarlosManuel
 */
public class class_a03_BS {
    
    public static int BS (int ar[], int n){
        int p = 1;
        boolean b = false;
        for (int i = 0; i <= ar.length - 1; i++){
            if (ar[i] == n){
                System.out.print("Lo encontraste");
                b = true;
                break;
            } else {
                p++;
            }
        }
        if (!b) {
            System.out.print("No existe el elemento");
        }
        
        return p;
    }
}
