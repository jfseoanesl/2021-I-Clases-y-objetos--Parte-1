/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesyobjetos_g01;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo r; // defino la vaiable del objeto
        r = new Rectangulo(); // instancio el objeto
        
        //cambia de estado 
        r.setAltura(10);
        r.setBase(30);
        
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Area de rectangulo: " + r.calcularArea());
        
        
    }
    
}
