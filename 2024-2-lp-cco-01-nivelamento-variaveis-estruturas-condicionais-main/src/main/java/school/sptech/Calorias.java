package school.sptech;
import java.util.Scanner;

public class Calorias {
    public static void main(String[] args) {
        // Jeito 1
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de tempo, em minutos que você passou se aquecendo: ");
        Integer qtdTempoAquecimento = scanner.nextInt();

        System.out.print("Digite a quantidade de tempo, em minutos que você fez exercícios aeróbicos (correr, andar, pedalar etc): ");
        Integer qtdTempoAerobicos = scanner.nextInt();

        System.out.print("Digite a quantidade de tempo, em minutos que você fez exercícios de musculação: ");
        Integer qtdTempoMusculacao = scanner.nextInt();

        Integer caloriasAquecimento = 12;
        Integer caloriasAerobicos = 20;
        Integer caloriasMusculacao = 25;

        Integer caloriasPerdidas = (qtdTempoAquecimento * caloriasAquecimento) + (qtdTempoAerobicos * caloriasAerobicos)
                + (qtdTempoMusculacao * caloriasMusculacao);

        Integer tempoTotalExercicios = qtdTempoAquecimento + qtdTempoAerobicos + qtdTempoMusculacao;

        System.out.println("Olá, Jorge. Você fez um total de " + tempoTotalExercicios + " minutos de exercícios e perdeu cerca de "
                + caloriasPerdidas + " calorias.");
         */

        // Jeito 2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de tempo, em minutos que você passou se aquecendo: ");
        Integer qtdTempoAquecimento = scanner.nextInt();

        System.out.print("Digite a quantidade de tempo, em minutos que você fez exercícios aeróbicos (correr, andar, pedalar etc): ");
        Integer qtdTempoAerobicos = scanner.nextInt();

        System.out.print("Digite a quantidade de tempo, em minutos que você fez exercícios de musculação: ");
        Integer qtdTempoMusculacao = scanner.nextInt();

        Integer caloriasPerdidas = 0;

        if(qtdTempoAquecimento > 0){
            caloriasPerdidas = qtdTempoAquecimento * 12;
        }

        if(qtdTempoAerobicos > 0){
            caloriasPerdidas += qtdTempoAerobicos * 20;
        }

        if(qtdTempoMusculacao > 0){
            caloriasPerdidas += qtdTempoMusculacao * 25;
        }

        Integer tempoTotalExercicios = qtdTempoAquecimento + qtdTempoAerobicos + qtdTempoMusculacao;

        System.out.println("Olá, Jorge. Você fez um total de " + tempoTotalExercicios + " minutos de exercícios e perdeu cerca de "
                + caloriasPerdidas + " calorias.");
    }
}
