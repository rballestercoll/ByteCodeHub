package JAVA_BASICS;

/*
 * Ejercicio 1: Hola y tu nombre en pantalla
 * -----------------------------------------
 * Enunciado:
 * Escribe un programa en Java que imprima "Hello" en la pantalla y tu nombre en una línea separada.
 *
 * Explicación:
 * Este ejercicio sirve para practicar la instrucción System.out.println(),
 * que se usa para imprimir texto en la consola.
 * Puedes imprimir una cadena de texto usando comillas dobles (").
 * Al llamar a println() dos veces con diferentes textos, cada texto se imprimirá en una línea distinta.
 *
 * Output esperado:
 * Hello
 * Alexandra Abramov
 */

import java.util.Scanner;

public class pr_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String n=input.nextLine();

        System.out.println("Hello");
        System.out.println(n);
    }
}
