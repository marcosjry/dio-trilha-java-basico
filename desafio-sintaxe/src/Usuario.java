import java.util.Locale;
import java.util.Scanner;

public class Usuario {
    
    
    public static void main(String[] args) {
        
        ContaBanco usuario = new ContaBanco();
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta:");
        usuario.numeroConta = scanner.nextInt();
        
        System.out.println("Digite o número da sua Agencia e o dígito:");
        usuario.agenciaConta = scanner.next();
        
        scanner.nextLine(); // para resolver erro de quebra de linha e o InputMismatchException
        System.out.println("Digite o seu Nome: ");
        usuario.nomeConta = scanner.nextLine();
        
        System.out.println("Digite o seu Saldo: ");
        usuario.saldoConta = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá "+usuario.nomeConta+", obrigado por criar uma conta em nosso banco, sua agência é "+usuario.agenciaConta+", conta "+usuario.numeroConta+" e seu saldo "+usuario.saldoConta+" já está disponível para saque.");

    }
}
