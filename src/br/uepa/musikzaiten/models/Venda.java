package br.uepa.musikzaiten.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venda {

    //Atributos
    private int id;
    private int idVendedor;
    private LocalDate dataVenda;
    ArrayList<Produto> produtosVenda = new ArrayList<>();

    //Construtor
    public Venda(int id, int idVendedor, LocalDate dataVenda){
        this.id = id;
        this.idVendedor = idVendedor;
        this.dataVenda = dataVenda;
    }

    //Gets e Sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVeda) {
        this.dataVenda = dataVeda;
    }


    ////--------------MÉTODOS-------------
    //Adicionar Produto na Venda
    public void adicionarProduto(int id){
        boolean produtoEncontrado = false;

        for(Produto produto : Estoque.getProdutos()){
            if(produto.getId() == id){
                produtoEncontrado = true;

                produtosVenda.add(produto);
                System.out.println("Produto adicionado na venda!");
            }
        }
        if(!produtoEncontrado){
            System.out.println("Produto não encontrado no estoque!");
        }
    }

    //Remover Produto da Venda
    public void removerProduto(int posicao){
        posicao -= 1;
        if(posicao >= 0 && posicao < produtosVenda.size()){
            produtosVenda.remove(posicao);
            System.out.println("Produto removido com sucesso!");
        }else{
            System.out.println("Produto não encontrado na venda!");
        }
    }

    //listar Produtos da Venda
    public void listarProdutos(){
        System.out.println();
        if(!produtosVenda.isEmpty()){
            for(Produto produto : produtosVenda){
                System.out.println("Nome: " + produto.getNome() + " | Preço: R$ " + produto.getPreco());
            }
        }else{
            System.out.println("A venda ainda não possui produtos");
        }
        System.out.println();
    }

    //Calcular Valor Total da Venda
    public double calcularValorTotal(){
        double soma = 0.0;
        for(Produto produto : produtosVenda){
            soma += produto.getPreco();
        }

        return soma;
    }
}
