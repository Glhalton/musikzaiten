import br.uepa.musikzaiten.models.Luthier;
import br.uepa.musikzaiten.models.OrdemServico;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Luthier luthier = new Luthier();

        Scanner ler = new Scanner(System.in);
        System.out.println("""
                Selecione uma opção:
                [1] Tela de Vendas
                [2] Tela de Estoque
                [3] Tela de Ordem de Serviços""");
        String escolha = ler.nextLine();
        switch(escolha){
            case "1":
                break;
            case "2":
                break;
            case "3":
                int opcao31 = 0;
                while(opcao31 != 3){
                    System.out.println("""
                        Selecione uma opção:
                        [1] Gerar Ordem de Serviço
                        [2] Consultar Ordens de Serviço
                        [3] Voltar ao menu principal""");
                    escolha = ler.nextLine();
                    switch(escolha) {
                        case "1":
                            System.out.print("Digite o nome do cliente: ");
                            String nomeCliente = ler.nextLine();
                            System.out.print("Digite o nome do Tecnico: ");
                            String nomeTecnico = ler.nextLine();
                            System.out.print("Digite o nome do Instrumento: ");
                            String nomeInstrumento = ler.nextLine();
                            System.out.print("Digite o nome do Modelo do Instrumento: ");
                            String modeloInstrumento = ler.nextLine();
                            System.out.print("Digite o diagnostico: ");
                            String diagnostico = ler.nextLine();
                            System.out.print("Digite o valor do serviço: ");
                            double valor = ler.nextDouble();
                            System.out.print("Digite o status(PENDENTE, ATIVO, INATIVO): ");
                            String status = ler.nextLine();

                            luthier.gerarOrdemServico(new OrdemServico(1,nomeCliente, nomeTecnico, LocalDate.now(), nomeInstrumento, modeloInstrumento, diagnostico, valor, status ));

                            break;
                        case "2":
                            luthier.ConsultarOrderServico();
                            break;
                        case "3":
                            opcao31 = 3;
                            break;
                        default:
                            System.out.println("Escolha uma opção válida");
                            break;
                }

                 }
            default:
                System.out.println("Escolha uma opção válida");
                break;

        }


        }
    }
