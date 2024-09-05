/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marina
 */
public class CareTaker {
   private List<Memento> mementoList = new ArrayList<Memento>(); //lista os mementos criados do originator

   public void add(Memento state){ //Armazena e adiciona o estado o memento à lista
      mementoList.add(state);
   }

   public Memento get(int index){ //retorna o objeto Memento armazenado na lista mementoList na posição especificada pelo índice
      return mementoList.get(index);
   }
}