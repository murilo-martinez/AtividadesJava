package school.sptech;

public class InterpolacaoDeTexto {
    public static void main(String[] args) {
        String filme = "Titanic";
        Integer anoLancamento = 1998;
        Double bilheteria = 10.125;

        String frase1 = "Nome filme: " + filme + " ano de lançamento: " + anoLancamento;
        System.out.println(frase1);

        String frase2 = String.format("Nome filme: %s Ano Lançamento: %d Bilheteria: %.2f", filme, anoLancamento,bilheteria);
        System.out.println(frase2);

        String frase3 = "Nome filme: %s Ano Lançamento: %d Bilheteria: %.2f".formatted(filme,anoLancamento,bilheteria);
        System.out.println(frase3);

        String frase4 = """
                Nome filme: %s 
                Ano Lançamento: %d 
                Bilheteria: %.2f
                """.formatted(filme,anoLancamento,bilheteria);
        System.out.println(frase4);
    }
}
