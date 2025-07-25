/*
    Exercício
    Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela.
       Fórmula: área = lado * lado
*/

import java.util.Scanner;

public class AgeDifference {
    public static void main(String[] args) {
        System.out.printf("Para calcular a área do quadrado, digite o seu tamanho:\n");
        var sizeOfSquare = new Scanner(System.in).nextInt();
        var result = sizeOfSquare * sizeOfSquare;
        System.out.printf("A área do quadrado é: %s m.", result);
    }
}
