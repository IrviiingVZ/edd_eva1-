/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_8_cambio_arreglos;

/**
 *
 * @author irvingvalles
 */
public class EVA1_8_CAMBIO_ARREGLOS {

    public static void main(String[] args) {
    //NO SE OUEDE CAMBIAR EL TAMAÑO A UN ARREGLO >>>>>
    int[] datos = new int [10];
        System.out.println(datos);//Imprimir direccion 
        //LLenar datos
        for (int i = 0; i < datos.length; i++) {
            datos [i] = (int) (Math.random() * 100);
        }
        
        System.out.println("primer arreglo de 10");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("[" + datos [i] + "]");
        }
        
    {
        //NECESITO CAMBIAR DE 10 A 5 ELEMENTOS(LOS PRIMEROS 5) SIN PERDER LA INFORMACION
        //NECESITAN UN RESPALDO
        
        int[] respaldo = datos;
        datos = new int[5];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = respaldo[i];
        }
        System.out.println("segundo arreglo de 5");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("[" + datos [i] + "]");
        }
       }
        
    }
    
}
