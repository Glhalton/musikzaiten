package br.uepa.musikzaiten.models;

public class Usuario {

    private int id;
    private String nome;
    private String cpf;
    private String email;


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

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void fazerLogin(){
        System.out.println("Usuário Fez Login");
    }


}
