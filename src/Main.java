import br.uepa.musikzaiten.enums.OrdemServicoStatus;
import br.uepa.musikzaiten.models.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Luthier luthier = new Luthier(4, "Aubrey Strawberry", "444.444.444-44", "(94) 98438-9699");
        Estoquista estoquista = new Estoquista(3, "Katyusha Pravda", "333.333.333-33", "(91) 99292-7905");
        Vendedor vendedor = new Vendedor(2, "Mari Suzuki", "222.222.222-22", "(94) 99667-3561");
        Gerente gerente = new Gerente( 1, "Sunny Suzuki", "111.111.111-11", "(94) 99234-2345");

        Scanner ler = new Scanner(System.in);

        int idOS = 1;
        int idProd = 1;
        int idVend = 1;
        int idProdVend = 1;
        int escolha = 0;


        while(escolha != 4){

            System.out.println("""
                    ================================
                             MENU PRINCIPAL
                    ================================
                    [1] - Tela de Estoque
                    [2] - Tela de Vendas
                    [3] - Tela de Ordem de Serviços
                    [4] - Sair do Programa
                    ================================""");

            escolha = ler.nextInt();

            switch(escolha){
                case 1:
                    int opcao1_1 = 0;

                    while(opcao1_1 != 5){
                        System.out.println("""
                            ================================
                                    MENU DE ESTOQUE
                            ================================
                            [1] - Cadastrar Produto
                            [2] - Remover Produto
                            [3] - Editar Produto
                            [4] - Consultar Produtos
                            [5] - Voltar ao menu principal
                            ================================""");

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

                                estoquista.cadastrarProduto(new Produto(
                                        idProd,
                                        nomeProduto,
                                        precoProduto,
                                        quantidadeEstoque));

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

                                estoquista.editarProduto(idProdutoEditado);

                                break;

                            case 4:

                                System.out.println();
                                estoquista.consultarProduto();
                                System.out.println();
                                break;

                            case 5:
                                break;
                            default:
                                System.out.println("Escolha uma opção válida");


                        }
                    }
                    break;
                case 2:
                    int opcao2_1 = 0;
                    while(opcao2_1 != 4){
                        System.out.println("""
                            ================================
                                    MENU DE VENDAS
                            ================================
                            Selecione uma opção:
                            [1] - Realizar Venda
                            [2] - Realizar Devolução
                            [3] - Listar produtos
                            [4] - Voltar ao menu principal
                            ================================""");
                        opcao2_1 = ler.nextInt();
                        ler.nextLine();
                        switch(opcao2_1) {
                            case 1:
                                Venda venda= new Venda(idVend, vendedor.getId(), LocalDate.now());
                                vendedor.getVendas().add(venda);

                                int opcao2_1_1 = 0;
                                while(opcao2_1_1 != 5){
                                    System.out.println("""
                                        ================================
                                                TELA DE VENDA
                                        ================================
                                        Selecione uma opção:
                                        [1] - Adicionar Produto
                                        [2] - Remover Produto
                                        [3] - Listar produtos
                                        [4] - Finalizar Venda
                                        [5] - Cancelar Venda
                                        ================================""");
                                    opcao2_1_1 = ler.nextInt();
                                    switch (opcao2_1_1){
                                        case 1:

                                            System.out.println("Digite o id do produto: ");
                                            int idProduto = ler.nextInt();
                                            venda.adicionarProduto(idProduto);

                                            break;

                                        case 2:
                                            System.out.println("Digite a posição do produto a ser removido: ");
                                            int posicaoProduto = ler.nextInt();
                                            venda.removerProduto(posicaoProduto);

                                            break;

                                        case 3:
                                            venda.listarProdutos();
                                            break;

                                        case 4:
                                            vendedor.realizarVenda(venda);
                                            opcao2_1_1 = 5;
                                            break;
                                        case 5:
                                            break;
                                    }
                                    }
                                break;
                            case 2:
                                break;
                            case 3:
                                vendedor.consultarProduto();
                                break;
                            case 4:
                                break;


                        }
                    }
                    break;
                case 3:
                    int opcao3_1 = 0;
                    while(opcao3_1 != 4){
                        System.out.println("""
                            ================================
                               MENU DE ORDENS DE SERVIÇO
                            ================================
                            [1] Gerar Ordem de Serviço
                            [2] Consultar Ordens de Serviços
                            [3] Editar Ordens de Serviços
                            [4] Voltar ao menu principal
                            ================================""");
                        opcao3_1 = ler.nextInt();
                        ler.nextLine();
                        switch(opcao3_1) {
                            case 1:
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

                                luthier.gerarOrdemServico(new OrdemServico(
                                        idOS,
                                        nomeCliente,
                                        luthier.getNome(),
                                        LocalDate.now(),
                                        nomeInstrumento,
                                        modeloInstrumento,
                                        diagnostico,
                                        valor,
                                        status,
                                        contatoCliente));

                                idOS++;

                                break;
                            case 2:
                                luthier.ConsultarOrderServico();
                                break;
                            case 3:
                                System.out.print("Digite o id da ordem de serviço: ");
                                int idOrdemServico = ler.nextInt();
                                luthier.editarOrdemServico(idOrdemServico);
                                System.out.println();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Escolha uma opção válida");

                        }
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Escolha uma opção válida");


            }
        }

    }
}
