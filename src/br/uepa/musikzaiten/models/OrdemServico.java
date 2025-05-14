package br.uepa.musikzaiten.models;


import br.uepa.musikzaiten.utils.OrdemServicoStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class OrdemServico {
    //Atributos
    private int id;
    private String nomeCliente;
    private String nomeTecnico;
    private LocalDate dataGeracao;
    private String nomeInstrumento;
    private String modeloInstrumento;
    private String diagnosticoInstrumento;
    private double preco;
    private String contatoCliente;
    private OrdemServicoStatus status;

    //Associação
    private Luthier luthier;

    //Construtor
    public OrdemServico(int id,
                        String nomeCliente,
                        String nomeTecnico,
                        LocalDate dataGeracao,
                        String nomeInstrumento,
                        String modeloInstrumento,
                        String diagnosticoInstrumento,
                        double preco,
                        OrdemServicoStatus status,
                        String contatoCliente){
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.nomeTecnico = nomeTecnico;
        this.dataGeracao = dataGeracao;
        this.nomeInstrumento = nomeInstrumento;
        this.modeloInstrumento = modeloInstrumento;
        this.diagnosticoInstrumento = diagnosticoInstrumento;
        this.preco = preco;
        this.status = status;
        this.contatoCliente = contatoCliente;
    }

    //Gets e Sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public LocalDate getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(LocalDate dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public String getNomeInstrumento() {
        return nomeInstrumento;
    }

    public void setNomeInstrumento(String nomeInstrumento) {
        this.nomeInstrumento = nomeInstrumento;
    }

    public String getModeloInstrumento() {
        return modeloInstrumento;
    }

    public void setModeloInstrumento(String modeloInstrumento) {
        this.modeloInstrumento = modeloInstrumento;
    }

    public String getDiagnosticoInstrumento() {
        return diagnosticoInstrumento;
    }

    public void setDiagnosticoInstrumento(String diagnosticoInstrumento) {
        this.diagnosticoInstrumento = diagnosticoInstrumento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public OrdemServicoStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemServicoStatus status){
        this.status = status;
    }

    public Luthier getLuthier() {
        return luthier;
    }

    public void setLuthier(Luthier luthier) {
        this.luthier = luthier;
    }

    public String getContatoCliente() {
        return contatoCliente;
    }

    public void setContatoCliente(String contatoCliente) {
        this.contatoCliente = contatoCliente;
    }

    //Sobrescrita
    @Override
   public String toString() {
        return String.format("""
                    Número da OS: %d
                    Nome do Cliente: %s
                    Contato do Cliente: %s
                    Nome do Tecnico: %s
                    Data de geração: %s
                    Nome do Instrumento: %s
                    Modelo do Instrumento: %s
                    Diagnostico: %s
                    Preço final: R$ %.2f
                    Status: %s
                    """,
                        id,
                        nomeCliente,
                        contatoCliente,
                        nomeTecnico,
                        dataGeracao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                        nomeInstrumento,
                        modeloInstrumento,
                        diagnosticoInstrumento,
                        preco,
                        status);
    }
}
