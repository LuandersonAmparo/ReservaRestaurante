/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservarestaurante;

import java.util.Scanner;

/**
 *
 * @author Luanderson Amparo
 */
public class Login {

    Gerente ge = new Gerente();//Instanciando a classe Gentente
    Reserva reserva = new Reserva();
    Produto produto = new Produto();
    public void login() {
        String tipoLog;
        Scanner input = new Scanner(System.in);

        do {// Laço de Repetição Do while para execução de solicitação de Usuario e Senha
            tipoLog = login(input);

            switch (tipoLog) {
                case "gerente":
                    menuGerente(input);
                    break;
                case "garcom":
                    menuGarcom(input);
                    break;
                default:
                    System.out.println("Tipo de usuario invalido!");
            }
        } while (!tipoLog.equals("gerente") && !tipoLog.equals("garcom"));
    }

    public static String login(Scanner input) {//refere-se ao Metodo de Login
        String usuario, senha;
        do {
            System.out.println("Insira o login:");
            usuario = input.nextLine();
            System.out.println("Insira a senha:");
            senha = input.nextLine();

            if (usuario.equalsIgnoreCase("gerente") && senha.equals("gerente")) {
                return "gerente";
            } else if (usuario.equalsIgnoreCase("garcom") && senha.equals("garcom")) {
                return "garcom";
            } else {
                System.err.println("Login ou senha incorretos! Tente novamente.");
            }
        } while (true);

    }

    public void menuGerente(Scanner input) {// Refere-se ao Metodo do menu admin 
        int select;
        do {
            System.out.println("1. Fazer Uma Reserva");
            System.out.println("2. Consultar Reserva");
            System.out.println("3. cadastrar Produtos ");
            System.out.println("4. Listar Produtos");
            System.out.println("5. listar mesa");
            System.out.println("6. gerar relatorio");
            System.out.println("7. Fazer Long off");
            System.out.println("0. Para Sair");

            select = input.nextInt();

            switch (select) {
                case 1:
                    ge.fazerReserva();

                    break;
                case 2:
                    reserva.consultarReserva();
                    break;
                case 3:
                    ge.cadastrarProduto();
                    break;
                case 4://Listar os Produtos
                    produto.estoque();
                    produto.adicionarProdutos();
                    
                    produto.verificarEstoque();
                    break;
                case 5:
                    Mesa ms = new Mesa();
                    ms.listarMesa();
                    ge.cadastrarMesa(); //chamando o metodo de cadastro de mesa
                    break;
                case 6:
                   // ge.gerarRelatorio(); //chamando o metodo gerarRelatorio
                    break;
                case 7:
                    login();//Chamando a funcao login 
                    break;
                default:
                    System.out.println("The end");
            }
        } while (select != 0);
    }

    public void menuGarcom(Scanner input) {
        int select;
        do {

            System.out.println("1. Fazer pedido");
            System.out.println("2. fechar conta/comanda");
            System.out.println("o. para Sair");
            select = input.nextInt();
            switch (select) {
                case 1:
                    Garcom garcom = new Garcom();
                    System.out.println("informe o numero da mesa");
                    int mesa = input.nextInt();
                   // garcom.atenderMesa(mesa);
                    
                    break;
                case 2:
                    System.out.println("Informe o numero da mesa ");
                    mesa = input.nextInt();
                    //garcom.fecharConta(mesa);
                    break;
                default:
                    System.out.println("The end ");
            }
        } while (select != 0);

    }

}
