/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T01;

/**
 *
 * @author CarlosManuel
 */
public class class_t01 {
    public static long Potencia (long n, long x){
        
        if (n < 0) { //Esta condición hace que no acepte números negativos 
            System.out.println("El número de su exponente no puede ser menor a 0.");
        } else { //Por el contrario si es mayor a 0
            if (n == 0) { //Caso Base, en el caso de que se eleve a la potencia 0
                System.out.print("El resultado es: ");
                return 1; //Regresara 1, ya que es el resultado de x elevado a la potencia 0
            } else { //Por el contrario si la potencia no es 0
                return x * Potencia(n - 1, x);  /*Caso Recursivo, se almacena un valor para poder multiplicarse después, haciendo 
                                                resta de un valor para poder finalizar el proceso en este caso el exponente se 
                                                le restara uno hasta llegar a 0 donde sería el final de su recursividad.*/
            }
        }
        System.out.print("El exponente digitalizado es: ");
        return n; //Regresara el exponente menor a 0 que se digitalizo en un principio
    }
}
