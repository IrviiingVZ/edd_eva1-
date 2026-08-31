/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_1_scope;

/**
 *
 * @author irvingvalles
 */
public class EVA1_1_SCOPE {

    public static void main(String[] args) {
        int x = 100;//Existe en todo el bloque main 
        
        for (int i = 0; i < 10; i++) { //Existe dentro del bloque del for 
            System.out.println("Valor de i =" + i);
        }
        
        System.out.println("Valor final de la i =" + i ); //No existe aqui 
        System.out.println("Valor final de la x =" + x);//Existe aqui 
    
    }
    public static void OtraFuncion(){
        System.out.println("Valor de x = ") + x; //No existe aqui 
    }
}
