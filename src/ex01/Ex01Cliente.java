package ex01;

public class Ex01Cliente {
    private String nome;
    private String endereco;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public Ex01Cliente(String nome, String endereco, String telefone) {//c
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String consultarDados(){
        return "Cliente\nNome: "+getNome()+"\nEndereço: "+getEndereco()+"\nTelefone: "+getTelefone();
    }
}
