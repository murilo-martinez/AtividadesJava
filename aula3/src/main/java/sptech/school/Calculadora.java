package sptech.school;

public class Calculadora {

        // métodos e atributos

        /*
             Uma classe é uma receita
             Dado essa receita, vc pode gerara "instancia"
             Calculadora calc = new Calculator(); // instancia

             Atributos (camps):
             Integer numeroOperacoes = 0;

             Método(função):
             function somar(num1, num2){ // JS
                soma = num1 + num2
             }

             void somar(Integer n1, n2){ Java
                   ...
             }
         */

        // Sobrecarga de métodos maneiras diferentes de usar o mesmo método

        Integer quantidadeOperacoes = 0;

        Integer somar(Integer num1, Integer num2){
            System.out.println(num1 + num2);
            quantidadeOperacoes++;
        }

        String saudacao(){
            return "Olá";
        }
}
