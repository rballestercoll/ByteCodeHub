package JAVA_BASICS;

//PROGRAMA DE MANEJO DE NOMBRES

    /*La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
    Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
    Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
    Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
    Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
    N.es_A.ia_E.pe
    */

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner nombres = new Scanner(System.in);

        System.out.println("Escribe el nombre del Primer Familiar: ");
        String familiar1 = nombres.nextLine();
        String familiar1A = familiar1.toUpperCase().charAt(1) + "." + familiar1.substring(familiar1.length()-2);

        System.out.println("Escribe el nombre del segundo Familiar: ");
        String familiar2 = nombres.nextLine();
        String familiar2A = familiar2.toUpperCase().charAt(1) + "." + familiar2.substring(familiar2.length()-2);

        System.out.println("Escribe el nombre del tercer familiar: ");
        String familiar3 = nombres.nextLine();
        String familiar3A = familiar3.toUpperCase().charAt(1) + "." + familiar3.substring(familiar3.length()-2);

        System.out.println(familiar1A + "_" + familiar2A + "_" + familiar3A);

    }
}
