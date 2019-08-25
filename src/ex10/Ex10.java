/*
10.  Faça um programa que seja capaz de armazenar e exibir as informações que um cliente comprou
de alguns produtos que pertencem a um dado fornecedor. Cada objeto deve ter pelo menos
quatro variáveis de instancia. Todas as variáveis devem estar encapsuladas.
*/

package ex10;

import javax.swing.JOptionPane;

public class Ex10 {
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
        int tamanho = getTamanho("Quantidade de produtos:");
        Produto[] produtos = new Produto[tamanho];
        for (int i = 0; i < produtos.length; i++) {
            produtos[i] = new Produto();
            produtos[i].setCodigo(Integer.parseInt(JOptionPane.showInputDialog((i+1) + ". Código:")));
            produtos[i].setNome(JOptionPane.showInputDialog((i+1) + ". Nome:"));
            produtos[i].setFornecedor(JOptionPane.showInputDialog((i+1) + ". Fornecedor:"));
            produtos[i].setValor(Double.parseDouble(JOptionPane.showInputDialog((i+1) + ". Valor:")));
        }

        String texto = "Produtos:\n";
        for (Produto produto : produtos) {
            texto += produto;
        }

        JOptionPane.showMessageDialog(null, texto);
    }
}
