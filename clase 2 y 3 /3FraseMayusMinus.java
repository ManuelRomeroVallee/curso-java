
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
public class FraseMayusMinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner (System.in);
        
        // Se crea una variable cadena (String) que se utiliza para leer una frase del usuario
        String frase; String minus; String mayus;
        
        //Muestra un mensaje por pantalla
        System.out.println("Ingresá una frase:");
        
        //Leemos la frase en la variable frase
        frase = leer.nextLine();
        
        //Mostramos por consola la frase en minúscula
        System.out.println(frase.toLowerCase());
        
        //Mostramos por consola la frase en mayúscula
        System.out.println(frase.toUpperCase());
        
    }
    
}
