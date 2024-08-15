package school.sptech;
import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua primeira nota: ");
        Double primeiraNota = scanner.nextDouble();

        System.out.print("Digite a sua segunda nota: ");
        Double segundaNota = scanner.nextDouble();

        Double media = (primeiraNota + segundaNota) / 2;

        System.out.println("Olá, " + nome + ". Sua média foi de " + media);
    }
}
