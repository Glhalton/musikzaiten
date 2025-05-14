package br.uepa.musikzaiten.models;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Vendedor extends Usuario {

    //Associação
    private ArrayList<Venda> vendas = new ArrayList<>();

    //Construtor
    public Vendedor(int id, String nome, String cpf, String email){
        super(id, nome, cpf, email);
    }

    //Gets e Sets
    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }

    //--------------MÉTODOS-------------
    //Consultar Produtos
    public void consultarProduto(){
        Estoque.consultarProduto();
    }

    //Realizar Venda
    public void realizarVenda(Venda venda){
        double valorTotal = venda.calcularValorTotal();

        System.out.printf("""
                            Venda finalizada, cupom:
                            Id venda: %d
                            Id vendedor: %d
                            Data venda: %s
                            Valor Final: R$ %.2f""",
                venda.getId(),
                venda.getIdVendedor(),
                venda.getDataVenda().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                valorTotal);

        System.out.println();
    }

    //RealizarDevolução
    public void realizarDevolucao(Produto produto){

    }
}
