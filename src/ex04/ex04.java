/*
4. Uma frota de 16 veículos precisa ser cadastrada. Faça um programa Java capaz de fazer este
cadastro com os seguintes dados: placa, ano, modelo, localidade, cor, marca. De ante mão o
programador deve estar ciente que todos os carros são de São Paulo, além disso, todos são da
marca Ford. Utilize arranjo para guardar as referências dos objetos. O programa não deve ter
métodos set e nem método toString(), somente deve ter métodos get().
*/
package ex04;

import javax.swing.JOptionPane;

public class ex04 {
    public static void main(String[] args) {
        int tamanho = 16;
        Veiculos[] veiculos = new Veiculos[tamanho];
        for (int i = 0; i < veiculos.length; i++) {
                String placa = JOptionPane.showInputDialog("Placa: ");
                int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
                String modelo = JOptionPane.showInputDialog("Modelo: ");
                String localidade = JOptionPane.showInputDialog("Localidade: ");
                String cor = JOptionPane.showInputDialog("Cor: ");
                String marca = JOptionPane.showInputDialog("Marca: ");

                veiculos[i] = new Veiculos(placa, ano, modelo, localidade, cor, marca);
        }

        String texto = "Veículos:\n";
        for (int i = 0; i < veiculos.length; i++) {
                texto += veiculos[i].getAno() + " - " + veiculos[i].getPlaca() + " - " + veiculos[i].getModelo() + " - " + veiculos[i].getLocalidade() + " - "
                        + veiculos[i].getCor() + " - " + veiculos[i].getMarca() + "\n";
        }

        JOptionPane.showMessageDialog(null, texto);
    }
}
