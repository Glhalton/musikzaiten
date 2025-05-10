package br.uepa.musikzaiten.models;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Luthier extends Usuario {

    ArrayList<OrdemServico> ordemServicosList = new ArrayList<>();

    public Luthier(int id, String nome, String cpf, String email){
        super(id, nome, cpf, email);
    }

    public void gerarOrdemServico(OrdemServico ordemServico) {
        ordemServicosList.add(ordemServico);
    }

    public void ConsultarOrderServico(){
        if(!ordemServicosList.isEmpty()){
            for(OrdemServico ordemServico : ordemServicosList){
                System.out.printf("""
                    Número da OS: %d
                    Nome do Cliente: %s
                    Nome do Tecnico: %s
                    Data de geração: %s
                    Nome do Instrumento: %s
                    Modelo do Instrumento: %s
                    Diagnostico: %s
                    Preço final: R$ %.2f
                    Status: %s
                    """, ordemServico.getId(),
                        ordemServico.getNomeCliente(),
                        ordemServico.getNomeTecnico(),
                        ordemServico.getDataGeracao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                        ordemServico.getNomeInstrumento(),
                        ordemServico.getModeloInstrumento(),
                        ordemServico.getDiagnosticoInstrumento(),
                        ordemServico.getPreco(),
                        ordemServico.getStatus());

                System.out.println();
            }
        }else{
            System.out.println();
            System.out.println("Não foram encontradas ordens de serviço");
            System.out.println();
        }
    }

}
