/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDLosBeatersP1;

import java.util.Scanner;

/**
 * 
 * @author Los beaters
 * "Una vez programador, siempre programador"
 * Mariana Villegas
 * Josue Ramirez
 * Carlos Vargas 
 * Yesus Becerril 
 * Irving Rocha
 */
public class EDProyectoParcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Estos son los vectores.
        int[] vec1;
        int[] vec2;
        int b;
        System.out.println("---------------------- Esta es la prueba del objeto Binario ----------------------");
        //Primero instanciamos el Objeto
        Binaria OBinario = new Binaria();
        //Luego creamos el vector
        vec1=OBinario.CrearVector();
        //Después lo guardamos en el atributo del objeto con SetVector
        OBinario.SetVector(vec1); //Al hacer esto el vector se referencía y cualquier cambio que hagamos en vec,
                                  //se reflejará en el vector del objeto.
        //Mostramos el vector, que guardamos
        OBinario.MostrarVector(OBinario.GetVector());
        menu(OBinario,vec1);//Ordenamos el vector eligiendo un método del menú.
        //Mostramos el vector ya ordenado
        OBinario.MostrarVector(OBinario.GetVector());
        //Solicitamos la búsqueda de algún elemento, lo buscamos, y mostramos el resultado.
        OBinario.MostrarResultado(OBinario.Busqueda(vec1, OBinario.QueBusco()));
        //Concluye la prueba del método binario.
        
        System.out.println("---------------------- Esta es la prueba del objeto Secuencial ----------------------");
        Secuencial OSecuencial = new Secuencial();
        vec2=OSecuencial.CrearVector();
        OSecuencial.SetVector(vec2);
        OSecuencial.MostrarVector(vec2); //Aquí mostramos el vector de la variable.
        //Solicitamos al usuario el número a buscar
        b=OSecuencial.QueBusco();
        //Buscamos en el vector del objeto, y no en vec 2, para demostrar que es posible buscar con lo que devuelve
        //un método.
        b=OSecuencial.Busqueda(OSecuencial.GetVector(),b);
        //Se muestra el resultado.
        OSecuencial.MostrarResultado(b);
    }
    
    public static void menu(Binaria OBinario, int[] vec1) {
        int i = 0;
        int t = vec1.length - 1;
        Scanner sc;
        sc = new Scanner(System.in);
        //MENU de opciones a desplegar para que el usuario escoja que método utilizar para ordenar el arreglo
        System.out.println("     M   E   N    U");
        System.out.println("1.- Método de Selección");
        System.out.println("2.- Método Burbuja");
        System.out.println("3.- Método QuickSort");
        System.out.println("4.- Método MergeSort");
        System.out.println("5.- Salir");

        System.out.print("OPCION ==> ");
        int opcion = sc.nextInt(); //Opción introducida por el usuario
        if (opcion > 5 || opcion < 1) { //Condición que verifica que la opcion que inserte el usuario sea válida
            System.out.println("ERROR, opción no valida");
            salir(); //Llamamos al metodo de salida en caso de una opción no válida
        } else {

            switch (opcion) { //Inicio del switch
                case 1:
                    OBinario.MSeleccion(vec1); //Elije un uno, lo lleva al método de selección
                    break;
                case 2:
                    OBinario.MBurbuja(vec1); //Elije un dos, lo lleva al método burbuja
                    break;
                case 3:
                    OBinario.MQSort(vec1, i, t); //Elije un tres, lo lleva al método QuickSort
                    break;
                case 4:
                    OBinario.MMSort(vec1); //Elije un cuatro, lo lleva al método MergeSort
                    break;
                case 5:
                    salir();
                    break;
                default:
                    break;
            } //Fin del switch
        }
    } //Fin del método menu

    public static void salir() {
        System.exit(0);
    }
}
