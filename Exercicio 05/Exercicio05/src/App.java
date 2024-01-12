public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora(10, 5);

        System.out.println(calculadora.adicao());

        calculadora.setNumero1(20);

        System.out.println(calculadora.divisao());

        calculadora.limpar();

        calculadora.setNumero1(1);

        System.out.println(calculadora.divisao());
    }
}
