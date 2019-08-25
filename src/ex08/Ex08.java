/*
8. Devido ao desaparecimento de alguns computadores a empresa Dou-Te Cabana S/A
resolveu fazer um inventário dos seus bens com o intuito de preservar o seu patrimônio. Os
dados são np (número do patrimônio), descrição e valor. Faça uma classe encapsulada, não use o
método toString() e nem armazene as referências dos objetos em arranjos. Além disso, use as
variáveis locais com o mesmo nome das variáveis de instancia.
*/

package ex08;

import javax.swing.JOptionPane;

public class Ex08 {
    public static void main(String[] args) {
        Inventario obj1 = new Inventario();
        Inventario obj2 = new Inventario();
        Inventario obj3 = new Inventario();

        obj1.setNp(Integer.parseInt(JOptionPane.showInputDialog("1. Número do patrimônio:")));
        obj1.setDescricao(JOptionPane.showInputDialog("1. Descrição:"));
        obj1.setValor(Double.parseDouble(JOptionPane.showInputDialog("1. Valor:")));

        obj2.setNp(Integer.parseInt(JOptionPane.showInputDialog("2. Número do patrimônio:")));
        obj2.setDescricao(JOptionPane.showInputDialog("2. Descrição:"));
        obj2.setValor(Double.parseDouble(JOptionPane.showInputDialog("2. Valor:")));

        obj3.setNp(Integer.parseInt(JOptionPane.showInputDialog("3. Número do patrimônio:")));
        obj3.setDescricao(JOptionPane.showInputDialog("3. Descrição:"));
        obj3.setValor(Double.parseDouble(JOptionPane.showInputDialog("3. Valor:")));

        String texto = "Lista:\n";
        texto += "NP: " + obj1.getNp() + " Valor: " + obj1.getValor() + " Descrição: " + obj1.getDescricao() + "\n"; 
        texto += "NP: " + obj2.getNp() + " Valor: " + obj2.getValor() + " Descrição: " + obj2.getDescricao() + "\n"; 
        texto += "NP: " + obj3.getNp() + " Valor: " + obj3.getValor() + " Descrição: " + obj3.getDescricao() + "\n"; 
        
        JOptionPane.showMessageDialog(null, texto);
    }
}
