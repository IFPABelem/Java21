/*
16. Um jogo de palitinho pode possuir vários jogadores. Faça um programa que armazene o nome de
cada jogador e quantos palitinhos cada um tem na mão. Alem disso deve ser armazenado o
número de jogadores como uma variável estática.
*/
package ex16;

import javax.swing.JOptionPane;

public class Ex16 {
    private static int getTamanho (String texto) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog(texto));
        if (tamanho <= 0) {
            do {
                tamanho = Integer.parseInt(JOptionPane.showInputDialog("O valor tem que ser maior que zero! " + texto));
            } while (tamanho <= 0);
        }
        return tamanho;
    } 

    public static void main(String[] args) {
        int tamanho = getTamanho("Quantidade de jogadores:");
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
