package ex05;


public class Homem extends Associado{
    private String esporte_preferido;
    private String trabalho_manual;

    public Homem(String esporte_preferido, String trabalho_manual, String nome, String idade) {
        super(nome, idade);
        this.esporte_preferido = esporte_preferido;
        this.trabalho_manual = trabalho_manual;
    }

    public String getEsporte_preferido() {
        return esporte_preferido;
    }

    public void setEsporte_preferido(String esporte_preferido) {
        this.esporte_preferido = esporte_preferido;
    }

    public String getTrabalho_manual() {
        return trabalho_manual;
    }

    public void setTrabalho_manual(String trabalho_manual) {
        this.trabalho_manual = trabalho_manual;
    }

    @Override
    public String toString() {
        return "Homem\n" +"Nome: " + getNome()+"\nIdade: " + getIdade()+ "\nEsporte Preferido: " + esporte_preferido + "\nTrabalho manual:" + trabalho_manual;
    }
    
}
