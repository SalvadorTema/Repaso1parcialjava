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
            System.out.println("3. Contador Positivos, Negativos y Ceros");
            System.out.println("4. Promedio de números pares (1 a n)");
            System.out.println("5. Suma de dígitos de un número");
            System.out.println("6. ¿Es múltiplo de 7 o 11?");
            System.out.println("7. Divisibles entre 3 pero no entre 2");
            System.out.println("8. Clasificador de hora (Mañana/Tarde/Noche)");
            System.out.println("0. Salir");
            System.out.print("\nElija una opción: ");
            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: sumarDivisibles4(sc); break;
                case 2: calcularFactorial(sc); break;
                case 3: contarTiposNumeros(sc); break;
                case 4: promedioPares(sc); break;
                case 5: sumarDigitos(sc); break;
                case 6: verificarMultiplo(sc); break;
                case 7: mostrarDivisibles(sc); break;
                case 8: clasificarHora(sc); break;
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
  //EJERCICIO 3
    public static void contarTiposNumeros(Scanner sc) {
        System.out.print("¿Cuántos números va a ingresar (n)?: ");
        int n = sc.nextInt();
        int pos = 0, neg = 0, cero = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese número " + i + ": ");
            double num = sc.nextDouble();
            if (num > 0) pos++;
            else if (num < 0) neg++;
            else cero++;
        }
        System.out.println("\nResultados:\nPositivos: " + pos + "\nNegativos: " + neg + "\nCeros: " + cero);
    }
  //EJERCICIO 4
    public static void promedioPares(Scanner sc) {
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();
        int suma = 0, contador = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
                contador++;
            }
        }
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de pares es: " + promedio);
        } else {
            System.out.println("No se encontraron números pares.");
        }
    }
  //EJERCICIO 5
    public static void sumarDigitos(Scanner sc) {
        System.out.print("Ingrese un número entero: ");
        int n = Math.abs(sc.nextInt()); // Math.abs por si ingresan negativos
        int suma = 0;
        while (n > 0) {
            suma += n % 10; // Extrae el último dígito
            n /= 10;        // Elimina el último dígitos
        }
        System.out.println("La suma de los dígitos es: " + suma);
    }
 // --- MÉTODOS DE LOS EJERCICIOS DEL 6 AL 8 ---
    //EJERCICIO 6
    public static void verificarMultiplo(Scanner sc) {
        System.out.print("Ingrese número: ");
        int n = sc.nextInt();
        if (n % 7 == 0 || n % 11 == 0) {
            System.out.println(n + " es múltiplo de 7 o de 11.");
        } else {
            System.out.println(n + " NO es múltiplo ni de 7 ni de 11.");
        }
    }
  //EJERCICIO 7
    public static void mostrarDivisibles(Scanner sc) {
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();
        System.out.print("Números: ");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
  //EJERCICIO 8
    public static void clasificarHora(Scanner sc) {
        System.out.print("Ingrese hora (0-23): ");
        int h = sc.nextInt();
        if (h >= 6 && h <= 12) System.out.println("Mañana");
        else if (h >= 13 && h <= 19) System.out.println("Tarde");
        else if ((h >= 20 && h <= 23) || (h >= 0 && h <= 5)) System.out.println("Noche");
        else System.out.println("Hora no válida.");
    } 
}



