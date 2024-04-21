/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservarestaurante;

/**
 *
 * @author Luanderson Amparo
 */
public class Cliente {
    
    private String nome;
    private int CPF;
    private int Telefone;
    private String Email;
    
   public void setnome(String nomecli){
    nome = nomecli;
   }
   public void setCPF(int cpf){
       CPF = cpf;
   }
   public void setTelefone(int tel){
       Telefone = tel;
   }
   public void setEmail(String email){
       Email = email;
   }
}
