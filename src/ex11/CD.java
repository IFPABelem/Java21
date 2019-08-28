package ex11;



public class CD {
    private String artista, ano, titulo;

    @Override
    public String toString() {
        return "Título: "+titulo+"\nArtista: " + artista + "\nAno: " + ano;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
