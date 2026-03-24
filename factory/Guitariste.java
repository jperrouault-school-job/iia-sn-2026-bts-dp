public class Guitariste {
    // private Guitare instrument = new Guitare();
    private Guitare instrument;

    public void setInstrument(Guitare instrument) {
        this.instrument = instrument;
    }

    public void jouer() {
        System.out.println("Le guitariste joue : " + this.instrument.melodie());
    }
}
