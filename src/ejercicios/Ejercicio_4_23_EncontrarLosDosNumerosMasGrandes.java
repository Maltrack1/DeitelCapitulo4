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
public class Ejercicio_4_23_EncontrarLosDosNumerosMasGrandes {
    public static void main(String[] args) {
        int contador = 1;
        int numero = 0;
        int mayor1 = 0;
        int mayor2 = 0;
        int temp = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        while (contador <= 10) {            
            System.out.println("Ingresa un numero entero:");
            numero = entrada.nextInt();
            
            if (numero > temp) {
                if (numero > mayor1) {
                    mayor2 = mayor1;
                    mayor1 = numero;
                    temp = numero;
                } else {
                    if (numero > mayor2) {
                        mayor2 = numero;
                        temp = numero;
                    } else {
                        temp = numero;
                    }
                }
            } else {
                temp = numero;
            }
            contador++;
        }
        System.out.println("Los dos numeros mas grandes son " + mayor1 + " y " + mayor2 + " respectivamente.");
    }
}
