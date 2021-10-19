/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPropuesto;

import java.util.Scanner;

/*

La empresa “SISCOMP. SA” requiere un programa para controlar el inventario. El programa debe pedir:
    El número de artículos que tiene en el inventario.
    El costo de cada artículo.
    El precio de venta por unidad de cada artículo.
La empresa pone como requisitos del programa lo siguiente:
    Mostrar la cantidad de productos que necesita vender para llegar a un punto de equilibrio.
    Mostrar el costo total de todos los artículos que hay en inventario.
    Mostrar el precio total de todos los artículos que hay en inventario.
    Mostrar la utilidad que va a tener la empresa si vende todos los artículos que hay en el inventario.
*/
/**
 *
 * @author Oscar
 */
public class Propuesto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero_articulos;
        float costo_articulos;
        float precio_venta_unidad;
        
        float cantidad_productos; //punto equilibrio
        float costo_total;
        float precio_total;
        float utilidad;
        
        System.out.println("Digite el número de artículos que tiene en el inventario: ");
        numero_articulos = sc.nextInt();
        
        System.out.println("Digite el costo de cada artículo: ");
        costo_articulos = sc.nextFloat();
        
        System.out.println("Digite el precio de venta por unidad de cada artículo: ");
        precio_venta_unidad = sc.nextFloat();
        
        cantidad_productos = (costo_articulos * numero_articulos) / precio_venta_unidad;
        costo_total = costo_articulos * numero_articulos;
        precio_total = precio_venta_unidad * numero_articulos;
        utilidad = precio_total - costo_total;
        
        System.out.println("Cantidad de productos para llegar a punto de equilbrio: "+cantidad_productos);
        System.out.println("Costo total: "+costo_total);
        System.out.println("Precio total: "+precio_total);
        System.out.println("Utilidad: "+utilidad);  
    }
}
