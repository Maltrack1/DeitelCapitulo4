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
public class Ejercicio_4_29_CuadradoDeAsteriscos {
    public static void main(String[] args) {
        int lado = 0;
        int col;
        int fil;
        
        Scanner entradad = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de un lado del cuadrado entre 1 y 20: ");
        lado = entradad.nextInt();
        
        
        //Imprime la primer linea de aseriscos
        col=1;
        while(col<=lado){
            System.out.print(" *");// se pone un espacio, por que el salto de linea ocupa uno.
            col++;
        }
        System.out.println();
        
        //Imprime el cuerpo en blanco del cuadrado
        fil=2;//Se inicia las filas en 2 ya que solo imprimira 18, la primera y la ultima son distintaas 
        while(fil<lado){
            System.out.print(" *");//Imprime el primer asterisco
            col=2;//Se inicia en dos, ya que de igual manera imprimira 18 lugares, el primero y el ultimo son asteriscos
            while(col < lado){
                System.out.print("  ");
                col++;
            }
            System.out.println(" * ");//Imprime el ultimo asterisco y realiza el salto de linea
            fil++;
        }
        
        //Imprime la ultima linea de asteriscos
        col=1;
        while(col<=lado){
            System.out.print(" *");
            col++;
        }
        System.out.println();
    }
}
