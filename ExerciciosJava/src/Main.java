import java.time.Year;
import java.util.Scanner;

/*
    Exercício
    Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem "Olá `Fulano` você tem `X anos`". Finished
*/

public class Main {

    public static void main(String[] args) {
        System.out.print("Qual é o seu nome?\n");
        var name1 = new Scanner(System.in).nextLine();
        System.out.print("Qual seu ano de nascimento?\n");
        var birthYear = new Scanner(System.in).nextInt();
        var actualYear = Year.now().getValue();
        System.out.printf("Olá %s, você tem %s anos!", name1, (actualYear - birthYear));
    }
}