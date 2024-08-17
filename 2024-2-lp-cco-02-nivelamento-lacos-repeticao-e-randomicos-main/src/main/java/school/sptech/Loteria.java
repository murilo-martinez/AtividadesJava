package school.sptech;

import java.util.Random;
import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner scanner = new Scanner(System.in);

        Integer tentativas;

        for (tentativas = 1; ; tentativas++){
            System.out.print("Escolha um número de 0 a 10: ");
            Integer numeroUsuario = scanner.nextInt();
            Integer numeroAleatorio = aleatorio.nextInt(0,10);

            if(numeroAleatorio != numeroUsuario){
                System.out.println("O número aleátorio era: " + numeroAleatorio);
                tentativas++;
            } else {
                break;
            }
        }

        if(tentativas <= 3){
            System.out.println("Você é MUITO sortudo");
        } else if(tentativas <= 10){
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}
