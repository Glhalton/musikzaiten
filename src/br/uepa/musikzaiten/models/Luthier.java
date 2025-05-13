package br.uepa.musikzaiten.models;

import br.uepa.musikzaiten.enums.OrdemServicoStatus;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Luthier extends Usuario {

    //----------Lista-de-Ordens-De-Serviço---------
    ArrayList<OrdemServico> ordemServicosList = new ArrayList<>();

    //----------Construtor---------
    public Luthier(int id, String nome, String cpf, String email){
        super(id, nome, cpf, email);
    }

    //--------------Métodos-------------
    //----------Gerar-Ordem-Serviço---------
    public void gerarOrdemServico(OrdemServico ordemServico) {
        ordemServicosList.add(ordemServico);
    }

    //----------Editar-Ordens-de-Serviço---------
    public void editarOrdemServico(int id) {
        Scanner ler = new Scanner(System.in);
        int count = 0;

        for(OrdemServico os : ordemServicosList){
            if(os.getId() == id){

                System.out.print("Digite o nome do cliente: ");
                String nomeCliente = ler.nextLine();
                System.out.print("Digite o contato do cliente: ");
                String contatoCliente = ler.nextLine();
                System.out.print("Digite o nome do Instrumento: ");
                String nomeInstrumento = ler.nextLine();
                System.out.print("Digite o nome do Modelo do Instrumento: ");
                String modeloInstrumento = ler.nextLine();
                System.out.print("Digite o diagnostico: ");
                String diagnostico = ler.nextLine();
                System.out.print("Digite o valor do serviço: ");
                double valor = ler.nextDouble();
                ler.nextLine();
                System.out.print("Digite o status(PENDENTE, ATIVO, INATIVO): ");
                String statusInput = ler.nextLine().toUpperCase();

                OrdemServicoStatus status = OrdemServicoStatus.valueOf(statusInput);

                os.setNomeCliente(nomeCliente);
                os.setContatoCliente(contatoCliente);
                os.setNomeInstrumento(nomeInstrumento);
                os.setModeloInstrumento(modeloInstrumento);
                os.setDiagnosticoInstrumento(diagnostico);
                os.setPreco(valor);
                os.setStatus(status);

                System.out.printf("A ordem de serviço %d foi editado com sucesso\n", id);

                count = 1;
            }
        }
        if(count == 0){
            System.out.println("Ordem de serviço não encontrada");
        }
    }

    //----------eonsultar-Ordens-de-Serviço---------
    public void ConsultarOrderServico(){
        if(!ordemServicosList.isEmpty()){
            for(OrdemServico ordemServico : ordemServicosList){
                System.out.printf("""
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
                    """, ordemServico.getId(),
                        ordemServico.getNomeCliente(),
                        ordemServico.getContatoCliente(),
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
