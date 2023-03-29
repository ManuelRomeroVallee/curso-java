
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
public class CentigradosAFarenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner (System.in);
      
        // Defino tipo de dato que van a llevar las variables
        double cent; double fahre;
        
        //Muestra un mensaje por pantalla
        System.out.println("Ingresá temperatura en centígrados:");
        
        //Leemos los grados de la variable cent
        cent = leer.nextDouble();
        
        //Calculamos grados Fahrenheit
        fahre = 32 + (9 * cent / 5);
        
        //Mostramos por consola el resultado
         System.out.println("La temperatura es: "+fahre+ "fahrenheit");
    }
    
}
