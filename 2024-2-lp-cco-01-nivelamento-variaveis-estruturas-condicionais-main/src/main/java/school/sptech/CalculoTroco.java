package school.sptech;
import java.util.Scanner;

public class CalculoTroco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor unitário para o seu produto: ");
        Integer valorProduto = scanner.nextInt();

        System.out.print("Digite a quantidade vendida: ");
        Integer qtdVendaProduto = scanner.nextInt();

        System.out.print("Digite o valor pago pelo cliente: ");
        Double valorCliente = scanner.nextDouble();

        Integer valorTotal = valorProduto * qtdVendaProduto;

        Double troco = valorCliente - valorTotal;

        System.out.println("Seu troco será de R$ " + troco);


    }
}
