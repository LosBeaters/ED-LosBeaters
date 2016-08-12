/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A01;

/**
 *
 * @author CarlosManuel
 */
public class clase_a01 {
    public static long Factorial (long n){
        if (n == 0) {
            System.out.println("Usted termino de bajar las escaleras");
            return 1;
        } else {
            System.out.println("Usted bajo el escalón " + n);
            return(n * Factorial(n - 1));
        }
    }
}
