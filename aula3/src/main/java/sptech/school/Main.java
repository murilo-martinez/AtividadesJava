package sptech.school;

import static java.lang.System.in;
import static java.lang.System.setOut;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aula 03");

        // Exemplo de vetor inicializado

        Scanner scanner = new Scanner(System.in);

        String[] nomesFilmes = {"Titanic", "Matrix", "Lagoa Azul"};

        Integer quantidade = scanner.nextInt();

        Integer[] numerosEscolhidos = new Integer[quantidade];

        for (int i = 0; i < numerosEscolhidos.length; i++) {
            System.out.println("Digite o %d numero".formatted(i + 1));
            numerosEscolhidos[i] = scanner.nextInt();
        }

        System.out.println(numerosEscolhidos);

        // For each -> For aprimorado (enhanced)
        for(Integer inteiroDaVez : numerosEscolhidos){
            System.out.println(inteiroDaVez);
        }

        for (int i = 0; i < numerosEscolhidos.length; i++) {
            Integer numeroVez = numerosEscolhidos[i];
            System.out.println(numeroVez);
        }
    }
}