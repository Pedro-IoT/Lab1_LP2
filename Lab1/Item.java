package Lab1;

public class Item {
    private double preco;
    private String nome;
    private int quantidade;

    public Item(String nome,int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double getPreco () {
        return this.preco;
    }

    public int getQuantidade () {
        return this.quantidade;
    }

    public String getNome () {
        return this.nome;
    }

   
}
