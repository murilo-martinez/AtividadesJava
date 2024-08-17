package school.sptech;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        Integer totalPares = 0;
        Integer totalImpares = 0;
        Integer numeroSorteio;
        Integer numeroUsuario;
        Boolean primeiraVez = true;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.print("Escolha um número de 1 a 100: ");
        numeroUsuario = scanner.nextInt();


        for (int i = 1; i <= 200; i++){
            numeroSorteio = random.nextInt(1, 100);

            if((numeroUsuario == numeroSorteio) && primeiraVez){
                System.out.println(i + "º posição: " + numeroUsuario);
                primeiraVez = false;
            }

            if(numeroSorteio % 2 == 0){
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        System.out.println("Total de números pares sorteados: " + totalPares);
        System.out.println("Total de números ímpares sorteados: " + totalImpares);
    }
}
