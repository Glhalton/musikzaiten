package br.uepa.musikzaiten.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

    //Lista de Produtos Estoque
    private static ArrayList<Produto> produtos = new ArrayList<>();

    //Gets e Sets
    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }
    public static void setProdutos(ArrayList<Produto> produtos) {
        Estoque.produtos = produtos;
    }


    //--------------MÉTODOS-------------
    //Consultar Produtos
    public static void consultarProduto(){
        if(!produtos.isEmpty()){
            for(Produto produto : produtos){
                System.out.println(produto);
            }

        }else{
            System.out.println("\nNenhum produto encontrado\n");
        }
    }

    //Cadastrar Produtos
    public static void cadastrarProduto(Produto produto){
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso\n");
    }

    //Remover Produtos
    public static void removerProduto(int id){
        boolean produtoEncontrado = false;
        int indexProduto = 0;

        for(Produto produto : produtos){
            if(produto.getId() == id){
                indexProduto = produtos.indexOf(produto);
                produtoEncontrado = true;
            }
        }
        if(produtoEncontrado){
            produtos.remove(indexProduto);
            System.out.println("Produto removido com sucesso\n");

        } else{
            System.out.println("Produto não encontrado\n");
        }
    }

    //Editar Produtos
    public static void editarProduto(int id){

        Scanner ler = new Scanner(System.in);
        boolean produtoEncontrado = false;

        for(Produto produto : produtos){
            if(produto.getId() == id){
                produtoEncontrado = true;

                System.out.print("Digite o nome do produto: ");
                produto.setNome(ler.nextLine());
                System.out.print("Digite o preco do produto: ");
                produto.setPreco(ler.nextDouble());
                System.out.print("Digite a quantidade no estoque ");
                produto.setQuantidadeEstoque(ler.nextInt());

                System.out.printf("O produto %d foi editado com sucesso\n", id);

            }
        }
        if(!produtoEncontrado){
            System.out.print("Produto não encontrado\n");
        }
    }
}
