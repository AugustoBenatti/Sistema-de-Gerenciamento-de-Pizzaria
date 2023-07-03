package pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Pizzaria pizzaria = new Pizzaria();
        pizzaria.adicionarPizza(new Pizza("Calabresa", new String[]{"Molho de tomate", "Queijo", "Calabresa", "Cebola"}, 29.90));
        pizzaria.adicionarPizza(new Pizza("Mussarela", new String[]{"Molho de tomate", "Queijo"}, 24.90));
        pizzaria.adicionarPizza(new Pizza("Frango com catupiry", new String[]{"Molho de tomate", "Queijo", "Frango", "Catupiry "}, 34.90));

        pizzaria.adicionarFuncionario(new Funcionario("Joao", "Atendente"));
        pizzaria.adicionarFuncionario(new Funcionario("Maria", "Cozinheiro"));
        pizzaria.adicionarFuncionario(new Funcionario("Pedro", "Gerente"));
        int opcao;
        do {
            System.out.println(" \n Bem-vindo a Pizzaria! Escolha uma das opcoes abaixo:");
            System.out.println("1 - Ver cardapio");
            System.out.println("2 - Fazer pedido");
            System.out.println("3 - Ver funcionarios");
            System.out.println("0 - Sair! \n ");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    ArrayList<Pizza> cardapio = pizzaria.getCardapio();
                    for (int i = 0; i < cardapio.size(); i++) {
                        Pizza pizza = cardapio.get(i);
                        System.out.println(pizza.getNome() + " - " + pizza.getPreco());
                    }
                    break;

                case 2:
                    Pedido pedido = new Pedido();
                    boolean continuar = true;
                    while (continuar) {
                        System.out.println("Escolha uma pizza do cardapio (digite o numero correspondente):");
                        ArrayList<Pizza> cardapio2 = pizzaria.getCardapio();
                        for (int i = 0; i < cardapio2.size(); i++) {
                            Pizza pizza = cardapio2.get(i);
                            System.out.println((i + 1) + " - " + pizza.getNome() + " - " + pizza.getPreco());
                        }
                        int pizzaEscolhida = scanner.nextInt();
                        Pizza pizza = cardapio2.get(pizzaEscolhida - 1);
                        pedido.adicionarPizza(pizza);

                        System.out.println(" \n Deseja adicionar mais pizzas? (S/N)");
                        String resposta = scanner.next();
                        if (resposta.equalsIgnoreCase("N")) {
                            continuar = false;
                        }
                    }

                    System.out.println("Pedido realizado!");
                    ArrayList<Pizza> pizzas = pedido.getPizzas();
                    for (int i = 0; i < pizzas.size(); i++) {
                        Pizza pizza = pizzas.get(i);
                        System.out.println(pizza.getNome() + " - " + pizza.getPreco());
                    }
                    System.out.println("Total: " + pedido.getTotal());
                    break;
                case 3:
                    ArrayList<Funcionario> funcionarios = pizzaria.getFuncionarios();
                    for (int i = 0; i < funcionarios.size(); i++) {
                        Funcionario funcionario = funcionarios.get(i);
                        System.out.println(funcionario.getNome() + " - " + funcionario.getCargo());
                    }
                    break;

                default:
                    System.out.println("Pedido Finalizado ");
                    System.out.println("Obrigado pela preferencia! volte sempre");
                    break;
            }
        } while (opcao != 0);
    }
}