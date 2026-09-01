/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_2_stack;

/**
 *
 * @author irvingvalles
 */
public class EVA1_2_STACK {

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
        int i = 5;
        double b = 8;
        System.out.println("Termina B()");
    }
    
}
