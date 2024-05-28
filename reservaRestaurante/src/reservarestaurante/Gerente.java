/*Descrição: Funcionalidade que permite o cadastro do gerente do restaurante.
O gerente terá acesso ao estoque, ao cadastro de mesas e aos relatórios.*/
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
public class Gerente {

    static Scanner input = new Scanner(System.in);//declarando um Scanner Statico

    private String nome;
    private int id;
    private int senha;
    private String funcao;//Gerante

    
    private ArrayList<Mesa> mesas = new ArrayList<Mesa>(); // Lista de mesas
    private ArrayList<Produto> produtos = new ArrayList<Produto>(); // Lista de produtos
    
    public void cadastrarMesa() {
        System.out.println("Informe o número da mesa:");
        int numero = input.nextInt();
        input.nextLine(); // Limpar o buffer
        System.out.println("Informe a capacidade da mesa:");
        int capacidade = input.nextInt();
        input.nextLine(); // Limpar o buffer

        // Criar uma nova mesa e adicioná-la à lista de mesas
        Mesa mesa = new Mesa();
        mesa.setNumero(numero);
        mesa.setCapacidade(capacidade);
        mesas.add(mesa);
        System.out.println("Mesa cadastrada com sucesso!");
    }

    public void cadastrarProduto() {
        Produto produt = new Produto();
        produt.adicionarProdutos();
    }

    /* public void gerarRelatorio() {

    }
     */
    public void fazerReserva() {
        Cliente cli = new Cliente();//Instanciando a classe cliente.
        Mesa ms = new Mesa();//Instanciando a classe mesa.
        Reserva re = new Reserva(); //Instanciando a classe Reserva c/ ArrayList

        System.out.println("Infome o nome do Cliente");
        cli.nome = input.next();

        System.out.println("Infome o CPF");
        cli.CPF = input.nextDouble();

        System.out.println("Informe o numero de Telefone");
        cli.Telefone = input.nextDouble();

        System.out.println("infome o Email para contato");
        cli.Email = input.next();

        System.out.println("Informe a Quantidade de Lugares");
        cli.Lugares = input.nextInt();
        re.novaReserva(cli);

    }

}
