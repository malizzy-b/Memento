/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

/**
 *
 * @author Marina
 */
public class Memento {
   private String state; //atributo que armazena o estado do objeto que está sendo capturado pelo Memento

   public Memento(String state){
      this.state = state;
   }

   public String getState(){ // permite que outros objetos recuperem o estado armazenado no Memento.
      return state;
   }	
}
