package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calcular = new Calculadora();
        int opcion=0, num1=0, num2=0;
        boolean entradaCorrecta=false;
        do {
            try {
                System.out.print("Introduce el primer número: ");
                num1 = sc.nextInt();
                System.out.print("Introduce el segundo número: ");
                num2 = sc.nextInt();
                entradaCorrecta=true;
            } catch (InputMismatchException e) {
                System.out.println("Error: ingresa numeros, no letras.");
                entradaCorrecta=false;
                sc.nextLine();
            }
        }while(!entradaCorrecta);
        do {
            try {
                System.out.println("Elige la operación:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("Otro numero. Salir");
                opcion = sc.nextInt();
                if (opcion == 1) {
                    System.out.println("Resultado: " + calcular.sumar(num1, num2));
                } else if (opcion == 2) {
                    System.out.println("Resultado: " + calcular.restar(num1, num2));
                }
            } catch (ArithmeticException e) {
                System.out.println("Sintax Error");
                sc.nextLine();
                //Imprime Sintax error si se cumple la excepcion
            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine();
                //Imprime error si se cumple la excepcion
            }
        } while (opcion == 1 | opcion == 2);
        sc.close();
    }
}
