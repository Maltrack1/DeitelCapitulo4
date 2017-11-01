/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author efrain
 */
public class Ejercicio_4_32_TableroDeDamas {
    public static void main(String[] args) {
        int filas = 1;
        int columnas = 1;
        
        while(filas <= 8){
            
            columnas = 0;
            
            if(filas % 2 == 0){
                System.out.print(" ");
                while(columnas <= 8){
                    System.out.print("* ");
                    columnas++;
                }
                System.out.println();
                filas++;
            }else{
                while(columnas <= 8){
                    System.out.print("* ");
                    columnas++;
                }
                System.out.println();
                filas++;
            }
        }
    }
}
