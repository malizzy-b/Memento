/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

/**
 *
 * @author Marina
 */
public class Originator {
   private String state; //atributo que armazena o estado do originator

   public void setState(String state){ //Permitem a modificação e o acesso ao estado do Originator
      this.state = state;
   }

   public String getState(){ 
      return state;
   }

   public Memento saveStateToMemento(){ //Salva seu estado atual criando um novo objeto Memento e o inicializa com o estado atual do Originator
      return new Memento(state);
   }

   public void getStateFromMemento(Memento memento){ //Atualiza o estado do originator
      state = memento.getState();
   }
}
