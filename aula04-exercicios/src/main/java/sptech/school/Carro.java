package sptech.school;

public class Carro {
    String modelo;
    String fabricante;
    Integer anoLancamento;
    Double velocidade = 0.0;

    // VOID -> uqe esse metodo não retorna "nada"
    // Assiantura do metodo
    // modificador acesso* tipo de retorno
    void acelerar(){
        velocidade += 10;
    }
}
