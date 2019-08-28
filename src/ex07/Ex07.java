package ex07;
//A corrida do círio atrai muitos competidores. Faça um programa que cadastre os participantes,
//tendo consciência que o número de competidores é indefinido. Os objetos devem estar encapsulados. 
//Na corrida existem corredores de Belém e de outros municípios. 
//Use dois construtores diferentes para inicializar de forma diferente os corredores que são de Belém e os que não são.

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Ex07 {
    public static void main(String[] args) {
        boolean continuar = true, isBelem;
        String nome, municipio, txt = "";
        ArrayList<Competidor> competidores = new ArrayList();
        
        while (continuar) 
        {                 
            isBelem = JOptionPane.showConfirmDialog(null, "Você é de Belém?") == 0;
            nome = JOptionPane.showInputDialog("Insira o nome do competidor");
            if (isBelem) 
            {
                competidores.add(new Competidor(nome));
            }
            else
            {
                municipio = JOptionPane.showInputDialog("Insira o nome do seu município");
                competidores.add(new Competidor(nome, municipio));
            }
            continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?") == 0;
        }
        
        for (Competidor competidor : competidores) {
            txt += (competidores.indexOf(competidor)+1)+"º Competidor\nNome: "+competidor.getNome()+"\nMunicípio: "+competidor.getMunicipio()+"\n";
        }
        JOptionPane.showMessageDialog(null, txt);
    }
}
