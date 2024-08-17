package school.sptech;

public class ContadorVariavel {
    public static void main(String[] args) {
        for(double i = 0.15; i < 5; i += 0.15){
            String frase = "%.2f".formatted(i);
            System.out.println(frase);
        }
    }
}
