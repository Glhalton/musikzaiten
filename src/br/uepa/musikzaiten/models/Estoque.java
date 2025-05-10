package br.uepa.musikzaiten.models;

import java.util.ArrayList;

public class Estoque {
    private static ArrayList<Produto> produtos = new ArrayList<>();

    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public static void setProdutos(ArrayList<Produto> produtos) {
        Estoque.produtos = produtos;
    }

    public static void cadastrarProduto(Produto produto){
        produtos.add(produto);
    }

    public static void removerProduto(int id){
        produtos.removeIf(produto -> produto.getId() == id);
    }

    public static void consultarProduto(){
        if(produtos.isEmpty()){
            System.out.println("Nenhum produto encontrado");
        } else{
            for(Produto produto : produtos){
                System.out.println(produto);
            }
        }
    }

    public static void editarProduto(int id, String nome, double preco, int quantidade){
        for(Produto produto : produtos){
            if(produto.getId() == id){
                produto.setNome(nome);
                produto.setPreco(preco);
                produto.setQuantidadeEstoque(quantidade);
            }
        }
    }


}
