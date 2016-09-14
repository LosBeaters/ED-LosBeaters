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
public class T02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        linealListClass list = new linealListClass();
        list.insertFinal(10);
        list.insertFinal(20);
        list.insertFirst("HOLA");
        list.insertFirst(3.4);
        list.insertFinal(45);
        list.showList();
        list.eNode(3.4);
        list.showList();
        /*list.deleteFinal();
        list.showList();
        list.deleteFirst();
        list.showList();*/
    }
    
}
