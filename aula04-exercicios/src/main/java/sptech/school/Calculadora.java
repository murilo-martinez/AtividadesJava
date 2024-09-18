package sptech.school;

import java.util.List;

public class Calculadora {

    Integer quantidadeOperacoes;

    /*
    void somar(Integer x, Integer y){
        System.out.println(x + y);
    }
     */

    // Sobrecarga
    /*
    void somar(Integer x, Integer y, Integer z){
        System.out.println(x + y + z);
    }
     */

    /*
    void somar(List<Integer> inteiros){
        Integer resultado = 0;

        for(Integer numeroDaVez : inteiros){
            resultado += numeroDaVez;
        }

        System.out.println(resultado);
    }
     */

    void subtrair(Integer numero1, Integer numero2){

    }

    Integer somar(Integer x, Integer y){
        quantidadeOperacoes++;
        return (x + y);
    }
}
