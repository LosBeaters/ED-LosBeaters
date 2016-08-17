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
public class class_a03 {
    
    public static int BS (int ar[], int n){
        int p = 1;
        boolean b = false;
        for (int i = 0; i <= ar.length - 1; i++){
            if (ar[i] == n){
                System.out.println("Lo encontraste");
                System.out.println("Se encuentra en la posición: " + i);
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
    
    public static int BB (int ar[], int n, int a){
        Ordenar(ar);
        int p = 1;
        int i = 0, f = a, c, vc;
        for (int j = 0; j <= ar.length - 1; j++){
            if (i <= f){
                c = (i + f) / 2;
                vc = ar[c];
                if (vc == n){
                    System.out.println("Lo encontraste");
                    System.out.println("Se encuentra en la posición: " + c);
                    break;
                } else if (n < vc) {
                    f = c - 1;
                    p++;
                } else if (n > vc) {
                    i = c + 1;
                    p++;
                } else {
                    System.out.println("No existe el elemento");;
                }
            }
        }
        return p;
    }
    
    /*
    inicio = posicion o del arreglo; final = posicion final del arreglo
    mientras inicio < final {
        centro = (inicio + final)/2
        valorcento=arreglo [centro]
        si valor centro = elementoBuscado
            return centro
        si no, 
        si elementoBuscado < valorCentro
            movemos final al centro -1
        si no, movemos inicio al centro +1
        si no, return -1    
    
    
    
    */
    
    public static int[] Ordenar(int ar[]) {
        int t;
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[i]) {
                    t = ar[i];
                    ar[i] = ar[j];
                    ar[j] = t;
                }
            }
        }

    return ar;
    }
}
