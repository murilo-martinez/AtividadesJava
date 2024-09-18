package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno> alunos;
    private String nomeTurma;

    public Turma(String nomeTurma){
        this.nomeTurma = nomeTurma;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public Aluno getAlunoPorRa(Integer ra){
        for(Aluno aluno : alunos){
            if(aluno.getRa().equals(ra)){
                return aluno;
            }
        }

        return null;
    }

    public List<Aluno> getAlunoPorNome(String nome){
        List<Aluno> alunosQueCorrespondem = new ArrayList<>();

        for(Aluno aluno : alunos){
            if(aluno.getNome().toLowerCase().contains(nome.toLowerCase())){
                alunosQueCorrespondem.add(aluno);
            }
        }

        return alunosQueCorrespondem;
    }

    public Aluno getAlunoComMaiorMedia(){
        Aluno alunoComMaiorMedia = null;

        for(Aluno aluno : alunos){
            if(alunoComMaiorMedia == null || aluno.calcularMedia() > alunoComMaiorMedia.calcularMedia()){
                alunoComMaiorMedia = aluno;
            }

        }

        return alunoComMaiorMedia;
    }

    public Aluno getAlunoComMenorMedia(){
        Aluno alunoComMaiorMedia = null;

        for(Aluno aluno : alunos){
            if(alunoComMaiorMedia == null || aluno.calcularMedia() < alunoComMaiorMedia.calcularMedia()){
                alunoComMaiorMedia = aluno;
            }

        }

        return alunoComMaiorMedia;
    }

    public Double calcularMediaDaTurma(){
        Double somaDasMedias = 0.0;

        for(Aluno aluno : alunos){
            somaDasMedias += aluno.calcularMedia();
        }

        return somaDasMedias / alunos.size();
    }

    public Double getMediaPorRa(Integer ra){
        Aluno aluno = getAlunoPorRa(ra);

        if(aluno != null){
            return aluno.calcularMedia();
        }

        return 0.0;
    }

    public Double getMediana(){
        List<Double> medias = new ArrayList<>();

        for(Aluno aluno : alunos){
            medias.add(aluno.calcularMedia());
        }

        int tamanho = medias.size();

        if(tamanho % 2 == 1){
            return medias.get(tamanho / 2);
        } else {
            int meio = tamanho / 2;
            return (medias.get(meio - 1) + medias.get(meio)) / 2;
        }
    }


    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }
}
