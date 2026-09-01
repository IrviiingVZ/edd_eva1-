/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_3_stackiverfkiw;

/**
 *
 * @author irvingvalles
 */
public class EVA1_3_STACKIVERFKIW {

    public static void main(String[] args) {
        
        System.out.println("Inicia Main");
        A();
        System.out.println("Termina main");
    }
    
    public static void A(){
        System.out.println("inicia A()");
        B();
        System.out.println("Termina A()");
    }
    
    public static void B(){
        System.out.println("Inicia B()");
        A();
        System.out.println("Termina B()");
    }
    
}
