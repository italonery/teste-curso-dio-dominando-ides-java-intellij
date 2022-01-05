package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro número: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        b = scan.nextInt();

        int adicao = adicao(a, b);
        int subtracao = subtracao(a, b);
        int multiplicacao = multiplicacao(a, b);
        double divisao = divisao(a, b);

        System.out.println("Adição = " + adicao);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);
    }

    public static int adicao(int a, int b) {
        return a + b;
    }
    public static int subtracao(int a, int b) {
        return a - b;
    }
    public static int multiplicacao(int a, int b) {
        return a * b;
    }
    public static double divisao(double a, double b) {
        return a / b;
    }
}
