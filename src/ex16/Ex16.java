/*
16. Um jogo de palitinho pode possuir vários jogadores. Faça um programa que armazene o nome de
cada jogador e quantos palitinhos cada um tem na mão. Alem disso deve ser armazenado o
número de jogadores como uma variável estática.
*/
package ex16;

import javax.swing.JOptionPane;

public class Ex16 {
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de jogadores:"));
        Jogador[] jogadores = new Jogador[tamanho];
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i] = new Jogador();
            jogadores[i].setNome(JOptionPane.showInputDialog((i+1) + ". Nome do jogador:"));
            jogadores[i].setPalitinhos(Integer.parseInt(JOptionPane.showInputDialog((i+1) + ". Quantidade de palitinhos:")));
            jogadores[i].addJogadoresQt();
        }

        String texto = "Jogadores (" + jogadores[0].getJogadoresQt() + ")\n";
        for (Jogador jogador : jogadores) {
            texto += jogador;
        }

        JOptionPane.showMessageDialog(null, texto);
    }
}
