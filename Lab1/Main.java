/* Afazeres:
fazer um read.md bonitinho
*/

package PedroEspetos;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        LinkedList<Pedido> pedidos = new LinkedList<>();
        int numPedidos = 0;

        do {
            System.out.println("=========== MENU DO SISTEMA ===========");
            System.out.println("1 - Registrar pedidos (registra um novo pedido)");
            System.out.println("2 - Remover pedido (escolha um pedido para ser removido)");
            System.out.println("3 - Listar pedidos (lista todos os pedidos)");
            System.out.println("4 - Sair (encerrra o programa)");
            System.out.println("=========== Digite sua escolha ===========");

            int entrada = leitor.nextInt();
            leitor.nextLine();

            switch (entrada) {
                case 1:
                    System.out.println("Digite o nome do cliente para iniciar o pedido:");
                    String nomeCliente = leitor.nextLine();

                    numPedidos++;   // A cada novo pedido aumenta a variável para manter a contagem de pedidos

                    Pedido pedido = new Pedido(numPedidos, nomeCliente);

                    while(true) {
                        System.out.print("\n\n");
                        System.out.println("=========== MENU DE PEDIDOS ===========");
                        System.out.println("1 - Adicionar um novo produto ao pedido");
                        System.out.println("2 - Remover o último produto adicionado");
                        System.out.println("3 - Imprimir parcial");
                        System.out.println("4 - Sair (encerra o registro de produtos e imprime a parcial)");
                        System.out.println("=========== Digite sua escolha ===========");
        
                        int comando = leitor.nextInt();
                        leitor.nextLine();

                        if(comando == 1){
                            System.out.print("Nome do produto: ");
                            String nomeItem = leitor.nextLine();

                            System.out.print("Quantidade do produto: ");    // Quantidade para que não tenha que adicionar um por um
                            int quantidade = leitor.nextInt();
                            leitor.nextLine();

                            System.out.print("Preço: ");
                            double preco = leitor.nextDouble();
                            leitor.nextLine();

                            Item item = new Item(nomeItem, quantidade, preco);
                        
                            pedido.addItem(item);   // Adiciona a lista de itens interna de cada pedido
                        }

                        else if(comando == 2) {
                            pedido.removeUltimo();  // Remove o último item adicionado
                        }

                        else if(comando == 3) pedido.confirmaPedido();  // Imprime a parcial

                        else if(comando == 4) break;

                        else System.out.println("Escolha inválida, escolha novamente");

                    }
                    
                    pedidos.add(pedido);    // Adiciona a lista principal
                    pedido.confirmaPedido();    // Imprime a parcial

                    break;
                case 2:
                    System.out.print("Digite qual pedido deseja ser removido: ");

                    int id = leitor.nextInt();
                    leitor.nextLine();

                    id--;   // Como index começa em 0, e o id do pedido começa em 1, logo faço essa correção para remover baseado no index
                    pedidos.remove(id);

                    id++;   // Desfaço a correção de variável para imprimir
                    System.out.println("Pedido " + id + " removido com sucesso!");

                    break;

                case 3:
                    for(Pedido pedidoAux:pedidos){
                        pedidoAux.immprimeInformacoes();
                    }

                    break;
                
                case 4:
                    System.out.println("Encerrando programa...");

                    break;

                default:
                    System.out.println("Opção inválida, por favor, escolha uma opção válida");

                    break;
            }
        } while(entrada != 4);
    }
}
