package PedroEspetos;
import java.util.LinkedList;

public class Pedido {

    private int id;
    private String nomeCliente;

    private LinkedList<Item> itens = new LinkedList<>();

    public Pedido(int id, String nomeCliente) {
        this.id = id;
        this.nomeCliente = nomeCliente;
    }

    public void addItem(Item produto) {
        itens.add(produto);
        System.out.println("Produto adicionado com sucesso");
    }

    public void removeUltimo() {
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
// Aqui você faria um loop para percorrer os itens do pedido
        double valorTotal = 0;
        for (Item item : itens) {
            System.out.println("- " + item.getNome() + " R$ " + item.getPreco() + " * " + item.getQuantidade());
            valorTotal += item.getPreco() * item.getQuantidade(); 
    }
        System.out.println("----------------------------------------");
// O valor total deve ser calculado
        System.out.println("Total: R$ " + valorTotal);
        System.out.println("========================================");
        
    }
    
    public void confirmaPedido(){
        System.out.println("\n========================================");
        System.out.println(" Restaurante Pedro Espetos ");
        
        immprimeInformacoes();

        System.out.println(" Obrigado pela preferência! :) ");
        System.out.println("========================================\n");
    }
}