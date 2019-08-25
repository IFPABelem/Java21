/*
20. Faça um programa que crie dois objetos do tipo carro com as referências c1 e c2. Declare uma
referência c3 e faça ela “apontar” para o segundo objeto criado, e em seguida “desconecte” a
referência c2 do segundo objeto criado. Retire a referência do primeiro objeto. Após resolver a
questão responda: Você sabe o que vai acontecer com o objeto que está sem referência? Você
já ouviu falar em Coleta de Lixo? Que erro acontece se você tentar acessar novamente as
variáveis do objeto que ficou sem referência?
*/
package ex20;

import javax.swing.JOptionPane;

public class Ex20 {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setCor(JOptionPane.showInputDialog("1. Cor:"));
        c1.setPlaca(JOptionPane.showInputDialog("1. Placa:"));

        Carro c2 = new Carro();
        c2.setCor(JOptionPane.showInputDialog("2. Cor:"));
        c2.setPlaca(JOptionPane.showInputDialog("2. Placa:"));

        Carro c3 = c2;
    
        c2 = null; // “desconecte”

        JOptionPane.showMessageDialog(null, c1 + "\n" + c2);
    }
}
