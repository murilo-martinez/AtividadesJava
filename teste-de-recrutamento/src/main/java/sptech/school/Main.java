package sptech.school;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(123,"Murilo");
        Aluno a2 = new Aluno(127,"Murilo Cardoso");
        Aluno a3 = new Aluno(155, "João");
        Aluno a4 = new Aluno(567, "Marcos");
        Aluno a5 = new Aluno(789, "Tulio");

        Turma t1 = new Turma("CCO");

        a1.adicionarNota(5.0);
        a1.adicionarNota(5.0);

        a2.adicionarNota(5.7);
        a2.adicionarNota(9.7);

        a3.adicionarNota(1.0);
        a3.adicionarNota(4.5);

        a4.adicionarNota(2.0);
        a4.adicionarNota(6.5);

        a5.adicionarNota(8.0);
        a5.adicionarNota(9.5);

        System.out.println(a1.calcularMedia());
        System.out.println(a2.calcularMedia());
        System.out.println(a3.calcularMedia());

        t1.adicionarAluno(a1);
        t1.adicionarAluno(a2);
        t1.adicionarAluno(a3);
        t1.adicionarAluno(a4);
        t1.adicionarAluno(a5);

        System.out.println(t1.getAlunos());

        System.out.println(t1.getAlunoPorNome("Murilo"));

        System.out.println(t1.getAlunoComMaiorMedia());
        System.out.println(t1.getAlunoComMenorMedia());

        System.out.println(t1.calcularMediaDaTurma());

        System.out.println(t1.getMediaPorRa(123));

        System.out.println(t1.getMediana());

    }
}