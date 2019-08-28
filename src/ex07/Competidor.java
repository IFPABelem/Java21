package ex07;

public class Competidor {
    private String nome;
    private String municipio;

    public Competidor(String nome, String municipio) {
        this.nome = nome;
        this.municipio = municipio;
    }
    
    public Competidor(String nome) {
        this.nome = nome;
        this.municipio = "Belém";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}
