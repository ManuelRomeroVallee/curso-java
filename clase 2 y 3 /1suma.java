/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2y3.e1;

import java.util.Scanner;

/**
 *
 * @author manuelromero
 */
public class suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner (System.in);
      
        // Defino tipo de dato que van a llevar las variables
        int num1;
        int num2;
        
        //Muestra un mensaje por pantalla
        System.out.println("Ingresá primer número entero: ");
        
        //Leemos el número 1 de la variable num1
        num1 = leer.nextInt();    
        
        //Muestra un mensaje por pantalla
        System.out.println("Ingresá segundo número entero: ");
        
        //Leemos el número 2 de la variable num2
        num2 = leer.nextInt(); 
            
    //ecuación de suma
        int suma = num1 + num2;
        
    //Mostramos por consola el resultado de suma
         System.out.println("El resultado es: "+suma);
    }
    
}
