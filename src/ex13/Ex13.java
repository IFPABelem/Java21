package ex13;
//Que tal fazer um programa para jogar dois dadinhos que funcione da seguinte maneira, rola o
//primeiro dadinho e depois rolar o segundo dadinho, se os números forem iguais, por exemplo,
//quina e quina, você ganhou mostrar uma mensagem “you are Champion”. Caso contrário, você
//perdeu, mas pode repetir a jogada até não querer mais jogar.

import javax.swing.JOptionPane;




public class Ex13 {
    public static void main(String[] args) {
        boolean continuar = true;
        int n1, n2, confirm;
        
        while (continuar) {    
            n1 = (int) ((Math.random()*6)+1);
            JOptionPane.showMessageDialog(null, "O valor do primeiro dado é: "+n1);
            n2 = (int) ((Math.random()*6)+1);
            JOptionPane.showMessageDialog(null, "O valor do segundo dado é: "+n2);
            if(n1 == n2)
            {
                JOptionPane.showMessageDialog(null, "you are Champion");
                confirm = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                continuar = confirm == 0;
            }
            else
            {
                confirm = JOptionPane.showConfirmDialog(null, "Você perdeu! deseja tentar novamente?");
                continuar = confirm == 0;
            }
                
        }
        
    }
}
