
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuelromero
 */
public class DobleTripleRaiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner (System.in);
        
        // Defino tipo de dato que van a llevar las variables
        int num1;
        
        //Muestra un mensaje por pantalla
        System.out.println("Ingresar un número entero");
        
        //Leemos el número 1 de la variable num1
        num1= leer.nextInt();
        
        //Mostramos por consola el resultado del doble
        System.out.println("Doble: "+(num1*2));
        
        //Mostramos por consola el resultado del triple
        System.out.println("Triple: "+(num1*3));
        
        //Mostramos por consola el resultado de la raiz
        System.out.println("Raiz: "+Math.sqrt(num1));
    }
    
}
