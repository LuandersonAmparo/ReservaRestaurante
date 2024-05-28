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
    }

    public void consultarReserva() {
        System.out.println("teste for normal");
        for (int i = 0; i < reserva.size(); i++) {
            System.out.println("imprimindo I " + i);
        }
        System.out.println("teste forech");
        for (int indice = 0; indice < reserva.size(); indice++) {
            System.out.println("imprimindo " + reserva.get(indice));
        }

    }

    public void alterarReserva() {

    }

    public void apagarReserva() {

    }
}
