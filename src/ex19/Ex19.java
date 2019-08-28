package ex19;
//Faça uma pesquisa sobre métodos estáticos e variáveis estáticas e desenvolva um programa que
//utilizando set e get armazene e exiba informação sobre os CDs. Após resolver a questão você
//consegue perceber vantagens no uso de métodos e variáveis estáticas? E se os métodos e as
//variáveis não fossem estáticas?

import javax.swing.JOptionPane;




public class Ex19 {
    public static void main(String[] args) {
        int t = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos CDs deseja cadastrar"));
        CD[] cds = new CD[t];
        for (int i = 0; i < cds.length; i++) {
            cds[i] = new CD();
            cds[i].setTitulo(JOptionPane.showInputDialog("Insira o título do "+(i+1)+"º CD"));
            cds[i].setAno(JOptionPane.showInputDialog("Insira o ano do "+(i+1)+"º CD"));
            cds[i].setArtista(JOptionPane.showInputDialog("Insira o nome do artista do "+(i+1)+"º CD"));
        }
        exibirInformacoes(cds);
    }
    
    public static void exibirInformacoes(CD[] cds)
    {
        String txt = "";
        for (int i = 0; i < cds.length; i++) {
            txt += (i+1)+"º CD\nTítulo: "+cds[i].getTitulo()+"\nArtísta: "+cds[i].getArtista()+"\nAno: "+cds[i].getAno()+"\n\n";
        }
        JOptionPane.showMessageDialog(null, txt);
    }
}
