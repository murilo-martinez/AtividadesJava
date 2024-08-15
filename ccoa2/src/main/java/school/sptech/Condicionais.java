package school.sptech;
import java.util.Scanner;

// PascalCase
public class Condicionais {
    /*
        Projetos Java tem pelo menos 1
        método main(Entrypoint)

        Geralmente utilizamos em projeto reais
        apenas 1

        TODO: Arrumar isso depois
     */
    public static void main(String[] args){
        Integer idade = 18;
        Boolean isMaiorDeIdade = idade >= 18;
        // Exp. que resulte em boolean
        // Operador ternário (if de uma linha)
        String resultadoFormatado = isMaiorDeIdade ? "É maior de idade"
                : "Não é maior de idade";

        System.out.println(resultadoFormatado);
        Scanner scanner = new Scanner(System.in);

        // SWITCH CASE
        System.out.print("Digite uma opção:");
        Integer opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Opção 1");
                break;
            case 2:
                System.out.println("Opção 2");
                break;
            case 3:
                System.out.println("Opção 3");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
