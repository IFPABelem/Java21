/*
14. Uma frota de Taxi possui 20 taxis, um motorista do dia e um motorista da noite. Faça um
programa que armazene informações sobre os taxis e os motoristas que estão alocados para
cada um. Utilizar encapsulamento.
*/
package ex14;

import javax.swing.JOptionPane;

public class Ex14 {
    public static void main(String[] args) {
        int tamanho = 20;
        Taxi[] taxis = new Taxi[tamanho];
        for (int i = 0; i < taxis.length; i++) {
            taxis[i] = new Taxi();
            taxis[i].setNome(JOptionPane.showInputDialog((i+1) + ". Nome do motorista:"));
            taxis[i].setPlaca(JOptionPane.showInputDialog((i+1) + ". Placa do carro:"));
            
            int select = JOptionPane.showConfirmDialog(null, "Seu turno é pela manhã?", "Selecione uma opção", JOptionPane.YES_NO_OPTION);
            // Select (0 == Yes, 1 == No, -1 == Close Window)
            if (select < 0) {
                do {
                    select = JOptionPane.showConfirmDialog(null, "Você deve selecionar uma opção! Seu turno é pela manhã?", "Selecione uma opção", JOptionPane.YES_NO_OPTION);
                } while (select < 0);
            }

            if (select == 0) {
                taxis[i].setTurno("Manhã");
            } else {
                taxis[i].setTurno("Noite");
            }
        }

        String listaManha = "Táxis do turno da manhã:\n";
        String listaNoite = "Táxis do turno da noite:\n";

        for (Taxi taxi : taxis) {
            if (taxi.getTurno() == "Manhã") {
                listaManha += taxi;
            } else {
                listaNoite += taxi;
            }
        }

        JOptionPane.showMessageDialog(null, listaManha);
        JOptionPane.showMessageDialog(null, listaNoite);
    }
}
