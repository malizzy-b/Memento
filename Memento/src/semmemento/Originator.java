/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semmemento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marina
 */
public class Originator {
    private String state;
    private List<String> savedStates = new ArrayList<>();

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    //Salva o estado atual do Originator em uma lista de estados salvos.
    public void saveState() {
        savedStates.add(state);
    }

    //Restaura o estado do Originator para o estado na posição indicada.
    //Verifica se o índice fornecido é válido, se for atualiza o estado do Originator com o estado armazenado na posição especificada na lista savedStates.
    public void restoreState(int index) {
        if (index >= 0 && index < savedStates.size()) {
            state = savedStates.get(index);
        } else {
            System.err.println("Índice de estado inválido.");
        }
    }
}
