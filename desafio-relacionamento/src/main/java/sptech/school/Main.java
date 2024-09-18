package sptech.school;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("TESTE", "teste", "tEste", 12);
        Livro l2 = new Livro("TESTE", "teste", "tEste", 12);
        Livro l3 = new Livro("TESTE", "teste", "tEste", 12);

        Prateleiras p1 = new Prateleiras(3, 1.2);

        p1.adicionarLivro(l1);
        p1.adicionarLivro(l2);
        p1.adicionarLivro(l3);

        System.out.println(p1.quantidadeLivros());

        System.out.println(p1.getPesoTotal());
        System.out.println(p1.getLivroPorNome("teste").toString());
    }
}