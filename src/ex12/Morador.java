package ex12;

public class Morador {
    private String nome = "N/d";
    private int idade = 0;
    private String naturalidade = "N/d";
    private String mae = "N/d";

    public Morador() {
        // O morador que não tem nenhum dos dados
    }

    public Morador(String nome) {
        this.nome = nome;
    }

    public Morador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Morador(String nome, int idade, String naturalidade, String mae) {
        this.nome = nome;
        this.idade = idade;
        this.naturalidade = naturalidade;
        this.mae = mae;
    }

    @Override
    public String toString() {
        String idadeSrt = "N/d";
        if (0 < idade) {
            idadeSrt = "" + idade;
        }

        return "Nome= " + nome + ", Idade= " + idade + ", Nome da mãe= " + mae + ", Naturalidade= " + naturalidade + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }
}
