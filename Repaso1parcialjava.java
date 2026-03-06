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
            System.out.println("9. Convertir 1-5 a Romano");
            System.out.println("10. Calculadora básica (Suma, Resta, Multiplicación)");
            System.out.println("11. Mayor, menor y diferencia absoluta");
            System.out.println("12. Tabla de división del 1 al 10");
            System.out.println("13. Contar cantidad de dígitos pares"); 
            System.out.println("14. ¿Es un número triangular?");
            System.out.println("15. Promedio de números negativos");
            System.out.println("16. Primeros n múltiplos de 6");
            System.out.println("17. ¿Es potencia de 2?");
            System.out.println("18. Número invertido");
            System.out.println("19. Suma de 1 a n es par o impar");
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
                case 9: convertirARomano(sc); break;
                case 10: calculadoraBasica(sc); break;
                case 11: analisisNumerico(sc); break;
                case 12: tablaDivision(sc); break;
                case 13: contarDigitosPares(sc); break;
                case 14: verificarTriangular(sc); break;
                case 15: promedioNegativos(sc); break;
                case 16: mostrarMultiplos6(sc); break;
                case 17: esPotenciaDe2(sc); break;
                case 18: invertirNumero(sc); break;
                case 19: sumaParOImpar(sc); break;
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
    //Parte 2 – Condiciones y Divisibilidad
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
    // Parte 3 – Uso de switch
  //EJERCICIO 9
    public static void convertirARomano(Scanner sc) {
        System.out.print("Introduce un número del 1 al 5: ");
        int n = sc.nextInt();
        switch (n) {
            case 1: System.out.println("I"); break;
            case 2: System.out.println("II"); break;
            case 3: System.out.println("III"); break;
            case 4: System.out.println("IV"); break;
            case 5: System.out.println("V"); break;
            default: System.out.println("Número fuera de rango.");
        }
    }
 // EJERCICIO 10
    public static void calculadoraBasica(Scanner sc) {
        System.out.println("1: Sumar, 2: Restar, 3: Multiplicar");
        System.out.print("Elija una opción (1-3): ");
        int opcionCalc = sc.nextInt();
        System.out.print("Ingrese el primer número: ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double n2 = sc.nextDouble();

        switch (opcionCalc) {
            case 1: System.out.println("Resultado: " + (n1 + n2)); break;
            case 2: System.out.println("Resultado: " + (n1 - n2)); break;
            case 3: System.out.println("Resultado: " + (n1 * n2)); break;
            default: System.out.println("Opción no válida.");
        }
    }
     // ---Parte 4 – Análisis Numérico ---
    // --- MÉTODOS DE LOS EJERCICIOS DEL 11 AL 15 ---
 // EJERCICIO 11
    public static void analisisNumerico(Scanner sc) {
        System.out.print("Ingrese número a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese número b: ");
        double b = sc.nextDouble();

        double mayor = Math.max(a, b);
        double menor = Math.min(a, b);
        double diferencia = Math.abs(a - b);

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Diferencia absoluta: " + diferencia);
    }
    
 // EJERCICIO 12
    public static void tablaDivision(Scanner sc) {
        System.out.print("Ingrese un número n para su tabla de división: ");
        double n = sc.nextDouble();
        
        if (n == 0) {
            System.out.println("No se puede dividir entre cero.");
        } else {
            System.out.println("Tabla de división de " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " / " + i + " = " + (n / i));
            }
        }
    }
 // EJERCICIO 13
    public static void contarDigitosPares(Scanner sc) {
        System.out.print("Ingrese un número entero: ");
        int n = Math.abs(sc.nextInt());
        int contador = 0;
        
        // Manejo especial si el número es 0
        if (n == 0) {
            contador = 1;
        } else {
            while (n > 0) {
                int digito = n % 10;
                if (digito % 2 == 0) {
                    contador++;
                }
                n /= 10;
            }
        }
        System.out.println("La cantidad de dígitos pares es: " + contador);
    }
 // EJERCICIO 14
    public static void verificarTriangular(Scanner sc) {
        System.out.print("Ingrese un número n para saber si es triangular: ");
        int n = sc.nextInt();
        int suma = 0, k = 1;
        
        while (suma < n) {
            suma += k;
            k++;
        }
        
        if (suma == n) {
            System.out.println(n + " es un número triangular.");
        } else {
            System.out.println(n + " NO es un número triangular.");
        }
    }
 // EJERCICIO 15
    public static void promedioNegativos(Scanner sc) {
        System.out.print("¿Cuántos números va a ingresar?: ");
        int n = sc.nextInt();
        double sumaNegativos = 0;
        int contadorNegativos = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese número " + i + ": ");
            double num = sc.nextDouble();
            if (num < 0) {
                sumaNegativos += num;
                contadorNegativos++;
            }
        }
        
        if (contadorNegativos > 0) {
            System.out.println("El promedio de los negativos es: " + (sumaNegativos / contadorNegativos));
        } else {
            System.out.println("No hay negativos.");
        }
    }
    //Parte 5 – Patrones y Transformaciones
 // --- MÉTODOS DE LOS EJERCICIOS DEL 16 AL 20 ---
 // EJERCICIO 16
    public static void mostrarMultiplos6(Scanner sc) {
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) System.out.print((i * 6) + " ");
        System.out.println();
    }
 // EJERCICIO 17
    public static void esPotenciaDe2(Scanner sc) {
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        if (n > 0 && (n & (n - 1)) == 0) System.out.println("Es potencia de 2.");
        else System.out.println("No es potencia de 2.");
    }
 // EJERCICIO 18
    public static void invertirNumero(Scanner sc) {
        System.out.print("Ingrese número: ");
        int n = sc.nextInt();
        int invertido = 0;
        while(n != 0) {
            invertido = invertido * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Número invertido: " + invertido);
    }
 // EJERCICIO 19
    public static void sumaParOImpar(Scanner sc) {
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();
        int suma = (n * (n + 1)) / 2;
        System.out.println("La suma es " + suma + " y es " + (suma % 2 == 0 ? "Par" : "Impar"));
    }
}



