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
/*

Hacer un programa que imprima una factura comercial, el programa debe pedir:
	A) Nombre del comprador
	B) Cantidad de productos
	C) Precio por unidad.
Luego el programa debe calcular el subtotal y el total aplicando IVA. Imprimir por consola dicha factura.

*/
public class Ejercicio2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        
        String nombre_comprador;
        int cantidad_productos;
        float precio_unidad;
        float IVA = 0.15F;
        float subtotal, total;
        
        System.out.println("Ingrese el nombre del comprador: ");
        nombre_comprador = sc.nextLine();
        
        System.out.println("Cantidad de productos: ");
        cantidad_productos = sc.nextInt();
        
        System.out.println("Precio por unidad: ");
        precio_unidad = sc.nextFloat();
        
        Thread.sleep(1000);
        System.out.println("Calculando...");
        
        subtotal = precio_unidad * cantidad_productos;
        total = subtotal + (subtotal*IVA);
        
        Thread.sleep(2000);
        System.out.println("Facturando .....");
        Thread.sleep(3000);

        System.out.println("_______________________________________________________________________");
        System.out.println("Nombre: "+nombre_comprador);
        System.out.println("Precio por unidad: "+precio_unidad+"        Cantidad de productos: "+cantidad_productos);
        System.out.println("_______________________________________________________________________");
        System.out.println("Subtotal: "+subtotal);
        System.out.println("IVA: "+(subtotal*IVA));
        System.out.println("Total: "+total);
        System.out.println("_______________________________________________________________________");
    }
}
