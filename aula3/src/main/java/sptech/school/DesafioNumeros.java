package sptech.school;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioNumeros {
    public static void main(String[] args) {
        Integer numeroDigitado;
        Integer somaDosNumeros = 0;
        Boolean run = true;
        Integer par = 0;
        Integer impar = 0;
        Integer menorValor = Integer.MAX_VALUE;
        Integer maiorValor = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);
        List lista = new ArrayList();

        while(run) {
            System.out.print("Digite um número para adicionar na lista, se quiser parar digite 0: ");
            numeroDigitado = scanner.nextInt();

            // Verifica se é para para o programa, se não for, adiciona um valor a lista
            if (numeroDigitado == 0) {
                break;
            } else {
                lista.add(numeroDigitado);
            }

            // Verifica se o número é par, se não for, é ímpar
            if(numeroDigitado % 2 == 0){
                par++;
            } else {
                impar++;
            }

            // Encontra o menor valor
            if(numeroDigitado < menorValor){
                menorValor = numeroDigitado;
            }

            // Encontra o maior valor
            if(numeroDigitado > maiorValor){
                maiorValor = numeroDigitado;
            }

            // Faz a soma dos números
            somaDosNumeros += numeroDigitado;
        }

        System.out.println(lista);
        System.out.print("Quantidade de números pares: ");
        System.out.println(par);
        System.out.print("Quantidade de números ímpares: ");
        System.out.println(impar);
        System.out.print("A soma de todos os número é igual a: ");
        System.out.println(somaDosNumeros);
        System.out.print("Maior valor: ");
        System.out.println(maiorValor);
        System.out.print("Menor valor: ");
        System.out.println(menorValor);
    }
}
