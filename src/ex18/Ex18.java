/*
18. Faça um programa que cadastre um campeonato de vôlei: Os jogadores, as equipes e as
partidas. Encapsular os dados.
*/
package ex18;

import javax.swing.JOptionPane;

public class Ex18 {
    private static int getTamanho (String texto, int minimo) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog(texto));
        if (tamanho < minimo) {
            do {
                tamanho = Integer.parseInt(JOptionPane.showInputDialog("O valor tem que ser maior que ou igual" + minimo + "! " + texto));
            } while (tamanho < minimo);
        }
        return tamanho;
    }

    private static int getEquipe (String texto, int maximo, int ultimoId) {
        int id = getTamanho(texto, 0);
        if (id > (maximo-1) || id == ultimoId) {
            do {
                id = getTamanho("O valor tem que ser menor que " + maximo + " e não pode ter o mesmo ID que a equipe anterior! " + texto, 0);
            } while (id > (maximo-1) || id == ultimoId);
        }
        return id;
    }

    public static void main(String[] args) {
        int totalEquipe = getTamanho("Total de equipes:", 2);
        int totalJogadores = getTamanho("Total de jogadores por equipe", 2);

        Equipe[] equipes = new Equipe[totalEquipe];
        Jogador[] jogadores = new Jogador[totalEquipe * totalJogadores];

        for (int i = 0; i < equipes.length; i++) {
            equipes[i] = new Equipe();
            equipes[i].setNome(JOptionPane.showInputDialog("Nome da equipe: "));
            equipes[i].setCidade(JOptionPane.showInputDialog("(" + equipes[i].getNome() + " - ID:" + i + ") Cidade da equipe: "));

            for (int j = 0; j < totalJogadores; j++) {
                int posicao = i * totalJogadores + j;
                jogadores[posicao] = new Jogador();
                jogadores[posicao].setNome(JOptionPane.showInputDialog("(" + equipes[i].getNome() + " - ID:" + i + " - PlayID:" + (j + 1) + ")  Nome do jogador: "));
                jogadores[posicao].setEquipe(equipes[i].getNome());
            }
        }

        int totalPartidas = getTamanho("Total de partidas:", totalEquipe/2);
        Partida[] partidas = new Partida[totalPartidas];

        for (int z = 0; z < partidas.length; z++) {
            partidas[z] = new Partida();
            int id1 = getEquipe((z+1) + ". ID da 'A' equipe:", totalEquipe, -1);
            int id2 = getEquipe((z+1) + ". ID da 'B' equipe:", totalEquipe, id1);
            partidas[z].setEquipe01(equipes[id1].getNome());
            partidas[z].setEquipe02(equipes[id2].getNome());
        }

        String jogadoresLista = "Jogadores:\n";
        for (Jogador jogador : jogadores) {
            jogadoresLista += jogador.getEquipe() + " - " + jogador.getNome() + "\n";
        }

        String equipesLista = "Equipes:\n";
        for (Equipe equipe : equipes) {
            equipesLista += equipe.getNome() + " - " + equipe.getCidade() + "\n";
        }

        String partidasLista = "Partidas:\n";
        for (Partida partida : partidas) {
            partidasLista += partida.getEquipe01() + " VS " + partida.getEquipe02() + "\n";
        }

        JOptionPane.showMessageDialog(null, jogadoresLista);
        JOptionPane.showMessageDialog(null, equipesLista);
        JOptionPane.showMessageDialog(null, partidasLista);
    }
}
