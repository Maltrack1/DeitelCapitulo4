/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class Ejercicio_4_21_EncontrarElNumeroMasGrande {
    public static void main(String[] args) {
        int contador = 1;
        int numero = 0;
        int mayor = 0;
        int temp = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        while(contador <= 10){
            System.out.println("Ingrese un numero entero:");
            numero = entrada.nextInt();
            
            if (numero > temp) {
                if (numero > mayor) {
                    mayor = numero;
                    temp = numero;
                } else {
                    temp = numero;
                }
            } else {
                temp = numero;
            }
            contador++;
        }
        
        System.out.println("El numero mas grande es: " + mayor);
    }
}
