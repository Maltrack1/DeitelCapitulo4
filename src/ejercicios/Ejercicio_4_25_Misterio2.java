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
public class Ejercicio_4_25_Misterio2 {
    public static void main(String[] args) {
        int cuenta = 1;
        
        while (cuenta <= 10) {            
            System.out.println(cuenta % 2 == 1 ? "****" : "++++++++");
            cuenta++;
        }
    }
}
