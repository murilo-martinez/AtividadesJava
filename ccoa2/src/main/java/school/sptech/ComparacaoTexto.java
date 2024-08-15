package school.sptech;

import java.util.Scanner;

public class ComparacaoTexto {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um nome:");
        String nome1 = leitor.nextLine();
        String nome2 = "Murilo";

        if(nome1.equalsIgnoreCase(nome2)){
            System.out.println("É igual");
        } else {
            System.out.println("Diferente");
        }
    }
}
