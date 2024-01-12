public class Carro extends Veiculo {
    int quantasPortas;
    int quantidadePassageiros;

    public Carro(String modelo, String cor, int ano, String placa, int quantasPortas, int quantidadePassageiros) {
        super(modelo, cor, ano, placa);

        this.quantasPortas = quantasPortas;
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public int getQuantasPortas() {
        return this.quantasPortas;
    }

    public void setQuantasPortas(int quantasPortas) {
        this.quantasPortas = quantasPortas;
    }

    public int getQuantidadePassageiros() {
        return this.quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

}
