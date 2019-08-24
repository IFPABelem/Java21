package ex01;

import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {//b
//1) Crie um programa Java para armazenar dados de clientes (nome, endereço e telefone). Os
//dados devem estar protegidos. Evitando assim que eles sejam alterados diretamente, o que só
//poderá ser feito por meio de métodos. O programa deverá ter somente o método consultar
//dados e não deve ser criado o método toString(). Instancie dois objetos do tipo cliente e não
//guarde as referências destes objetos em arranjo. O programa deve ter um método especial para
//inicializar as variáveis de instancia dos objetos. Ao concluir o programa responda as seguintes
//questões:
//a. Qual linha passa os argumentos para o construtor?
//b. Qual linha tem o tem o nome do método responsável por executar o programa?
//c. Qual linha recebe argumentos?
    Ex01Cliente c1 = new Ex01Cliente("João", "Rua 1", "981234567");//a
    Ex01Cliente c2 = new Ex01Cliente("José", "Rua 2", "981234568");

    c1.setNome("Pedro");
    c1.setEndereco("Rua 3");
    c1.setTelefone("987654321");
    JOptionPane.showMessageDialog(null, c1.consultarDados());
    JOptionPane.showMessageDialog(null, c2.consultarDados());
    
    }
    
}
