public class App {
    public static void main(String[] args) throws Exception {

        Carro primeiroCarro = new Carro();
        String modeloDoPrimeiroCarro = primeiroCarro.getModelo();
        System.out.println(modeloDoPrimeiroCarro);
        primeiroCarro.alteracaoDaCor("preto");
        String corDefinida = primeiroCarro.getCor();
        System.out.println(corDefinida);
    }
}
