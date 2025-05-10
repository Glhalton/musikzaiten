import br.uepa.musikzaiten.enums.OrdemServicoStatus;
import br.uepa.musikzaiten.models.Estoquista;
import br.uepa.musikzaiten.models.Luthier;
import br.uepa.musikzaiten.models.OrdemServico;
import br.uepa.musikzaiten.models.Produto;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Luthier luthier = new Luthier();
        Estoquista estoquista = new Estoquista();

        int idOS = 1;
        int idProd = 1;
        int escolha = 0;

        while(escolha != 4){

            Scanner ler = new Scanner(System.in);
            System.out.println("""
                    Selecione uma opção:
                    [1] Tela de Estoque
                    [2] Tela de Vendas
                    [3] Tela de Ordem de Serviços
                    [4] Sair do Programa""");
            escolha = ler.nextInt();

            switch(escolha){
                case 1:
                    int opcao1_1 = 0;
                    while(opcao1_1 != 5){
                        System.out.println("""
                        Selecione uma opção:
                        [1] Cadastrar Produto
                        [2] Remover Produto
                        [3] Editar Produto
                        [4] Consultar Produto
                        [5] Voltar ao menu principal""");
                        opcao1_1 = ler.nextInt();
                        ler.nextLine();
                        switch(opcao1_1) {
                            case 1:

                                System.out.print("Digite o nome do produto: ");
                                String nomeProduto = ler.nextLine();
                                System.out.print("Digite o preco do produto: ");
                                double precoProduto = ler.nextDouble();
                                System.out.print("Digite a quantidade no estoque ");
                                int quantidadeEstoque= ler.nextInt();

                                estoquista.cadastrarProduto(new Produto(idProd,nomeProduto, precoProduto, quantidadeEstoque));

                                idProd++;

                                break;

                            case 2:

                                System.out.print("Digite o id do produto a ser removido: ");
                                int idProduto = ler.nextInt();

                                estoquista.removerProduto(idProduto);

                                break;

                            case 3:

                                System.out.print("Digite o id do produto a ser editado: ");
                                int idProdutoEditado = ler.nextInt();
                                ler.nextLine();
                                System.out.print("Digite o nome do produto: ");
                                String nomeProdutoEditado = ler.nextLine();
                                System.out.print("Digite o preco do produto: ");
                                double precoProdutoEditado = ler.nextDouble();
                                System.out.print("Digite a quantidade no estoque ");
                                int quantidadeEstoqueEditado= ler.nextInt();

                                estoquista.editarProduto(idProdutoEditado, nomeProdutoEditado, precoProdutoEditado, quantidadeEstoqueEditado);
                                break;

                            case 4:

                                System.out.println();
                                estoquista.consultarProduto();
                                System.out.println();
                                break;

                            case 5:
                                break;
                            default:
                                break;

                        }
                    }
                    break;
                case 2:
                    int opcao2_1 = 0;
                    while(opcao2_1 != 5){
                        System.out.println("""
                        Selecione uma opção:
                        [1] Adicionar Produto
                        [2] Remover Produto
                        [3] Realizar Venda
                        [4] Consultar Produto
                        [5] Voltar ao menu principal""");
                        opcao2_1 = ler.nextInt();
                        ler.nextLine();
                        switch(opcao2_1) {

                        }
                    }
                    break;
                case 3:
                    int opcao3_1 = 0;
                    while(opcao3_1 != 3){
                        System.out.println("""
                        Selecione uma opção:
                        [1] Gerar Ordem de Serviço
                        [2] Consultar Ordens de Serviço
                        [3] Voltar ao menu principal""");
                        opcao3_1 = ler.nextInt();
                        switch(opcao3_1) {
                            case 1:
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
                                ler.nextLine();
                                System.out.print("Digite o status(PENDENTE, ATIVO, INATIVO): ");
                                String statusInput = ler.nextLine().toUpperCase();

                                OrdemServicoStatus status = OrdemServicoStatus.valueOf(statusInput);

                                luthier.gerarOrdemServico(new OrdemServico(idOS,nomeCliente, nomeTecnico, LocalDate.now(), nomeInstrumento, modeloInstrumento, diagnostico, valor, status));

                                idOS++;

                                break;
                            case 2:
                                System.out.println();
                                luthier.ConsultarOrderServico();
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Escolha uma opção válida");
                                break;
                        }

                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Escolha uma opção válida");

                    break;

            }
        }



        }
    }
