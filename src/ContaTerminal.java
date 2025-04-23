import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Digite o seu primeiro nome:");
     String nome = sc.nextLine();

     System.out.println("Digite o número da sua agencia:");
     String agencia = sc.nextLine();

     System.out.println("Digite o número da conta:");
     String numero = sc.nextLine();

     System.out.println("Fale o seu saldo:");
     Float saldo = sc.nextFloat();

    
    
     System.out.println("Olá " + nome +  ",obrigado por criar uma conta em nosso banco, sua agência é "  + agencia + ",conta "  + numero +  "e seu saldo R$" + saldo + " já está disponível para saque");
     sc.close();
    }
}
