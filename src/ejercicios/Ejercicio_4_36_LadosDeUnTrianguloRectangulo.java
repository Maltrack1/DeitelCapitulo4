/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author efrain
 */
public class Ejercicio_4_36_LadosDeUnTrianguloRectangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Programa que determina si las magnitudes indicadas pueden representar un triangulo");
        
        double lado1;
        double lado2;
        double lado3;
        
        System.out.print("Ingrese la primer magnitud: ");
        lado1 = entrada.nextDouble();
        
        System.out.print("Ingrese la segunda magnitud: ");
        lado2 = entrada.nextDouble();
        
        System.out.print("Ingrese la tercer magnitud: ");
        lado3 = entrada.nextDouble();
        
        if(((lado1 + lado2) > lado3) && ((lado2 + lado3) > lado1) && ((lado2 + lado3) > lado1)){
            double hip1;
            double hip2;
            double hip3;
            double temp1;
            double temp2;
            double temp3;
            
            hip1 = (lado1 * lado1) + (lado2 * lado2);
            hip2 = (lado1 * lado1) + (lado3 * lado3);
            hip3 = (lado2 * lado2) + (lado3 * lado3);
            
            temp1 = (lado3 * lado3);
            temp2 = (lado2 * lado2);
            temp3 = (lado1 * lado1);
            
            if((hip1 == temp1) || (hip2 == temp2) || (hip3 == temp3)){
                System.out.println("Las magnitudes pueden representar un triangulo rectangulo");
            }else{
                System.out.println("Las magnitudes pueden representar un triangulo, pero no un triangulo rectangulo");
            }
        }else{
            System.out.println("Las magnitudes no pueden representar un triangulo");
        }
    }
}
