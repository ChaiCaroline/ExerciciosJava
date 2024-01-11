public class App {
    public static void main(String[] args) throws Exception {
        Autor autor = new Autor("Stephanie");
        Editora editora = new Editora("Editora Nova");

        Livro livro = new Livro("Crepúsculo", autor, editora);

        System.out.println(livro.getNomeLivro());
        System.out.println(livro.getAutor().getAutorDoLivro());
        System.out.println(editora.getEditoraDoLivro());
    }
}
