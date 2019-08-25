/*
12. Um albergue para moradores de rua funciona como abrigo noturno. Todo dia os moradores
devem se cadastrar para ter direito a sopa e um local para dormir. Os dados do cadastro são:
nome, idade, naturalidade e nome da mãe. O problema é que alguns não sabem nenhum desses
dados e outros sabem somente alguns (p.ex. nome e naturalidade). Faça uma classe encapsulada
com quatro construtores para poder inicializar o objeto de 4 maneiras diferentes e assim resolver
o problema da falta de memória dos moradores de rua
*/
package ex12;

import javax.swing.JOptionPane;

import com.sun.org.apache.bcel.internal.generic.Type;

public class Ex12 {
    private static boolean isStringEmpty(String string) {
        return (string == null || string.length() == 0);
    }

    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de moradores:"));
        Morador[] moradores = new Morador[tamanho];
        for (int i = 0; i < moradores.length; i++) {
            String nome = JOptionPane.showInputDialog("Nome (se não soube deixe em branco):");
            String idadeSrt = JOptionPane.showInputDialog("Idade (se não soube deixe em branco):");
            String naturalidade = JOptionPane.showInputDialog("Naturalidade (se não soube deixe em branco):");
            String mae = JOptionPane.showInputDialog("Nome da mãe (se não soube deixe em branco):");

            int idade = 0;
            if (!isStringEmpty(idadeSrt)) {
                idade = Integer.parseInt(idadeSrt);
            }

            if (!isStringEmpty(nome) && !isStringEmpty(idadeSrt) && !isStringEmpty(naturalidade) && !isStringEmpty(mae)) {
                moradores[i] = new Morador(nome, idade, naturalidade, mae);
            } else if (!isStringEmpty(nome) && !isStringEmpty(idadeSrt)) {
                moradores[i] = new Morador(nome, idade);
            } else if (!isStringEmpty(nome)) {
                moradores[i] = new Morador(nome);
            } else {
                moradores[i] = new Morador();
            }
        }

        String texto = "Lista de moradores:\n";
        for (Morador morador : moradores) {
            texto += morador;

        }

        JOptionPane.showMessageDialog(null, texto);
    }
}
