import java.util.Locale; //localidade
import java.util.Scanner; //permite que o usuario interaja com o terminal.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //criando um novo objeto.

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite sua agência: ");
        String agencia = scanner.next(); //texto pq tem o digito, exemplo: 067-8

        System.out.println("Por favor, digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();


        double saldo = 575.90;

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigada por criar uma conta em nosso banco! Sua agência é " + agencia + " e sua conta " + numeroConta + ". Consta aqui que seu saldo é no valor de R$" + saldo + " e já está disponivel para saque, aproveite!");
    }
}
