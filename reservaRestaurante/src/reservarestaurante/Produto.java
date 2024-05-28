/*Descrição: Funcionalidade que permite cadastrar os pratos oferecidos pelo restaurante.*/
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservarestaurante;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luanderson Amparo
 * @author Lucas Alves
 */
public class Produto {

    static Scanner input = new Scanner(System.in);//declarando um Scanner 
    private ArrayList<String> menu = new ArrayList<String>();//declrado um ArrayList de String;
    private ArrayList<Double> precos = new ArrayList<Double>();//Declarando um ArrayList de Souble;

    private String nome;
    private double Preco;

    public void estoque() {
        menu.add("Feijoada");
        precos.add(25.99);

        menu.add("Strogonoff");
        precos.add(19.99);

        menu.add("Picanha");
        precos.add(35.99);

        menu.add("Salmão Assad");
        precos.add(29.99);

        menu.add("Frango à Milanesa");
        precos.add(15.99);

        menu.add("Macarrão à Bolonhesa");
        precos.add(18.99);

        menu.add("Pizza de Calabresa");
        precos.add(22.99);

        menu.add("Sushi Misto");
        precos.add(30.99);

        menu.add("Sorvete de Chocolate");
        precos.add(7.99);

        menu.add("Refrigerante");
        precos.add(4.99);

        menu.add("Suco Natural");
        precos.add(6.99);

        menu.add("Cerveja");
        precos.add(8.99);
    }

    public void verificarEstoque() {
        // Imprimindo
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i) + " - R$" + precos.get(i));
        }
    }

    public void adicionarProdutos() {
        System.out.println("Informe o nome do produto ");
        nome = input.next();
        menu.add(nome);
        System.out.println("Informe o valor do produto ");
        Preco = input.nextDouble();
        precos.add(Preco);
        
        
        
    }

    public void atualizarEstoque(String nome , double preco) {
     
        
    }

    public void removerProduto() {
        System.out.println("Informe o Produto e o preco a ser Removido");
        nome = input.next();
        menu.remove(nome);
        Preco = input.nextDouble();
        precos.remove(Preco);

    }

}
