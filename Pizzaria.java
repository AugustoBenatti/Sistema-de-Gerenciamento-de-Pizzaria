package pizza;
import java.util.ArrayList;

public class Pizzaria {
    private ArrayList<Pizza> cardapio;
    private ArrayList<Funcionario> funcionarios;
    
    public Pizzaria() {
        cardapio = new ArrayList<Pizza>();
        funcionarios = new ArrayList<Funcionario>();
    }
    
    public void adicionarPizza(Pizza pizza) {
        cardapio.add(pizza);
    }
    
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public ArrayList<Pizza> getCardapio() {
        return cardapio;
    }
    
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}