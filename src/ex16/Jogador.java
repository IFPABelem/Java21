package ex16;

public class Jogador {
    private String nome;
    private int palitinhos;
    private static int jogadoresQt = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPalitinhos() {
        return palitinhos;
    }

    public void setPalitinhos(int palitinhos) {
        this.palitinhos = palitinhos;
    }

    public static int getJogadoresQt() {
        return Jogador.jogadoresQt;
    }

    public static void setJogadoresQt(int jogadoresQt) {
        Jogador.jogadoresQt = jogadoresQt;
    }

    public static void addJogadoresQt() {
        Jogador.jogadoresQt += 1;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", Palitinhos=" + palitinhos + "\n";
    }
}
