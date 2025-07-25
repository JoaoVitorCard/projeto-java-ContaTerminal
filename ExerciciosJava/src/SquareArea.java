/*
    Exercício
    Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas.
*/

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        System.out.print("Digite o nome de uma pessoa:\n");
        var name1 = new Scanner(System.in).nextLine();
        System.out.print("Digite a idade dessa pessoa:\n");
        var age1 = new Scanner(System.in).nextInt();
        System.out.print("Digite o nome da segunda pessoa:\n");
        var name2 = new Scanner(System.in).nextLine();
        System.out.print("Digite a idade dessa pessoa:\n");
        var age2 = new Scanner(System.in).nextInt();
        var ageDifference = age1 - age2;
        System.out.printf("A diferença de idade entre %s e %s é de: %s anos.", name1, name2, Math.abs(ageDifference));
    }
}
