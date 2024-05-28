/*Descrição: Funcionalidade que permite o cadastro do gerente do restaurante.
O gerente terá acesso ao estoque, ao cadastro de mesas e aos relatórios.*/
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservarestaurante;

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

    public void cadastrarMesa() {

    }

    public void cadastrarProduto() {
        Produto produt = new Produto();
        produt.adicionarProdutos();
    }

    public void gerarRelatorio() {

    }

    public void fazerReserva() {
        Cliente cli = new Cliente();//Instanciando a classe cliente.
        Mesa ms = new Mesa();//Instanciando a classe mesa.
        Reserva re = new Reserva(); //Instanciando a classe Reserva c/ ArrayList

        System.out.println("Infome o nome do Cliente");
        cli.nome = input.next();

        //input.nextLine();
        //String nomecli = input.nextLine();
        // cli.setnome(nomecli);
        //reserva.add(this);
        System.out.println("Infome o CPF");
        cli.CPF = input.nextDouble();
        //double cpf = input.nextDouble();
        // cli.setCPF(cpf);

        System.out.println("Informe o numero de Telefone");
        cli.Telefone = input.nextDouble();
        //double tel = input.nextDouble();
        // cli.setTelefone(tel);

        System.out.println("infome o Email para contato");
        cli.Email = input.next();
        //input.nextLine();
        //String email = input.nextLine();
        //cli.setEmail(email);

        System.out.println("Informe a Quantidade de Lugares");
        cli.Lugares = input.nextInt();
        //input.nextLine();
        //int lugares = input.nextInt();
        //cli.setLugares(lugares);

        // System.out.println("Informe o numero da mesa");
        //ms.Numero = input.nextInt();
        // int numeroMesa = input.nextInt();
        //ms.setmesa(numeroMesa);
        re.novaReserva(cli);
        //re.novaReserva(ms);

    }

}
