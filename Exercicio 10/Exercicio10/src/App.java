public class App {
    public static void main(String[] args) throws Exception {
        FormaGeometricaNova quadrado = new Quadrado(10);
        Forma forma = new Forma();

        double resultado = forma.calcularArea((quadrado));

        // double resultado = quadrado.calcularArea();

        System.out.println(resultado);
    }
}
