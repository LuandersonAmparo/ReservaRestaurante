/*Descrição: Funcionalidade que permite o cadastro das mesas do restaurante.*/
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservarestaurante;

import java.util.ArrayList;

/**
 *
 * @author Luanderson Amparo
 * @author Lucas Alves
 */
public class Mesa {

    private ArrayList<String> statusMesa = new ArrayList<String>();
    private ArrayList<Integer> capacidadeMesa = new ArrayList<Integer>();

    public int Numero;//define o numero da mesa;
    public int Capacidade; //define a quantidade de pessoas que cabem numa mesa;
    public String Status; //livre, ocupada, reservada;

    public void mesasCadastrada() {
        
        statusMesa.add("livre");
        capacidadeMesa.add(4);

        statusMesa.add("livre");
        capacidadeMesa.add(2);

        statusMesa.add("ocupada");
        capacidadeMesa.add(6);

        statusMesa.add("ocupada");
        capacidadeMesa.add(8);

        statusMesa.add("livre");
        capacidadeMesa.add(5);

        statusMesa.add("livre");
        capacidadeMesa.add(3);

        statusMesa.add("ocupada");
        capacidadeMesa.add(7);

        statusMesa.add("livre");
        capacidadeMesa.add(4);

        statusMesa.add("livre");
        capacidadeMesa.add(2);

        statusMesa.add("ocupada");
        capacidadeMesa.add(6);
    }

    public void reservarMesa(Garcom garcom, Cliente cliente, int numeroMesa) {

    }

    public void liberarMesa() {

    }

    public void setmesa(int numeroMesa) {
        this.Numero = numeroMesa;
    }
public void listarMesa(){
    for(int indice = 0; indice <statusMesa.size();indice ++){
        System.out.println(statusMesa.get(indice));
    }
}

    void setNumero(int numero) {
        
    }

    void setCapacidade(int capacidade) {
        
    }
}
