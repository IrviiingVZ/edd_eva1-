/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_paso_valor_referencia;

/**
 *
 * @author irvingvalles
 */
public class EVA1_5_PASO_VALOR_REFERENCIA {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("valor de x = " + x);
        incrementar (x);
        System.out.println("Valor de x modificado = " + x );
        //ahora con objetos 
        MiValor mv = new MiValor();
        System.out.println("MiValor.y - " + mv.y);//AQUI NO HAY CAMBIOS 
        incrementarObj(mv);
        System.out.println("Mivalor.y - " + mv.y); //AQUI SI HAY CAMBIOS 
    }
    
    public static void incrementar(int valor){ //paso x valor 
    valor = valor + 1;
    }
    //Recibo una copia de la direccion del objeto 
    public static void incrementarObj(MiValor valor){//TAMBIEN ES PASO POR VAOR 
       valor.y = valor.y + 1; 
    }
    
}
    class MiValor{
    int y = 5;
    
    }
    

