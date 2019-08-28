package ex09;


import javax.swing.JOptionPane;

//Faça um programa que armazene informações sobre notas fiscais e itens de uma nota fiscal. Na
//hora de exibir mostrar o total da nota como no desenho abaixo. Os dados devem estar
//encapsulados.
public class Ex09 {
    public static void main(String[] args) {
        
        Nota nota = new Nota();
        nota.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Insira o número da nota")));
        nota.setCliente(JOptionPane.showInputDialog("Insira o nome do cliente"));
        nota.setEndereco(JOptionPane.showInputDialog("Insira o endereço do cliente"));
        int t = Integer.parseInt(JOptionPane.showInputDialog("Insira quantos itens entrarão na nota"));
        Item[] item = new Item[t];
        String txtItens = nota.toString();
        double total = 0;
        for (int i = 0; i < item.length; i++) {
            item[i] = new Item();
            item[i].setCod(Integer.parseInt(JOptionPane.showInputDialog("Insira o código do "+(i+1)+"º produto")));
            item[i].setDescricao(JOptionPane.showInputDialog("Insira a descrição do "+(i+1)+"º produto"));
            item[i].setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do "+(i+1)+"º produto")));
            item[i].setUnidade(JOptionPane.showInputDialog("Insira a unidade do "+(i+1)+"º produto"));
            item[i].setPreco_unitario(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor unitário do "+(i+1)+"º produto")));
            item[i].setTotal(item[i].getPreco_unitario()*item[i].getQuantidade());
        }
        nota.setItem(item);
        
        for (int i = 0; i < nota.getItem().length; i++) {
            txtItens += "Item "+(i+1)+"\n"+nota.getItem()[i].toString()+"\n";
            total += nota.getItem()[i].getTotal();
        }
        JOptionPane.showMessageDialog(null, txtItens+"\n\nTOTAL GERAL: "+total);
    }
}
