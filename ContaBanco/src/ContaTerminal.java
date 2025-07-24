import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        var numberAccount = scanner.nextInt();
        System.out.println("Digite o número da agência: ");
        var agencyAccount = scanner.next();
        System.out.println("Digite o nome do titular: ");
        var nameAccount = scanner.next();
        System.out.println("Digite o saldo da conta: ");
        var balanceAccount = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$%s já está disponível para saque.\n", nameAccount, agencyAccount, numberAccount, balanceAccount);
    }
}
