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
public class class_a02 {
    public static long Bi (long n){
        
        if(n<2){
            System.out.print(n);
            return 0;
        }else{
            Bi(n/2);
            System.out.print(n%2);
            return 0;
        }
        /*if ((n / 1) == 1) {
            return 1;
        } else if ((n % 2) == 0) {
            System.out.print("1");
            return Bi(n);
        } else {
            System.out.print("0");
            return Bi(n);
        }*/
    }
}
