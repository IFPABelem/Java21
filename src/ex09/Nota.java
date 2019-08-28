package ex09;


public class Nota {
    private int numero;
    private String cliente, endereco;
    private Item[] item;

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "Nota\nNº: "+numero+"\nCliente: "+cliente+"\nEndereço: "+endereco+"\nItens: \n";
    }
    
}
