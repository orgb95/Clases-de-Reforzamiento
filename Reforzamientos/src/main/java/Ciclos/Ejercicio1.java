/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

import java.util.Scanner;

/*
Hacer un programa que permita ingresar 2 números y validar cual es el mayor y cual es el menor.
Luego hacer un menú de opciones que deje sumar, restar, dividir y multiplicar.
Recordar que tanto el primer sumando, minuendo, dividendo y el primer factor deben ser el número mayor.

*/
/**
 *
 * @author Oscar
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double numero1, numero2;
        
        double mayor, menor;
        
        int opcion;
        
        System.out.println("Ingrese el primer número: ");
        numero1 = sc.nextDouble();
        
        System.out.println("Ingrese el segundo número: ");
        numero2 = sc.nextDouble();
        
        if (numero1 < numero2) {
            menor = numero1;
            mayor = numero2;
        }else{
            mayor = numero1;
            menor = numero2;
        }
        
        System.out.println("1. Sumar ");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");
        opcion = sc.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Suma: "+(mayor+menor));
                break;
                
            case 2:
                System.out.println("Resta: "+(mayor-menor));
                break;
                
            case 3:
                System.out.println("Dividir: "+(mayor/menor));
                break;
                
            case 4:
                System.out.println("Multiplicar: "+(mayor*menor));
                break;
                
            default:
                System.out.println("Opción incorrecta");
                break;
        }
        
    }
}
