/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T02;

/**
 *
 * @author CarlosManuel
 */
public class linealListClass<T> {
    private nodeClass first;
    private nodeClass last;
    
    //Métodos
    public void insertFirst(T n){
        nodeClass node = new nodeClass(n);
        if(isEmpty()){ //Si está vacáa la lista
            first = node;
            last = node;
        } else { //Si no está vacía la lista
            node.next = first;
            first = node;
        }
    }
    
    public void insertFinal(T n){
        nodeClass node = new nodeClass(n);
        if(isEmpty()){ //Si está vacáa la lista
            first = node;
            last = node;
        } else { //Si no está vacía la lista
            nodeClass prev;
            prev = last;
            prev.next = last = node;
            //last.next = null;
            //node.next = (nodeClass) last;
            //first = (T) node;
            //last = (T) node.next;
            //node.next = null;
            //last = node;
            //last = (T) node.next;
            //last = (T) node;
        }
    }
    
    public void deleteFirst(){
        first = first.next;
    }
    
    public void deleteFinal(){
        nodeClass node = first;//Se crea un puntero que sea igual a primero
        nodeClass prev = null;//Se crea otro puntero que sea igual a null
        while(node.next!=null){//Se verifica si node.next es diferente de null
            prev = node;//De ser asi el siguiente puntero es igual a node
            node = node.next;//Mientras que node es igua a node.next, de esta forma se va
            //verificando si lo que sigue del ultimo nodo es igual a null, se elimina
        }
        last = prev;
        prev.next = null;
    }
    
    private boolean isEmpty(){
        return first == null;
    }
    
    public void showList(){
        if (!isEmpty()){
            nodeClass t;
            t = (nodeClass) first;
            System.out.print("->");
            while(t!=null){
                System.out.print("["+t.data+"|]->");
                t=t.next;
            }
            System.out.println("☠");
        } else {
            System.out.println("La lista está vacía");
        }
    }
    public boolean eNode(T data){
        nodeClass t, t2;
        if (isEmpty()){ //Si está vacío retorna falso.
            return false;
        } else { //Si contiene elementos.
            t = first; //Colocamos auxiliar al inicio de la lista.
            t2 = first;
            while (t.data != data && t != null){ //Mientras que no encuentre el dato o no llegue al final de la lista, recorre la lista.
                t2 = t;
                t = t.next; //Recorre la lista.
            }
            if(t == null){return false;} // No lo encontro
            else {
                t2.next=t.next;
                return true;
            }
        }
    }
}
