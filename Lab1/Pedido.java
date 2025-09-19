package Lab1;
import java.util.LinkedList;

public class Pedido {

    private int id;
    private String nomeCliente;

    private LinkedList<Item> itens = new LinkedList<>();    // Lista interna de itens

    public Pedido(int id, String nomeCliente) {
        this.id = id;
        this.nomeCliente = nomeCliente;
    }

    public void addItem(Item produto) {    // Adiciona na lista interna de itens
        itens.add(produto);
        System.out.println("Produto adicionado com sucesso");
    }

    public void removeUltimo() {    // Remove da lista interna de itens
        itens.removeLast();
        System.out.println("Último produto removido com sucesso");
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nomeCliente;
    }

    public void immprimeInformacoes(){
        System.out.println("========================================");
        System.out.println("Pedido N°: " + this.id);
        System.out.println("Cliente: " + this.nomeCliente);
        System.out.println("----------------------------------------");
        System.out.println("Itens:");
        double valorTotal = 0;
        for (Item item : itens) {
            System.out.println("- " + item.getNome() + " R$ " + item.getPreco() + " * " + item.getQuantidade());
            valorTotal += item.getPreco() * item.getQuantidade(); 
    }
        System.out.println("----------------------------------------");
        System.out.println("Total: R$ " + valorTotal);
        System.out.println("========================================");
        
    }
    
    public void confirmaPedido(){
        System.out.println("\n========================================");
        System.out.println(" Restaurante Pedro Espetos ");
        
        immprimeInformacoes();    // Reutilização da outra função visando boas práticas de programação

        System.out.println(" Obrigado pela preferência! :) ");
        System.out.println("========================================\n");
    }
}
