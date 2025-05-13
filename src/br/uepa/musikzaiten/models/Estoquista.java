package br.uepa.musikzaiten.models;

public class Estoquista extends Usuario {
    public void consultarProduto(){
        Estoque.consultarProduto();
    }

    public Estoquista(int id, String nome, String cpf, String email){
        super(id, nome, cpf, email);
    }

    //--------------MÉTODOS-------------
    //----------Remover-Produto-----------
    public void removerProduto(int id){
        Estoque.removerProduto(id);
    }

    //----------Cadastrar-Produto-----------
    public void cadastrarProduto(Produto produto){
        Estoque.cadastrarProduto(produto);
        System.out.println("Produto cadastrado com sucesso");
        System.out.println();
    }

    //------------Editar-Produto-----------
    public void editarProduto(int id){

        Estoque.editarProduto(id);
        System.out.println();
    }


}
