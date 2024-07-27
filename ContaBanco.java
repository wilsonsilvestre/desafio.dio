import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   


        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        // Solicitação dos dados ao usuário
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();


        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo   
 inicial: ");
        saldo = scanner.nextFloat();

        // Exibição das informações
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já
 está disponível para saque.");


        scanner.close();
    }
}