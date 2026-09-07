public class CD {

    private String titulo;
    private String artista;
    private double preco;

    public CD(String titulo, String artista, double preco) {
        this.titulo = titulo;
        this.artista = artista;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public double getPreco() {
        return preco;
    }
}