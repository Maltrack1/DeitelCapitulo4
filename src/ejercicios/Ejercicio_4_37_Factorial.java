
package ejercicios;

//Programa que calcula el factorial de cuaquier numero no negativo

import java.util.Scanner;

public class Ejercicio_4_37_Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num;
        int temp = 1;
        int temp2;
        
        System.out.print("Ingrese el numero del que desa saber su factorial (debe ser entero y positivo, pudiendo ser cero): ");
        num = entrada.nextInt();
        temp2 = num;
        
        if(num > 0){
            while(num != 0){
                temp = temp * num;
                num--;
            }
        }else{
            if(num == 0){
                System.out.println("El factorial de 0! es: 1");
            }else{
                System.out.println("¡ERROR! Se introdujo un numero no valido");
            }
        }
        
        System.out.println("El factorial de " + temp2 +"! es: " + temp);
    }
}
