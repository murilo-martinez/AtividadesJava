package sptech.school;

public class Main {
    public static void main(String[] args) {
        Contato c1 = new Contato("Murilo", "(11)98765-6567");
        Contato c2 = new Contato("João", "(11)93456-1236");

        Grupo g1 = new Grupo("São Paulo");

        g1.adiciona(c1);
        g1.adiciona(c2);


        System.out.println(g1.getContatos());

        System.out.print("Quantidade de membros: ");
        System.out.println(g1.getQuantidadeContatos());
    }
}