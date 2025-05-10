package br.uepa.musikzaiten.models;

import java.util.ArrayList;

public class Estoque {
    private static ArrayList<Produto> produtos = new ArrayList<>();

    public static void cadastrarProduto(Produto produto){
        produtos.add(produto);
    }

    public static void removerProduto(int id){
        produtos.removeIf(produto -> produto.getId() == id);
    }

    public static void consultarProduto(){
        for(Produto produto : produtos){
            System.out.println(produto);
        }
    }

    public static void editarProduto(int id){
        for(Produto produto : produtos){
            if(produto.getId() == id){
                System.out.print("Digite o nome do produto: ");
            }
        }
    }


}
