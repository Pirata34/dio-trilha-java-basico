import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuario
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next(); // Assuming the agency number might contain letters or symbols

        System.out.println("Por favor, digite o seu nome:");
        scanner.nextLine(); // Consuming the leftover newline
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem final ou a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta número " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}

