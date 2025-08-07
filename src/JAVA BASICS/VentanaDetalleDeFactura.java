import javax.swing.*;
import java.util.Scanner;

public class VentanaDetalleDeFactura {
    public static void main(String[] args) {

        String nombreFactura = JOptionPane.showInputDialog(null, "Introduce el nombre de la factura: ");

        String producto1 = JOptionPane.showInputDialog(null, "Introduce el precio del 1r Producto de la factura: ");
        Double precio1 = Double.parseDouble(producto1);

        String producto2 = JOptionPane.showInputDialog(null, "Introduce el precio del 2o Producto de la factura: ");
        Double precio2 = Double.parseDouble(producto2);

        Double sumaProductos = precio1 + precio2;
        Double impuesto = sumaProductos * 0.19;
        Double totalFactura = sumaProductos + impuesto;

        String detalle = "La Factura " + nombreFactura + " tiene un total bruto de " + sumaProductos + ", con un impuesto del 19%, el cual sería de " + impuesto + " y cuyo total después de impuestos es de " + totalFactura;

        JOptionPane.showMessageDialog(null, detalle);

    }
}
