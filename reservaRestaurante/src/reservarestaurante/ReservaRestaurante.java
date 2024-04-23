//este programa é sobre um controle de Reserva de um Restaurante.
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservarestaurante;

import java.util.Scanner;

/**
 *
 * @author Luanderson Amparo
 * @author Lucas Alves
 */
public class ReservaRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);//declarando um Scanner
        Cliente cli = new Cliente();//Instanciando a classe cliente.
        Mesa ms = new Mesa();//Instanciando a classe mesa.

        System.out.println("Seja Bem Vindo");
        int opcao = 0;
        do {
            System.out.println("1. Fazer Uma Reserva");
            System.out.println("2. Consultar Reserva");
            System.out.println(". Fazer pedido");
            System.out.println(". cadastrar Produtos ");
            System.out.println(". cadastrar Funcionarios");
            System.out.println(". cadastrar mesa");
            System.out.println(". cadastar cardapio");
            System.out.println(". fechar conta/comanda");
            System.out.println(". gerar relatorio");
            opcao = read.nextInt();

            switch (opcao) {
                case 1:
                    
                    System.out.println("Infome o nome do Cliente");
                    read.nextLine();
                    String nomecli = read.nextLine();
                    cli.setnome(nomecli);
                    
                    System.out.println("Infome o CPF");
                    double cpf = read.nextDouble();
                    cli.setCPF(cpf);
                    
                    System.out.println("Informe o numero de Telefone");
                    double tel = read.nextDouble();
                    cli.setTelefone(tel);
                    
                    System.out.println("infome o Email para contato");
                    read.nextLine();
                    String email = read.nextLine();
                    cli.setEmail(email); 
                    
                    System.out.println("Informe o numero da mesa");
                    int numeroMesa = read.nextInt();
                    ms.setmesa(numeroMesa);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("The end");
            }
        } while (opcao != 0);
    }

}
