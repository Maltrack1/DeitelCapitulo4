/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class PromedioClase {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int total = 0;
        int calificaciontemp;
        int contadorCalificaciones = 1;
        int promedio;
        
        while (contadorCalificaciones <= 10) {            
            System.out.print("Iscriba la calificacion: ");
            calificaciontemp = entrada.nextInt();
            
            total = total + calificaciontemp;
            contadorCalificaciones = contadorCalificaciones + 1;
        }
        promedio = total / 10;
        
        System.out.printf("El total de las 10 calificaciones es %d%n", total);
        System.out.printf("El promedio de la clase es %d%n", promedio);
    }
}
