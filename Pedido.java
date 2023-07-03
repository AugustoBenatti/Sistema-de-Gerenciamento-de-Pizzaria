package pizza;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Pizza> pizzas;
    private double total;
    
    public Pedido() {
        pizzas = new ArrayList<Pizza>();
        total = 0;
    }
    
    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        total += pizza.getPreco();
    }
    
    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }
    
    public double getTotal() {
        return total;
    }
}