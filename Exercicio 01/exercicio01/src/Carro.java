public class Carro {
    private String modelo = "Eco-Sport";
    private String cor = "Marrom";
    private int ano = 2007;

    // nome do construtor deve ser igual da class
    public Carro() {
    }

    public void alteracaoDaCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public int getAno() {
        return this.ano;
    }

}
