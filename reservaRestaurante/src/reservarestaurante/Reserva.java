/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservarestaurante;

import java.util.ArrayList;

/**
 *
 * @author Luanderson Amparo
 */
public class Reserva {

    private ArrayList<Cliente> reserva = new ArrayList<Cliente>();//Declarando um ArrayList de String com nome reserva

    public void novaReserva(Cliente NR) {
        reserva.add(NR);
        System.out.println("imprimindo a variavel NR" +NR);
        System.out.println("tamanho: "+reserva.size());
        
    }

    public void consultarReserva() {
        for(Cliente c:reserva){
            System.out.println(c.CPF +c.Lugares +c.Telefone +c.Email +c.nome);
        }

    }

    public void alterarReserva() {

    }

    public void apagarReserva() {

    }
}
