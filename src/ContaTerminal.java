import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome!");
        String nome = input.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = input.nextLine();

        System.out.println("Por favor, digite o número!");
        int numero = input.nextInt();

        System.out.println("Por favor, digite o saldo!");
        double saldo = input.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque", nome, agencia, numero, saldo);

    }
}