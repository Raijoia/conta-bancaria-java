import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int conta = 0;
        String agencia = "";
        String titular = "";
        double saldo = 0.0;

        while (conta == 0) {
            System.out.println("Por favor, digite o número da Conta!");
            conta = scanner.nextInt();
        }

        while (agencia == null || agencia.isEmpty()) {
            System.out.println("Por favor, digite o número da Agência!");
            agencia = scanner.nextLine();
        }

        while (titular == null || titular.isEmpty()) {
            System.out.println("Por favor, digite o nome do Titular!");
            titular = scanner.nextLine();
        }

        while (saldo == 0.0) {
            System.out.println("Por favor, digite o saldo da Conta!");
            saldo = scanner.nextDouble();
        }

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque!", titular, agencia, conta, saldo);

        scanner.close();
    }
}
