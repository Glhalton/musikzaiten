package br.uepa.musikzaiten.models;

import java.util.ArrayList;

public class Gerente extends Usuario {

    //Associação
    private ArrayList<Relatorio> relatorios = new ArrayList<>();

    //Construtor
    public Gerente(int id, String nome, String cpf, String email){
        super(id, nome, cpf, email);
    }

    //--------------MÉTODOS-------------
    public void consultarProduto(Produto produto){

    }

    public void adicionarProduto(Produto produto){

    }

    public void removerProduto(Produto produto){

    }

    public void cadastrarProduto(Produto produto){

    }

    public void gerarRelatorios(){

    }

    public void consultarRelatorios(){

    }

    public void cadastrarUsuarios(){

    }

    public void removerUsuarios(){

    }

    public void editarUsuarios(){

    }





}
