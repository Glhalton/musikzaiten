package br.uepa.musikzaiten.models;

public class Usuario {

    //Atributos
    private int id;
    private String nome;
    private String cpf;
    private String telefone;

    //Construtor
    public Usuario(int id, String nome, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    //Gets e Sets
    public int getId(){
        return id;
    }

    public void setNome(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void fazerLogin(){
        System.out.println("Usuário Fez Login");
    }

}
