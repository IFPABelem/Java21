package ex11;
//Que tal organizar um programa que permita descobrir se você tem um cd daquele artista que
//você tanto gosta. Crie um cadastro de CDs e depois crie uma rotina que pesquise se o cd
//existe na sua coleção pesquisando pelo nome do artista. Utilizar encapsulamento.

import javax.swing.JOptionPane;


public class Ex11 {
    public static void main(String[] args) {
        int t = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos CDs deseja cadastrar"));
        String artista;
        CD[] cds = new CD[t];
        for (int i = 0; i < cds.length; i++) {
            cds[i] = new CD();
            cds[i].setTitulo(JOptionPane.showInputDialog("Insira o título do "+(i+1)+"º CD"));
            cds[i].setAno(JOptionPane.showInputDialog("Insira o ano do "+(i+1)+"º CD"));
            cds[i].setArtista(JOptionPane.showInputDialog("Insira o nome do artista do "+(i+1)+"º CD"));
        }
        artista = JOptionPane.showInputDialog("Digite o nome do artista que deseja pesquisar");
        pesqArtista(cds, artista);
    }
    
    public static void pesqArtista(CD[] cds, String artista) {
        boolean existe = false;
        String txt = "";
        for (CD cd : cds) {
            if(cd.getArtista().toUpperCase().equals(artista.toUpperCase()))
            {
                existe = true;
                txt = cd.toString();
            }
        }
        if (existe)
            JOptionPane.showMessageDialog(null, "O CD desse artista existe na sua coleção!!\n"+txt);
        else
            JOptionPane.showMessageDialog(null, "O CD desse artista não existe na sua coleção!!");
    }
}
