package school.sptech;
import java.util.Scanner;

public class CalculoRenda {
    public static void main(String[] args) {
        // Jeito 1
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de filhos de 0 a 3 anos que você tem: ");
        Integer qtdFilhos0a3anos = scanner.nextInt();

        System.out.print("Digite a quantidade de filhos de 4 a 16 anos que você tem: ");
        Integer qtdFilhos4a16anos = scanner.nextInt();

        System.out.print("Digite a quantidade de filhos de 17 a 18 anos que você tem: ");
        Integer qtdFilhos17a18anos = scanner.nextInt();

        Integer totalFilhos = qtdFilhos0a3anos + qtdFilhos4a16anos + qtdFilhos17a18anos;

        Double valorDaBolsa0a3anos = 25.12;
        Double valorDaBolsa4a16anos = 15.88;
        Double valorDaBolsa17a18anos = 12.44;

        Double valorBolsaTotal = (qtdFilhos0a3anos * valorDaBolsa0a3anos) +
                (qtdFilhos4a16anos * valorDaBolsa4a16anos) +
                (qtdFilhos17a18anos * valorDaBolsa17a18anos);

        System.out.println("Você tem um total de " + totalFilhos + " filhos e vai receber R$"
                + valorBolsaTotal + " de bolsa");
         */

        // Jeito 2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de filhos de 0 a 3 anos que você tem: ");
        Integer qtdFilhos0a3anos = scanner.nextInt();

        System.out.print("Digite a quantidade de filhos de 4 a 16 anos que você tem: ");
        Integer qtdFilhos4a16anos = scanner.nextInt();

        System.out.print("Digite a quantidade de filhos de 17 a 18 anos que você tem: ");
        Integer qtdFilhos17a18anos = scanner.nextInt();

        Double valorBolsaTotal = 0.0;

        if(qtdFilhos0a3anos > 0){
            valorBolsaTotal += qtdFilhos0a3anos * 25.12;
        }

        if(qtdFilhos4a16anos > 0){
            valorBolsaTotal += qtdFilhos4a16anos * 15.88;
        }

        if(qtdFilhos17a18anos > 0){
            valorBolsaTotal += qtdFilhos17a18anos * 12.44;
        }

        Integer totalFilhos = qtdFilhos0a3anos + qtdFilhos4a16anos + qtdFilhos17a18anos;

        System.out.println("Você tem um total de " + totalFilhos + " filhos e vai receber R$"
                + valorBolsaTotal + " de bolsa");


    }
}
