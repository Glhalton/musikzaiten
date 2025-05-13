package br.uepa.musikzaiten.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

    //------Lista-de-Produtos-Estoque-------
    private static ArrayList<Produto> produtos = new ArrayList<>();

    //------------Gets-e-Sets------------
    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }
    public static void setProdutos(ArrayList<Produto> produtos) {
        Estoque.produtos = produtos;
    }


    //--------------MÉTODOS-------------
    //---------Cadastrar-Produto--------
    public static void cadastrarProduto(Produto produto){
        produtos.add(produto);
    }

    //---------Remover-Produto-----------
    public static void removerProduto(int id){
        int count = 0;
        for(Produto produto : produtos){
            if(produto.getId() == id){
                count = 1;
            }
        }
        if(count == 0){
            System.out.println("Produto não encontrado");
        } else{
            produtos.removeIf(prod -> prod.getId() == id);
            System.out.println("Produto removido com sucesso");
        }
    }

    //---------Consultar-Produtos-----------
    public static void consultarProduto(){
        if(produtos.isEmpty()){
            System.out.println("Nenhum produto encontrado");
        } else{
            for(Produto produto : produtos){
                System.out.println(produto);
            }
        }
    }

    //---------Editar-Produto-----------
    public static void editarProduto(int id){

        Scanner ler = new Scanner(System.in);
        int count = 0;

        for(Produto produto : produtos){
            if(produto.getId() == id){

                System.out.print("Digite o nome do produto: ");
                String nomeProdutoEditado = ler.nextLine();
                System.out.print("Digite o preco do produto: ");
                double precoProdutoEditado = ler.nextDouble();
                System.out.print("Digite a quantidade no estoque ");
                int quantidadeEstoqueEditado= ler.nextInt();

                produto.setNome(nomeProdutoEditado);
                produto.setPreco(precoProdutoEditado);
                produto.setQuantidadeEstoque(quantidadeEstoqueEditado);

                System.out.printf("O produto %d foi editado com sucesso", id);

                count = 1;
            }
        }
        if(count == 0){
            System.out.print("Produto não encontrado");
        }
    }
}
