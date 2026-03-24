public class Guitariste {
    private Guitare instrument = new Guitare();

    public void jouer() {
        System.out.println("Le guitariste joue : " + this.instrument.melodie());
    }
}
