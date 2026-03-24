public class MusicienFactory {
    private MusicienFactory() { }

    public static Guitariste creerGuitariste(boolean ukulele) {
        Guitariste guitariste = new Guitariste();

        guitariste.setInstrument(InstrumentFactory.creerGuitare(ukulele));

        return guitariste;
    }
}
