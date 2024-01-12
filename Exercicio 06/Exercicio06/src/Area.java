public class Area extends FormaGeometrica {

    @Override
    public int calcularArea(int base, int altura) {
        return base * altura;
    }

    @Override
    public int calcularPerimetro(int base, int altura) {
        int resultado1 = 2 * base;
        int resultado2 = 2 * altura;

        return resultado1 + resultado2;
    }

}
