package br.uepa.musikzaiten.models;

public class Estoquista extends Usuario {
    public void consultarProduto(){
        Estoque.consultarProduto();
    }

    public void removerProduto(int id){
        Estoque.removerProduto(id);
        System.out.println("Produto removido com sucesso");
    }

    public void cadastrarProduto(Produto produto){
        Estoque.cadastrarProduto(produto);
        System.out.println("Produto cadastrado com sucesso");
        System.out.println();
    }

    public void editarProduto(int id){

    }


}
