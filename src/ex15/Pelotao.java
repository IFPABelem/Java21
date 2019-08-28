package ex15;



public class Pelotao {
    private Soldado[] soldados;
    private String nome;

    @Override
    public String toString() {
        String txt = "";
        for (Soldado soldado : soldados) {
            txt += soldado.getNome()+"\n";
        }
        return "Pelotao "+nome+"\nSoldados:\n" + txt;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Soldado[] getSoldados() {
        return soldados;
    }

    public void setSoldados(Soldado[] soldados) {
        this.soldados = soldados;
    }
}
