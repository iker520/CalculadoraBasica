package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calcular = new Calculadora();
        int opcion=0;
        double num1 = 0, num2 = 0;
        boolean entradaCorrecta = false;
        do {
            try {
                System.out.print("Introduce el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Introduce el segundo número: ");
                num2 = sc.nextDouble();
                entradaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: ingresa numeros, no letras.");
                entradaCorrecta = false;
                sc.nextLine();
            }
        } while (!entradaCorrecta);
        do {
            try {
                System.out.println("Elige la operación:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Mcd");
                System.out.println("6. Mcm");
                System.out.println("Otro numero. Salir");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + calcular.sumar(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + calcular.restar(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + calcular.multiplicar(num1, num2));
                        break;
                    case 4:
                        System.out.println("Resultado: " + calcular.dividir(num1, num2));
                        break;
                    case 5:
                        System.out.println("Resultado MCD: " + calcular.mcd((int)num1, (int)num2));
                        break;
                    case 6:
                        System.out.println("Resultado MCM: " + calcular.mcm((int)num1, (int)num2));
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Sintax Error");
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: ingresa numeros, no letras.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine();
            }
        } while (opcion == 1 | opcion == 2 | opcion == 3 | opcion == 4 | opcion == 5 | opcion == 6);
        sc.close();
    }
}

