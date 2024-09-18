package sptech.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        Integer numero1 = scanner.nextInt();

        System.out.println("Digite outro número");
        Integer numero2 = scanner.nextInt();

        Integer resultado = calculadora.somar(numero1, numero2);

        System.out.println(resultado);

    }
}