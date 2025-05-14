package br.uepa.musikzaiten.models;

import java.time.LocalDate;

public class Relatorio {

    //Atributos
    private int id;
    private LocalDate dataGeracao;
    private String tipo;
    private String conteudo;
    private Gerente gerente;

    //Construtor
    public Relatorio(int id, LocalDate dataGeracao, String tipo, String conteudo) {
        this.id = id;
        this.dataGeracao = dataGeracao;
        this.tipo = tipo;
        this.conteudo = conteudo;
    }

    //Gets e Sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(LocalDate dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
