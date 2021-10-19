/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */

/*
Del programa anterior agregar la opción de salir, el programa deberá ejecutarse 
infinitamente hasta que el usuario ingrese la opción de salir, si ingresa una opción 
incorrecta el programa deberá mandar un mensaje diciendo “Su opción es incorrecta” y deberá mostrar el
menú de opciones nuevamente.
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double numero1, numero2;
        
        double mayor, menor;
        
        int opcion;
        
        boolean flag = true;
        
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
        
        do{
            System.out.println("1. Sumar ");
            System.out.println("2. Restar");
            System.out.println("3. Dividir");
            System.out.println("4. Multiplicar");
            System.out.println("5. Salir");
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
                
                case 5:
                    System.out.println("Saliendo...");
                    
                    flag = false;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }while(flag);
    }
}
