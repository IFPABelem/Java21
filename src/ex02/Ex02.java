package ex02;

import javax.swing.JOptionPane;

/*
1)	Criar uma classe chamada Amigo, com quatro variáveis de instancia. A classe deve estar encapsulada e através do método toString() somente exibir duas das variáveis. Um dos campos deve ser a idade e deve ter obrigatoriamente um limite inferior e um limite superior (ex: poderão ser meus amigos pessoas entre 18 e 60 anos).  O objeto não será criado se a idade informada estiver fora da faixa aceitável para ser amigo A classe deve limitar a idade inferior e superior dos seus amigos não criando o objeto amigo caso a idade não seja compatível. */

public class Ex02 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
//        if (18 > idade || 60 < idade) {
//            do {
//                idade = Integer.parseInt(JOptionPane.showInputDialog("Idade errada pois, poderão ser meus amigos pessoas entre 18 e 60 anos. Nova:"));
//            } while (18 > idade || 60 < idade);
//        }
        while (18 > idade || 60 < idade) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Idade errada pois, poderão ser meus amigos pessoas entre 18 e 60 anos. Nova:"));
        }

        Amigo amigo = new Amigo();
        amigo.setNome(JOptionPane.showInputDialog("Nome:"));
        amigo.setEnredeco(JOptionPane.showInputDialog("Endereço:"));
        amigo.setIdade(idade);
        amigo.setSexo(JOptionPane.showInputDialog("Sexo:"));
        JOptionPane.showMessageDialog(null, amigo);
    }
}
