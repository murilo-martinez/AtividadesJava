package school.sptech;

import java.util.Random;

public class Acumulador {
    public static void main(String[] args) {
        Random random = new Random();
        Integer somaDosAleatorios = 0;

        for (int i = 0; ; i++){
            Integer numeroAleatorio = random.nextInt(0,10);

            if(numeroAleatorio == 0){
                break;
            } else {
                somaDosAleatorios += numeroAleatorio;
            }
        }

        System.out.println("A soma dos números é: " + somaDosAleatorios);
    }
}
