package JAVA_BASICS;

/*
 * Ejercicio 2: Suma de dos números
 * --------------------------------
 * Enunciado:
 * Escribe un programa en Java que imprima la suma de dos números.
 * Datos de prueba:
 * 74 + 36
 *
 * Explicación:
 * En este caso, puedes realizar la operación dentro del println, como: System.out.println(74 + 36);
 * El operador '+' en este contexto sirve como suma.
 * Ten cuidado si mezclas números y texto, ya que '+' también concatena cadenas.
 * Usa paréntesis para asegurarte de que las operaciones matemáticas se hagan antes de imprimir.
 *
 * Output esperado:
 * 110
 */

import java.util.Scanner;

public class pr_2 {
    public static void main(String[] args) {
        System.out.println("Introduce el Primer Numero");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Introduce el Segundo Numero");
        int s = sc.nextInt();

        System.out.println("La Suma de ambos numeros es:");
        System.out.println(n + s);

    }
}
