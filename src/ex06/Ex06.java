package ex06;

import javax.swing.JOptionPane;


public class Ex06 {
    public static void main(String[] args) {
//Fazer um cadastro de alunos onde os dados não devem estar encapsulados. Os dados devem
//ser: nome do aluno, curso, disciplina e média. O programa não deve ter nenhum método. As
//referências devem estar em arranjo. Ao concluir o programa você conseguiu perceber as
//vantagens e desvantagens de programar com encapsulamento?
    Aluno[] alunos = new Aluno[2];
    String txt = "";
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
            alunos[i].nome = JOptionPane.showInputDialog("Insira o nome do "+(i+1)+"º aluno");
            alunos[i].curso = JOptionPane.showInputDialog("Insira o curso do "+(i+1)+"º aluno");
            alunos[i].disciplina = JOptionPane.showInputDialog("Insira a disciplina do "+(i+1)+"º aluno");
            alunos[i].media = JOptionPane.showInputDialog("Insira a media do "+(i+1)+"º aluno");
        }
        
        for (Aluno aluno : alunos) {
            txt += "Nome: "+aluno.nome+"\nCurso: "+aluno.curso+"\nDisciplina: "+aluno.disciplina+"\nMedia: "+aluno.media+"\n\n";
        }
        JOptionPane.showMessageDialog(null, txt);
    }
}
