/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposDatos;

import java.util.Scanner; //Importación de la clase Scanner

/**
 *
 * @author Oscar
 */

//Pedir que el usuario ingrese el ID, número de teléfono y nombre completo e imprimirlo por consola.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Implementamos la clase Scanner
        int id; //Variable entera para guardar el ID
        String telefono; //Variable string para guardar el teléfono
        String nombre_completo; //Variable String para guardar el nombre completo
        
        System.out.println("Ingrese el ID del trabajador: "); //Pedimos el ID por un mensaje en consola
        id = sc.nextInt(); //Guardamos lo que ingresa el usuario en la variable id
        
        System.out.println("Ingrese el número de teléfono: "); //Pedimos el número de teléfono por un mensaje en consola
        telefono = sc.nextLine(); //Guardamos lo que ingresa el usuario en la variable telefono
        
        System.out.println("Ingrese el nombre completo: "); //Pedimos el nombre completo por un mensaje en consola
        nombre_completo = sc.nextLine(); //Guardamos lo que ingresa el usuario en la variable nombre_completo
        
        //Mandamos a imprimir por consola los datos obtenidos
        System.out.println(">>>>>>Datos Registrados<<<<<<");
        System.out.println("ID: "+id);
        System.out.println("Teléfono: "+telefono);
        System.out.println("Nombre: "+nombre_completo);
    }
}
