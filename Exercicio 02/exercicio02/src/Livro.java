public class Livro {
    private String nomeLivro = "Introdução ao MongoDB";
    private Autor autorDoLivro;
    private Editora editoraDoLEditora;

    public Livro(String livro, Autor autor, Editora editora) {
        this.nomeLivro = livro;
        this.autorDoLivro = autor;
        this.editoraDoLEditora = editora;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeNovoLivro) {
        nomeLivro = nomeNovoLivro;
    }

    public Autor getAutor() {
        return this.autorDoLivro;
    }

    public void setAutorDoLivro(Autor autor) {
        this.autorDoLivro = autor;
    }

    public Editora getEditoraDoLEditora() {
        return this.editoraDoLEditora;
    }

    public void setEditoraDoLEditora(Editora editoraDoLEditora) {
        this.editoraDoLEditora = editoraDoLEditora;
    }

}
