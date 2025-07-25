/*
    Exercício
    Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela.
       Fórmula: área = base * altura
*/

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        System.out.print("Para calcular a área do retângulo, digite primeiro o valor de sua base:\n");
        var baseArea = new Scanner(System.in).nextInt();
        System.out.print("Agora digite o valor de sua altura:\n");
        var altura = new Scanner(System.in).nextInt();
        var result = baseArea * altura;
        System.out.printf("A área do retângulo é: %s m.", result);
    }
}
