package ex17;
//Faça uma pesquisa sobre métodos estáticos e variáveis estáticas e desenvolva um programa para
//que permita fazer as quatro operações aritmética (somar, subtrair, multiplicar e dividir) usando um
//método estático para cada uma das operações, como por exemplo: public static multiplicar(int n).
//Após resolver a questão reflita sobre as características dos métodos estáticos e variáveis
//estáticas.

import javax.swing.JOptionPane;




public class Ex17 {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor"));
        JOptionPane.showMessageDialog(null, "Soma: "+somar(n1,n2));
        JOptionPane.showMessageDialog(null, "Subtrair: "+subtrair(n1,n2));
        JOptionPane.showMessageDialog(null, "Multiplicar: "+multiplicar(n1,n2));
        JOptionPane.showMessageDialog(null, "Dividir: "+dividir(n1,n2));
    }
    
    public static double somar(double n1, double n2) 
    {
        return (n1+n2);
    }
    public static double subtrair(double n1, double n2) 
    {
        return (n1-n2);
    }
    public static double multiplicar(double n1, double n2) 
    {
        return (n1*n2);
    }
    public static double dividir(double n1, double n2) 
    {
        return (n1/n2);
    }
}
