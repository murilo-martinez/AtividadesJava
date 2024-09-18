package sptech.school;

import java.util.ArrayList;
import java.util.List;

// Objeto todo
public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome){
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public void adiciona(Contato contato){
        this.contatos.add(contato);
    }

    public void remove(Contato contato){
        this.contatos.remove(contato);
    }

    public Integer getQuantidadeContatos(){
        return this.contatos.size();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }
}
