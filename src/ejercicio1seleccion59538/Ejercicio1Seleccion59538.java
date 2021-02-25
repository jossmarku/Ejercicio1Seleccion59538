/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion59538;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Ejercicio1Seleccion59538 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        
        Scanner miConsola = new Scanner(System.in);
        
        System.out.println("Dime el primer número: ");
        numero1 = miConsola.nextInt();
        
        System.out.println("Dime el segundo número: ");
        numero2 = miConsola.nextInt();
        
        System.out.println("Dime el tercer número: ");
        numero3 = miConsola.nextInt();
        
        if (numero1 >= numero2 && numero1 >= numero3){
            System.out.println("El número mayor es: " + numero1);     
        } else if (numero2 >= numero1 && numero2 >= numero3){
            System.out.println("El número mayor es: " + numero2);
        } else {
            System.out.println("El número mayor es: " + numero3);
            }
    }
}