package ex14;

public class Taxi {
    private String placa;
    private String nome;
    private String turno;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Nome= " + nome + ", Placa=" + placa + ", Turno=" + turno + "\n";
    }
}
