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
public class Ejercicio_4_37_2_EstimacionDe_e_ALa_x {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa que estima el valor de e^x dados los terminos que indique");
        
        double num;
        double exp;
        double temp1 = 1;
        double temp2;
        double temp3;
        double temp4;
        double temp5;
        double result = 1;
        
        System.out.print("Indique la cantidad de terminos a calcular de 'e': ");
        num = entrada.nextDouble();
        
        System.out.print("Indique el valor de x: ");
        exp = entrada.nextDouble();
        
        if(num > 1){
            while(temp1 < num){
                temp2 = temp1;
                temp3 = 1;
                while(temp2 != 0){
                  temp3 = temp3 * temp2;
                  temp2--;
                }
                temp5 = Math.pow(exp, temp1);
                temp4 = temp5/temp3;
                result += temp4;
                temp1++;
            }
        }else{
            if(num == 1){
                System.out.println("La aproximacion de 'e' con 1 termino es: 1");
            }else{
                System.out.println("¡ERROR! Se ingreso un numero no valido");
            }
        }
        
        System.out.println("La aproximacion de 'e^x' con " + num + " terminos y con un valor de x = " + exp + " es: " + result);
    }
}
