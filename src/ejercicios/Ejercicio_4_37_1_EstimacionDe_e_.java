package ejercicios;

//Programa que realiza la estimacion de la constante "e" (epsilon)

import java.util.Scanner;

public class Ejercicio_4_37_1_EstimacionDe_e_ {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num;
        double temp1 = 1;
        double temp2;
        double temp3;
        double temp4;
        double result = 1;
        
        System.out.print("Indique la cantidad de terminos a calcular de 'e': ");
        num = entrada.nextInt();
        
        if(num > 1){
            while(temp1 < num){
                temp2 = temp1;
                temp3 = 1;
                while(temp2 != 0){
                  temp3 = temp3 * temp2;
                  temp2--;
                }
                temp4 = 1/temp3;
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
        
        System.out.println("La aproximacion de 'e' con " + num + " terminos es: " + result);
    }
}
