package ex20;

public class Carro {
    private String cor;
    private String placa;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carro [cor=" + cor + ", placa=" + placa + "]";
    }
}
