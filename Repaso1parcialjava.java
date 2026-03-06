package ejercicios; // Asegúrate que este nombre coincida con el que pusiste en "Package"

import java.util.Scanner;

public class Repaso1parcialjava{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
        	//Menu Enumerado
            System.out.println("\n========================================");
            System.out.println("   MENÚ DE EJERCICIOS 1-20");
            System.out.println("========================================");
            System.out.println("2. Factorial de n (!n)");
            System.out.println("1. Suma de divisibles entre 4 (1 a n)");

            System.out.println("0. Salir");
            System.out.print("\nElija una opción: ");
            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: sumarDivisibles4(sc); break;
                case 2: calcularFactorial(sc); break;
                case 0: System.out.println("Saliendo... ¡Buen trabajo!"); break;
                default: System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }

    // --- MÉTODOS DE LOS EJERCICIOS DEL 1 AL 5 ---
    //EJERCICIO 1 

    public static void  sumarDivisibles4(Scanner sc) {
        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) suma += i;
        }
        System.out.println("La suma de los divisibles entre 4 es: " + suma);
    }
  //EJERCICIO 2
    public static void calcularFactorial(Scanner sc) {
        System.out.print("Ingrese n para calcular su factorial: ");
        int n = sc.nextInt();
        long factorial = 1; 
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
    }

}