package sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Prateleiras {
    private List<Livro> livros;
    private Integer limite;
    private Double peso;

    public Prateleiras(Integer limite, Double peso){
        this.livros = new ArrayList<>();
        this.limite = limite;
        this.peso = peso;
    }

    public void adicionarLivro(Livro livro){
        if(livros.size() <= limite){
            this.livros.add(livro);
        } else {
            System.out.println("A prateleira está cheia!");
        }
    }

    public void removerLivro(String codigo){
        this.livros.remove(codigo);
    }

    public Integer quantidadeLivros(){
        return livros.size();
    }

    public Double getPesoTotal(){
        Double pesoTotal = 0.0;

        for (int i = 0; i < livros.size(); i++) {
            pesoTotal += livros.get(i).calcularPeso();
        }

        return pesoTotal + peso;
    }

    public Livro getLivroPorNome(String nome){
        for( Livro livro : livros){
            if(livro.getNome().equalsIgnoreCase(nome)){
                return livro;
            }
        }

        return null;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
