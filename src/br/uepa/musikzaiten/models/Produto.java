package br.uepa.musikzaiten.models;

public class Produto {

    //Atributos
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    //Construtor
    public Produto( int id, String nome, double preco, int quantidadeEstoque){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }


    //Gets e Sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //Sobrescrita
    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Preço: R$ " + preco + ", Quantidade: " + quantidadeEstoque;
    }
}
