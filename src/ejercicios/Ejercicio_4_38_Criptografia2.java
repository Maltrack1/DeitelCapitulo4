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
public class Ejercicio_4_38_Criptografia2 {
        public static void main(String[] args) {
        System.out.println("Programa descifrador ");
        
        Scanner entrada = new Scanner(System.in);
        
        int num;
        int v1;
        int v2;
        int v3;
        int v4;
        int cif;
        
        System.out.print("Ingrese el entero de 4 digitos a descifrar: ");
        num = entrada.nextInt();
        
        if(num > 999 && num <10000){
            v3 = num % 10;
            num /= 10;
            v4 = num % 10;
            num /= 10;
            v1 = num % 10;
            num /= 10;
            v2 = num % 10;
            
            v1 += 3;
            v2 += 3;
            v3 += 3;
            v4 += 3;
            
            v1 %= 10;
            v2 %= 10;
            v3 %= 10;
            v4 %= 10;
            
            System.out.println("Salida: " + v4 + v3 + v2 + v1);
        }
        
    }
}
