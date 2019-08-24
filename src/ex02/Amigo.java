package ex02;

import javax.swing.JOptionPane;

import com.sun.org.apache.xml.internal.security.Init;

public class Amigo {
    private String nome;
    private String sexo; // M || F
    private int idade;
    private String enredeco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEnredeco() {
        return enredeco;
    }

    public void setEnredeco(String enredeco) {
        this.enredeco = enredeco;
    }

    @Override
    public String toString() {
        return "Amigo [idade=" + idade + ", nome=" + nome + "]";
    }
}
