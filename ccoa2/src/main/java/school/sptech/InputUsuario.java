package school.sptech;
import java.util.Scanner;

public class InputUsuario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.print("Agora, digite sua idade:");
        Integer idade = scanner.nextInt();
        System.out.println("Olá, " + nome + " seja bem-vindo! Você tem " + idade + " anos");



;    }
}
