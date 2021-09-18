/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperadoresAritmeticos;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */

//Crear un programa que pida 2 números enteros al usuario, luego de eso calcular:
//la suma, resta, multiplicación y división entre los números que se digiten.

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero1;
        int numero2;
        
        System.out.println("Ingrese el primer número: ");
        numero1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        numero2 = sc.nextInt();
        
        System.out.println("Suma: "+(numero1 + numero2));
        System.out.println("Resta: "+(numero1-numero2));
        System.out.println("Multiplicación: "+(numero1*numero2));
        System.out.println("División: "+(numero1/numero2));
    }
}
