package Dominios;

import java.io.Serializable;

public class PontoTuristico implements Serializable {

    public PontoTuristico(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    String avaliacao = "";
    String nome;
    String descricao;
    String reclamacao;
    double preco;
    
    public void criarAvaliacao(String avaliacao){
        this.avaliacao = avaliacao;
    }
    
    public void criarReclamacao(String reclamacao){
        this.reclamacao = reclamacao;
    }
    
    
    public String getAvaliacao() {
        return avaliacao;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getReclamacao() {
        return reclamacao;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    
    @Override
    public String toString() {
        return nome;
    }

}
