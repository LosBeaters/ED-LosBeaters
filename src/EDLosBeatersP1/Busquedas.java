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
package EDLosBeatersP1;

import java.util.Scanner;

public abstract class Busquedas {

    private int[] vector; //Declaramos privado el vector para que pueda ser heredado a las clases hijas de Busquedas.

     public Busquedas(int[] vector) { //Constructor de la clase, que inicializa los atributos de la clase, es decir el vector Secuencial y el vector Binario.
        this.vector = vector; //Se asigna el atributo vector a la variable del mismo nombre, por lo que se usa el this.
    }

    public Busquedas(){ //Constructor que inicializa el vector en si mismo, en vector.
        this.vector = vector; //Se asigna el atributo vector a la variable del mismo nombre, por lo que se usa el this.
    }

    public int[] GetVector() { //Método GetVector.
        return vector; //Regresa la variable vector.
    }

    public void SetVector(int[] vec) { //Método SetVector.
        vector = vec; //Se le da a la variable vector un valor nuevo.
    }

    public void MostrarVector(int[] vector){ //Método MostrarVector
        for (int i = 0; i < vector.length; i++){ //Se recorre todo el el vector para desplegar los número que se encuentran en el mismo.
            System.out.print(" | " + vector[i]); //Se van desplegando los respectivos números del vector.
        }
        System.out.println(" | "); //Se imprime un espacio en blanco para pasar a la siguiente linea.
    }

    public void MostrarResultado(int r) {//Método para mostrar la posición del resultado

        if (r != -1) {//Se va realizando una comparación usando la posición
            System.out.println("El número que busca si se encuentra dentro del arreglo en la posición " + r);//Si el número que se esta buscando
            //se encuentra en el arreglo, se despliega un mensaje afirmando que se encontro el número y su respectiva posición
        } else {
            System.out.println("El número solicitado no esta dentro de éste arreglo ¡Lo sentimos, intentalo de nuevo!");//En el caso contrario
            //se desplegara un mensaje informando que el número no se encontró en el arreglo
        }
    }

    public int[] CrearVector() {//Método para crear el vector
        Scanner sc; //Se utiliza la clase Scanner y se le da el nombre sc el cual utilizaremos para introducir datos.
        sc = new Scanner(System.in);//Con esta línea se crea el objeto sc del tipo Scanner, y se establece que la información será introducida por el usuario (System.in)
        System.out.print("Escribe el tamaño del arreglo: ");//Se muestra mensaje en pantalla
        int n = sc.nextInt();//A la variable n del tipo entero se le asigna cualquier valor que sea introducido por el usuario       
        int vec[] = new int[n];
        for (int i = 0; i < n; i++) {/*
          Se crea un ciclo for para la introducción de los datos dentro del arreglo, la primera parte inicializa un contador llamado i
          para llevar el control de las "vueltas que dará el ciclo, la segunda parte establece la condición que detendrá el curso del ciclo
             */
            System.out.print("Escribe el dato del v[" + i + "]: "); //Se muestra en pantalla un mensaje para dar indicación al usuario de lo que se le esta pidiendo

            vec[i] = sc.nextInt(); /*Aquí es donde se da la orden para que cada uno de los datos introducidos 
                                    por el usuario se guarden en un espacio del arreglo*/
        }
        return vec;
    }

    public int QueBusco() { //Método para preguntarle al usuario que número quiere buscar en el vector
        Scanner sc; //Se crea una variable scanner
        sc = new Scanner(System.in);
        System.out.print("¿Que número deseas buscar en el arreglo?"); //Se le pregunta al usuario qué número quiere buscar en el vector
        int e = sc.nextInt(); //Se guarda el número a buscar en una variable tipo entero
        return e;
    }

    public abstract int Busqueda(int[] vector, int e); /*Declaración del método abstracto correr que será implementado en cada una 
    de las clases hijas (Secuencia, Binaria) con el uso de @Override*/

}
