package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private List<Double> notas;
    private Integer ra;
    private String nome;

    public Aluno(Integer ra, String nome){
        this.ra = ra;
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(Double nota){
        this.notas.add(nota);
    }

    public Double calcularMedia(){
        if(this.notas.isEmpty()){
            return 0.0;
        } else {
            Double soma = 0.0;

            for (double i : notas){
                soma += i;
            }

            return soma / this.notas.size();
        }
    }

    public List<Double> getNotas() {
        return notas;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
