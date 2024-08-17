package school.sptech;

import java.util.Random;

public class Votacao {
    public static void main(String[] args) {
        Integer votoMussalera = 0;
        Integer votoCalabresa = 0;
        Integer votoQuatroQueijos = 0;
        Integer votoAleatorio;

        Random random = new Random();

        for (int i = 1; i <= 10; i++){
            votoAleatorio = random.nextInt(1,4);

            /*
            switch (votoAleatorio){
                case 1:
                    votoMussalera++;
                    break;
                case 2:
                    votoCalabresa++;
                    break;
                case 3:
                    votoQuatroQueijos++;
                    break;

            }
             */

            if(votoAleatorio == 1){
                votoMussalera++;
            } else if(votoAleatorio == 2){
                votoCalabresa++;
            } else{
                votoQuatroQueijos++;
            }
        }

        System.out.println("Sabor Mussarela teve: " + votoMussalera + " voto(s)");
        System.out.println("Sabor Calabresa teve: " + votoCalabresa + " voto(s)");
        System.out.println("Sabor Quatro Queijos teve: " + votoQuatroQueijos + " voto(s)");

        if(votoMussalera > votoCalabresa && votoMussalera > votoQuatroQueijos){
            System.out.println("Sabor prefiro segundo a pesquisa foi a Mussarela");
        } else if(votoCalabresa > votoMussalera && votoCalabresa > votoQuatroQueijos){
            System.out.println("Sabor prefiro segundo a pesquisa foi a Calabresa");
        } else if(votoQuatroQueijos > votoCalabresa && votoQuatroQueijos > votoMussalera){
            System.out.println("Sabor prefiro segundo a pesquisa foi o Quatro Queijos");
        } else {
            System.out.println("Houve um empate nos sabores");
        }

    }
}
