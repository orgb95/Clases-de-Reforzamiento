/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposDatos;

import java.util.Scanner; //Importación de la clase scanner

/**
 *
 * @author Oscar
 */

/*
Hacer un programa que pida 3 números: 1 entero, 1 flotante y 1 double y mandarlos  a imprimir por consola.
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //Implementamos la clase scanner
        int numero1; //Número entero
        float numero2; //Número flotante
        double numero3; //Número double
        
        System.out.println("Ingrese el número entero: "); //Pedimos el primer número por un mensaje en consola
        numero1 = sc.nextInt(); //Guardamos el número entero en la variable llamada numero1
        
        System.out.println("Ingrese el número flotante: "); //Pedimos el segundo número por un mensaje en consola
        numero2 = sc.nextFloat(); //Guardamos el número float en la variable llamada numero2
        
        System.out.println("Ingrese el número double"); //Pedimos el tercer número por un mensaje en consola
        numero3 = sc.nextDouble();//Guardamos el  número double en la variable numero3
        
        System.out.println("Número entero: "+numero1); //Imprimimos el número entero
        System.out.println("Número flotante: "+numero2); //Imprimimos el número flotante
        System.out.println("Número double: "+numero3); //Imprimimos el número double   
    }
}
