package school.sptech;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {
    public static void main(String[] args){
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            Integer numero = random.nextInt(0,20);
            System.out.println(numero);
        }

        Double numeroQuebrados = Math.random() * 10;
        System.out.println(numeroQuebrados);

        Integer numero3 = ThreadLocalRandom.current().nextInt(0,20);
        System.out.println(numero3);

    }
}
