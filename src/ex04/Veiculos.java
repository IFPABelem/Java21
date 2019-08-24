package ex04;

public class Veiculos {
    private String placa;
    private int ano;
    private String modelo;
    private String localidade = "São Paulo,";
    private String cor;
    private String marca = "Ford";

    public Veiculos(String placa, int ano, String modelo, String localidade, String cor, String marca) {
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.localidade = localidade;
        this.marca = marca;
    }
    
    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }
}
