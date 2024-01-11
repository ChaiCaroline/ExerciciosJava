public class Autor {
    private String AutorDoLivro = "David Hows";

    public Autor(String autor) {
        this.AutorDoLivro = autor;
    }

    public String getAutorDoLivro() {
        return this.AutorDoLivro;
    }

    public void setAutorDoLivro(String autorAtualizado) {
        this.AutorDoLivro = autorAtualizado;
    }
}
