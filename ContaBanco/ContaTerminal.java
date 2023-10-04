package ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nomeCliente = scan.nextLine();
        System.out.print("Agora, digite o número da Agência: ");
        String agencia = scan.nextLine();
        System.out.print("Digite o número da Conta: ");
        int numero = scan.nextInt();
        System.out.print("Por último, digite o Saldo: R$");
        double saldo = scan.nextDouble();
        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
