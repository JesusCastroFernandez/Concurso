/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso;

import java.util.Scanner;

/**
 *
 * @author JESUS
 */
public class Concurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes
        final char DISTANCIA= 'a' - 'A';

        // Variables de entrada
        String nombre, apellido1, apellido2;
        
        // Variables de salida
        String resultado;


        // Variables auxiliares
        boolean nombreApto, apellidosAptos, concursanteApto;
        
        
        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("CONCURSO DE TV");
        System.out.println("--------------");
        System.out.println();
        System.out.println("Nombre del concursante: ");
        nombre= teclado.nextLine();
        System.out.println("Primer apellido del concursante: ");
        apellido1= teclado.nextLine();
        System.out.println("Segundo apellido del concursante: ");
        apellido2= teclado.nextLine();

        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        nombreApto= nombre.charAt(0) + DISTANCIA == nombre.charAt(nombre.length()-1);
        apellidosAptos= apellido1.length() == apellido2.length();
        concursanteApto= nombreApto && apellidosAptos;
        
        resultado= concursanteApto ? "APTA" : "NO APTA";
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------        
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        System.out.println ("La persona es " + resultado + " para el concurso.");
        
        System.out.println ();
        System.out.println ("Fin del programa. Bye!");
    }
    
}
