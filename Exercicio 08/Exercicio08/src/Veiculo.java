public class Veiculo {
    private String modelo;
    private String cor;
    private int ano;
    private String placa;

    public Veiculo(String modelo, String cor, int ano, String placa) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;

        if (placa.length() == 7) {
            this.placa = placa;
        } else {
            System.out.println("Placa Não Existe");
        }
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
