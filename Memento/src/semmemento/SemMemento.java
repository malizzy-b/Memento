/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semmemento;

/**
 *
 * @author Marina
 */
public class SemMemento {
    public static void main(String[] args) {
        Originator originator = new Originator();

        // Define estados e salva em um histórico
        originator.setState("State #1");
        originator.saveState();
        originator.setState("State #2");
        originator.saveState();
        originator.setState("State #3");
        originator.saveState();

        // Exibe o estado atual
        System.out.println("Current State: " + originator.getState());

        // Restaura para o primeiro estado salvo
        originator.restoreState(0);
        System.out.println("First saved State:  " + originator.getState());

        // Restaura para o segundo estado salvo
        originator.restoreState(1);
        System.out.println("Second saved State: " + originator.getState());
    }
}