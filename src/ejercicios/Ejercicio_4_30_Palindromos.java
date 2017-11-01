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
public class Ejercicio_4_30_Palindromos {

    public static void main(String[] args) {

        char con = 's';

        Scanner entrada = new Scanner(System.in);

        while (con == 's') {
            int numero = 0;
            int cifras = 0;
            int cif1 = 0;
            int cif2 = 0;
            int cif3 = 0;
            int cif4 = 0;
            int cif5 = 0;
            int temp = 0;

            System.out.println("Ingresa el numero de 5 digitos a evaluar:");
            numero = entrada.nextInt();

            if (numero < 1) {
                System.out.println("Error, ingresaste un numero no valido.");
                System.out.println("¿Desea continuar? s/n :");
                con = entrada.next().charAt(0);
            } else {
                temp = numero;
                while (temp != 0) {
                    temp = temp / 10;
                    cifras++;
                }

                if (cifras != 5) {
                    System.out.println("Error, ingresaste un numero que no tiene 5 cifras.");
                    System.out.println("¿Desea continuar? s/n :");
                    con = entrada.next().charAt(0);
                } else {
                    temp = numero;
                    cif1 = temp % 10;
                    temp = temp / 10;
                    cif2 = temp % 10;
                    temp = temp / 10;
                    cif3 = temp % 10;
                    temp = temp / 10;
                    cif4 = temp % 10;
                    temp = temp / 10;
                    cif5 = temp % 10;

                    if (cif1 == cif5) {
                        if (cif2 == cif4) {
                            System.out.println("El numero " + numero + " es un numero palindromo.");
                            System.out.println("¿Desea continuar? s/n :");
                            con = entrada.next().charAt(0);
                        } else {
                            System.out.println("El numero " + numero + " no es un numero palindromo.");
                            System.out.println("¿Desea continuar? s/n :");
                            con = entrada.next().charAt(0);
                        }
                    } else {
                        System.out.println("El numero " + numero + " no es un numero palindromo.");
                        System.out.println("¿Desea continuar? s/n :");
                        con = entrada.next().charAt(0);
                    }
                }
            }
        }
    }
}
