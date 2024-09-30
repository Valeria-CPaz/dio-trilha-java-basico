import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // Criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Armazenando os dados do usuario
        // Nome
        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.next();

        // Sobrenome
        System.out.println("Por favor, digite seu sobrenome:");
        String sobrenome = scanner.next();

        // Agencia
        System.out.println("Por favor, digite o numero de sua agência:");
        String agencia = scanner.next();

        // Conta Corrente
        System.out.println("Por favor, digite o número de sua conta:");
        int numeroConta = scanner.nextInt();

        // Saldo
        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo Mensagem final
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}