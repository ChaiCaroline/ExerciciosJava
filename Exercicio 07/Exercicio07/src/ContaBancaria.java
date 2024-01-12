public class ContaBancaria {
    private double saldo = 0;

    public void depositar(double novoValor) {
        saldo += novoValor;
    }

    public void sacar(double novoValor) {
        if (novoValor <= saldo) {
            saldo -= novoValor;
        } else {
            System.out.println("Saldo insuficienet");
        }
    }

    public double saldo() {
        return saldo;
    }

}
