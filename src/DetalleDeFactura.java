//# DETALLE DE FACTURA

    /* La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
    * Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
    * Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
    * Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
    * Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
    * Por ejemplo, el resultado podría ser algo así:
    * La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882
    */

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner factura = new Scanner(System.in);
        System.out.println("Introduce el nombre de la factura: ");
        String nombre = factura.nextLine();

        System.out.println("Introduce el precio del 1r Producto de la factura: ");
        Double producto1 = factura.nextDouble();

        System.out.println("Introduce el precio del 2o Producto de la factura: ");
        Double producto2 = factura.nextDouble();

        Double sumaProductos = producto1 + producto2;
        Double impuesto = sumaProductos * 0.19;
        Double totalFactura = sumaProductos + impuesto;

        String detalle = "La Factura " + nombre + " tiene un total bruto de " + sumaProductos + ", con un impuesto del 19%, el cual sería de " + impuesto + " y cuyo total después de impuestos es de " + totalFactura;

        System.out.println(detalle);

        factura.close();

    }
}