package br.uepa.musikzaiten.models;

import br.uepa.musikzaiten.enums.OrdemServicoStatus;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Luthier extends Usuario {

    //Associação Lista
    ArrayList<OrdemServico> ordemServicosList = new ArrayList<>();

    //Construtor
    public Luthier(int id, String nome, String cpf, String email){
        super(id, nome, cpf, email);
    }

    //--------------MÉTODOS-------------
    //Consultar Ordem de Serviço
    public void ConsultarOrderServico(){
        if(!ordemServicosList.isEmpty()){
            for(OrdemServico ordemServico : ordemServicosList){
                System.out.println(ordemServico);
                System.out.println();
            }
        }else{
            System.out.println("\nNão foram encontradas ordens de serviço\n");
        }
    }

    //Criar Ordem de Serviço
    public void criarOrdemServico(OrdemServico ordemServico) {
        ordemServicosList.add(ordemServico);
        System.out.println("Ordem de serviço cadastrada com sucesso\n");
    }

    //Remover Ordem de Serviço
    public void removerOrdemServico(int id){
        boolean OrdemServicoEncontrada = false;
        int indexOrdemServico = 0;

        for(OrdemServico os : ordemServicosList){
            if(os.getId() == id){
                indexOrdemServico = ordemServicosList.indexOf(os);
                OrdemServicoEncontrada = true;
            }
        }
        if(OrdemServicoEncontrada){
            ordemServicosList.remove(indexOrdemServico);
            System.out.println("Ordem de Serviço removida com sucesso!\n");

        } else{
            System.out.println("Ordem de Serviço não encontrada!\n");
        }
    }



    //Editar Ordem de Serviço
    public void editarOrdemServico(int id) {
        Scanner ler = new Scanner(System.in);
        boolean ordemEncontrada = false;

        for(OrdemServico os : ordemServicosList){
            if(os.getId() == id){
                ordemEncontrada = true;

                System.out.print("Digite o nome do cliente: ");
                os.setNomeCliente(ler.nextLine());
                System.out.print("Digite o contato do cliente: ");
                os.setContatoCliente(ler.nextLine());
                System.out.print("Digite o nome do Instrumento: ");
                os.setNomeInstrumento(ler.nextLine());
                System.out.print("Digite o nome do Modelo do Instrumento: ");
                os.setModeloInstrumento(ler.nextLine());
                System.out.print("Digite o diagnostico: ");
                os.setDiagnosticoInstrumento(ler.nextLine());
                System.out.print("Digite o valor do serviço: ");
                os.setPreco(ler.nextDouble());
                ler.nextLine();
                System.out.print("Digite o status(PENDENTE, ATIVO, INATIVO): ");
                String statusInput = ler.nextLine().toUpperCase();

                OrdemServicoStatus status = OrdemServicoStatus.valueOf(statusInput);
                os.setStatus(status);

                System.out.printf("A ordem de serviço %d foi editado com sucesso!\n", id);

            }
        }
        if(!ordemEncontrada){
            System.out.println("Ordem de serviço não encontrada!");
        }
    }



}
