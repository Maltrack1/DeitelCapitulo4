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
public class Ejercicio_4_19_CalculadoraDeComisionesDeVentas {
    public static void main(String[] args) {
        char centinela1 = 's';
        
        Scanner entrada = new Scanner(System.in);
        
        while (centinela1 == 's') {          
            double comisiones = 0;
            double ventas = 0;
            double temp = 0;
            double salario = 200;
            
            System.out.println("Nuevo registro para empleado");
            
            while(temp >= 0 ){
                System.out.println("Ingrese la venta realizada o -1 para finalizar");
                temp = entrada.nextDouble();
                if(temp >= 0){
                    ventas += temp;
                }else{
                    System.out.println("Error, se ingreso un valor no valido");
                }
            }
            
            comisiones = ventas * 0.09;
            
            System.out.println("Las comsiones para el empleado son de " + comisiones);
            
            salario += comisiones;
            
            System.out.println("El salario total del empleado es de " + salario);
            
            System.out.println("¿Desea ingresar otro empleado? s/n");
            centinela1 = entrada.next().charAt(0);
        }
    }
}
