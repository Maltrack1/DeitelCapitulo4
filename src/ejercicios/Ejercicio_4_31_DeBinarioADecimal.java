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
public class Ejercicio_4_31_DeBinarioADecimal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        char con = 's';
        
        while(con == 's'){
            int num;
            int temp;
            int digito;
            int decimal = 0;
            int exponente = 0;
            
            System.out.println("Convertidor de binario a decimal");
            
            System.out.print("Ingrese el numerio binario a convertir: ");
            num = entrada.nextInt();
            temp = num;
            
            while(num != 0){
                digito = num % 10;//Ultima digito de la cifra
                if(digito == 1 || digito == 0){//se comprueba que el digito sea 0 o 1
                    decimal = decimal + digito * (int)Math.pow(2, exponente);
                    num = num / 10;
                    exponente++;
                }else{//Si no entonces no es binario y se debe repetir
                    System.out.println("¡ERROR! Se ingreso un numero que no es binario");
                }
            }
            
            System.out.println("El numero " + temp + " en decimal es: " + decimal);
            System.out.print("¿Desea repetir? s/n: ");
            con = entrada.next().charAt(0);
        }
    }
}
