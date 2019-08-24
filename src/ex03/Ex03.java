package ex03;

import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args) {
//Criar uma classe executável que instancie quatro objetos do tipo Medicamento guardando suas
//referências dentro de um arranjo. A classe não deve ter construtor explicito. Os parâmetros e as
//variáveis de instância devem ter o mesmo nome. Os campos obrigatórios são data de fabricação
//e tempo de validade do medicamento (por exemplo: 2 anos). O programa deve emitir uma
//mensagem caso o medicamento esteja vencido.
    Medicamento[] medicamentos = new Medicamento[4];
    for (int i = 0; i < medicamentos.length; i++) {
        medicamentos[i] = new Medicamento();
        medicamentos[i].setData_atual(Integer.parseInt(JOptionPane.showInputDialog("Insira a Data Atual do "+(i+1)+"º")));
        medicamentos[i].setData_fabric(Integer.parseInt(JOptionPane.showInputDialog("Insira a Data de Frabricação "+(i+1)+"º")));
        medicamentos[i].setValidade(Integer.parseInt(JOptionPane.showInputDialog("Insira o tempo de Validade "+(i+1)+"º")));
            if ((medicamentos[i].getData_atual() - medicamentos[i].getData_fabric()) >= medicamentos[i].getValidade()) {
                JOptionPane.showMessageDialog(null, "O "+(i+1)+"º medicamento está vencido!!");
            }else{
                JOptionPane.showMessageDialog(null, "O "+(i+1)+"º medicamento não está vencido!!");
            }
    }
    

    }
}
