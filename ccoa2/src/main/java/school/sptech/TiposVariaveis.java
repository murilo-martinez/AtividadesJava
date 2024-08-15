package school.sptech;

public class TiposVariaveis {
    public static void main(String[] args){
        // Data types
        /*
            Classes Wrapper:
            String -> Texto (Sempre em aspas duplas)
            Integer -> Inteiro
            Double -> Números com ponto flutuante
            Boolean -> true | false
            Character -> 'a' (Sempre em aspas simples)
            Long -> inteiro 64
            Float -> Números com ponto flutuante (menor precisão)

            tipos primitivos:
            String -> NÃO POSSUI TIPO PRIMITIVO
            Integer -> int
            Double -> double
            Boolean -> boolean
            Character -> char
            Long -> long
            FLoat -> float

            Os tipos primitivos são somente uma representação
            Classes Wrapper são objetos na linguegem Java:
                - possuem métodos (função)
                - possuem caracteristicas
         */

        Integer numeroIntero1 = 18;
        String string = numeroIntero1.toString();
        System.out.println(string);

        String nome = "Murilo Martinez";
        Double altura = 1.71;
        // is | has
        Boolean isMaiorDeIdade = true;

        /*
            Java possuí tipagem estática
            JavaScript utiliza tipagem dinâmica
         */

        String nomeTeste;
        nomeTeste = "Murilo";
    }
}
