package school.sptech;

public class LacosRepeticao {
    public static void main(String[] args){
        for (int i = 0; i <= 3; i++) {
            System.out.println("Contador do FOR: " + i);
        }

        Integer contador = 0;
        while (contador < 3){
            System.out.println("Contador do While: " + contador);
            contador++;
        }

        Integer cont = 0;
        do {
            System.out.println("Contador do DO:" + cont);
            cont++;
        } while(cont < 3);


    }
}
