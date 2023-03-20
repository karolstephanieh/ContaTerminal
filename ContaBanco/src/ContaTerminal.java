import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Qual o número de sua agência? ");
        int agencia = sc.nextInt();

        System.out.println("Qual o número de sua conta? ");
        int conta = sc.nextInt();

        sc.close();

        double saldo = 100.53;



        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco sua agência é " + agencia + " conta " + conta + ", e seu saldo " + saldo + " já está disponível para saque");
    }
}
