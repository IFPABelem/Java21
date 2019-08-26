/*
21. Utilizando encapsulamento crie um objeto mercadoria com as variáveis descrição, quantidade e
preço. Declare duas referências, m1 e m2, do tipo mercadoria. Não crie os objetos e tente usar
os métodos set e get com as referências declaradas. O que aconteceu? Por que isto acontece?

O que aconteceu?
    Erro ao tentar fazer debug do programar pelo netbeans, informado:
        Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        The local variable m1 may not have been initialized
        ...
Por que isto acontece?
    Pois nenhuma das variáveis "m1" e "m2", recebe a referência do objeto, somente o tipo da variável.

*/
package ex21;

import javax.swing.JOptionPane;

public class Ex21 {
    public static void main(String[] args) {
        Mercadoria m1;// = new Mercadoria(); 
        Mercadoria m2;// = new Mercadoria();

        m1.setDescricao(JOptionPane.showInputDialog("1. Descrição:"));
        m1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("1. Preço:")));
        m1.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("1. Quantidade:")));

        m2.setDescricao(JOptionPane.showInputDialog("2. Descrição:"));
        m2.setPreco(Double.parseDouble(JOptionPane.showInputDialog("2. Preço:")));
        m2.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("2. Quantidade:")));

        String texto = "Lista:\n";
        texto += m1.getDescricao() + "    TOTAL: R$" + (m1.getPreco() * m1.getQuantidade()) + "\n";
        texto += m2.getDescricao() + "    TOTAL: R$" + (m2.getPreco() * m2.getQuantidade());
        JOptionPane.showMessageDialog(null, texto);
    }
}
