package ex15;
//Às vezes temos objetos menores envolvidos por objetos maiores, por exemplo, um batalhão
//possui vários pelotões que possui vários soldados. Faça um programa que permita criar objetos
//do tipo pelotão e dentro deles objetos do tipo soldado.

import javax.swing.JOptionPane;


public class Ex15 {
    public static void main(String[] args) {
        Pelotao p1 = new Pelotao();
        p1.setNome(JOptionPane.showInputDialog(null, "Insira o nome do pelotão"));
        
        Soldado p1s1 = new Soldado();
        p1s1.setNome(JOptionPane.showInputDialog(null, "Insira o nome do soldado"));
        Soldado p1s2 = new Soldado();
        p1s2.setNome(JOptionPane.showInputDialog(null, "Insira o nome do soldado"));
        
        Soldado[] soldadosp1  = {p1s1, p1s2};
        p1.setSoldados(soldadosp1);
        JOptionPane.showMessageDialog(null, p1.toString());
        
        Pelotao p2 = new Pelotao();
        p2.setNome(JOptionPane.showInputDialog(null, "Insira o nome do pelotão"));
        
        Soldado p2s1 = new Soldado();
        p2s1.setNome(JOptionPane.showInputDialog(null, "Insira o nome do soldado"));
        Soldado p2s2 = new Soldado();
        p2s2.setNome(JOptionPane.showInputDialog(null, "Insira o nome do soldado"));
        
        Soldado[] soldadosp2  = {p2s1, p2s2};
        p2.setSoldados(soldadosp2);
        JOptionPane.showMessageDialog(null, p2.toString());
    }
}
