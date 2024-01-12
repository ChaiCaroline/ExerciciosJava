public class Calculadora {
    private double numero1;
    private double numero2;

    public Calculadora(double valorNumero1, double valorNumero2) {
        this.numero1 = valorNumero1;
        this.numero2 = valorNumero2;
    }

    public double adicao() {
        return numero1 + numero2;
    }

    public double subtracao() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    public double divisao() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            throw new ArithmeticException("Divisão por zero não permitida");
        }
    }

    public void limpar() {
        numero1 = 0;
        numero2 = 0;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

}
