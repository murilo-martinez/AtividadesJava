package school.sptech;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        Integer base = scanner.nextInt();

        System.out.print("Digite o expoente: ");
        Integer expoente = scanner.nextInt();

        Integer resultadoPotencia = 1;
        // Não posso colocar zero na variável porque quando for fazer a multiplicação
        // vai ficar zero sempre

        for (int i = 0; i < expoente; i++){
            resultadoPotencia *= base;
        }

        System.out.println("O valor de " + base + " elevado a " + expoente + " = " + resultadoPotencia);
    }
}
