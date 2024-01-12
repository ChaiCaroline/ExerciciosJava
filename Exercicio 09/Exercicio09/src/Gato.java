public class Gato extends Animal {
    private String nomeDoGato;

    @Override
    void emitirSom(String animal, String som) {
        this.nomeDoGato = animal;

        System.out.println("Gato " + nomeDoGato + " fez " + som);
    }

    @Override
    void moverAnimal() {
        System.out.println("Gato se moveu");
    }

}
