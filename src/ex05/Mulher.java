package ex05;


public class Mulher extends Associado{
    private int partos;
    private String preventivo;

    public Mulher(int partos, String preventivo, String nome, String idade) {
        super(nome, idade);
        this.partos = partos;
        this.preventivo = preventivo;
    }

    public int getPartos() {
        return partos;
    }

    public void setPartos(int partos) {
        this.partos = partos;
    }

    public String getPreventivo() {
        return preventivo;
    }

    public void setPreventivo(String preventivo) {
        this.preventivo = preventivo;
    }

    @Override
    public String toString() {
        return "Mulher\n" + "Nome: " + getNome()+"\nIdade: " + getIdade()+ "\nPartos: " + partos + "Fez preventivo: " + preventivo;
    }
}
