public class Circulo {
    private double raio;

    public Circulo(double valorRaio) {
        this.raio = valorRaio;
    }

    public double calcularArea() {
        double calculoDaArea = Math.PI * Math.pow(raio, 2);
        return calculoDaArea;
    }

    public double calcularPerimetro() {
        double calcularPerimetro = 2 * Math.PI * raio;
        return calcularPerimetro;
    }

    public double getRaio() {
        return raio;
    }

    // porém dessa maneira abaixo, estava repetindo o valorRaio e posso fazer
    // construtor e depois do chamar a função quando quiser calcular
    /*
     * public double calcularArea(double valorRaio) {
     * this.raio = valorRaio;
     * 
     * double calculoDaArea = 3.14 * Math.pow(valorRaio, 2);
     * 
     * return calculoDaArea;
     * }
     * 
     * public double calcularPerimetro(double valorRaio) {
     * this.raio = valorRaio;
     * 
     * double calcularPerimetro = 2 * 3.14 * valorRaio;
     * 
     * return calcularPerimetro;
     * }
     */

}
