package pizza;

public class Pizza {

    private String nome;
    private String[] ingredientes;
    private double preco;

    public Pizza(String nome, String[] ingredientes, double preco) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public double getPreco() {
        return preco;
    }

}