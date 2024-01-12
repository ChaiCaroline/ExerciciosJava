public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(10);

        System.out.println(conta.saldo());

        conta.sacar(10);

        System.out.println(conta.saldo());
    }
}
