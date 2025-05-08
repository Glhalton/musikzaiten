package br.uepa.musikzaiten.models;

import java.util.ArrayList;

public class Luthier extends Usuario {

    ArrayList<OrdemServico> ordemServicosList = new ArrayList<>();

    public void gerarOrdemServico(OrdemServico ordemServico) {
        ordemServicosList.add(ordemServico);
    }

    public void ConsultarOrderServico(){
        for(OrdemServico ordemServico : ordemServicosList){
            System.out.printf("""
                    Ordem de servico: %d
                    Nome do Cliente: %s
                    Nome do Tecnico: %s
                    Data de geração: %s
                    Nome do Instrumento: %s
                    Modelo do Instrumento: %s
                    Diagnostico: %s
                    Preço final: %d
                    Status:
                    """, ordemServico.getId(),
                    ordemServico.getNomeCliente(),
                    ordemServico.getNomeTecnico(),
                    ordemServico.getDataGeracao(),
                    ordemServico.getNomeInstrumento(),
                    ordemServico.getModeloInstrumento(),
                    ordemServico.getDiagnosticoInstrumento(),
                    ordemServico.getPreco());
        }
    }

}
