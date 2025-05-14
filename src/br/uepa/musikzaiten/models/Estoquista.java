package br.uepa.musikzaiten.models;

public class Estoquista extends Usuario {

    //Construtor
    public Estoquista(int id, String nome, String cpf, String email){
        super(id, nome, cpf, email);
    }

    //--------------MÉTODOS-------------
    //Consultar Produto
    public void consultarProduto(){
        Estoque.consultarProduto();
    }

    //Remover Produto
    public void removerProduto(int id){
        Estoque.removerProduto(id);
    }

    //Cadastrar Produto
    public void cadastrarProduto(Produto produto){
        Estoque.cadastrarProduto(produto);
    }

    //Editar Produto
    public void editarProduto(int id){
        Estoque.editarProduto(id);
    }


}
