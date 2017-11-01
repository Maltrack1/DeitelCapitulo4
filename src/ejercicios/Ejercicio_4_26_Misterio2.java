/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author maltr
 */
public class Ejercicio_4_26_Misterio2 {
    public static void main(String[] args) {
        int fila = 10;
        
        while(fila >= 1){
            int columna = 1;
            
            while(columna <= 10){
                System.out.print(fila % 2 == 1 ? "<" : ">");
                ++columna;
            }
            
            --fila;
            System.out.println();
        }
    }
}
