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
public class Ejercicio_4_24_ValidarEntradaDelUsuario {
    public static void main(String[] args) {
        int aprobados = 0;
        int reprobados = 0;
        int contadorEstudiantes = 1;
        
        Scanner entrada = new Scanner(System.in);
        
        while(contadorEstudiantes <= 10){
            System.out.println("Escriba el resultado (1 = aprobado, 2 = reprobado): ");
            int resultado = entrada.nextInt();
            
            if (resultado == 1) {
                aprobados = aprobados + 1;
                contadorEstudiantes++;
            } else {
                if (resultado == 2) {
                    reprobados = reprobados + 1;
                    contadorEstudiantes++;
                } else {
                    System.out.println("Error, valor no valido");
                }
            }
        }
        
        System.out.printf("Aprobados: %d%nReprobados: %d%n", aprobados, reprobados);
        
        if(aprobados > 8){
            System.out.println("Bono para el instrucctor");
        }
    }
}
