package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        Integer[] numerosInteiros = new Integer[5];

        // PESSIMO!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // Object[] bizarro = new Object[10];

//        for (int i = 0; i < nomes.length; i++) {
////            System.out.println(i);
//            nomes[i] = "TESTE";
//
//        }
//
//        for (int i = 0; i < nomes.length; i++) {
//            System.out.println(nomes[i]);
//        }

        /*
            Listas em Java são vetores flexíveis
         */

//        List listaEstranha = new ArrayList();
//
//        listaEstranha.add(3);
//        listaEstranha.add("Murilo");
//        listaEstranha.add(true);
//        listaEstranha.add(1.71);
//
//        for (int i = 0; i < listaEstranha.size(); i++) {
//            System.out.println(listaEstranha.get(i));
//        }

        List filmes = new ArrayList();

        filmes.add("Matrix");
        filmes.add("Irmao Urso");

        System.out.println(filmes);

        filmes.remove(1);
        System.out.println(filmes);

        // Substitui o valor
        filmes.set(0,"Meu malvado favorito");
        System.out.println(filmes);

        // Recupera um valor da posição especificada
        Object filmeDevolvido = filmes.get(0);
        System.out.println(filmeDevolvido);

        // Devolve a quantidade de elementos que tem na lista
        System.out.println(filmes.size());

        if(filmes.isEmpty()){
            System.out.println("Está Vazia!");
        } else {
            System.out.println("Tem alguma coisa!");
        }
    }
}
