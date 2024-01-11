public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo(5);

        System.out.println(circulo.getRaio());
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());
    }
}
