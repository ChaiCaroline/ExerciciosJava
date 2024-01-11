public class Pessoa {
    private String nome = "Chaiene";
    private int idade = 28;
    private String sexo = "feminino";

    public Pessoa(String novoNome, int novaIdade, String novoSexo) {
        this.nome = novoNome;
        this.idade = novaIdade;
        this.sexo = novoSexo;
    }

    public String getNome() {
        return nome;
    }

}
