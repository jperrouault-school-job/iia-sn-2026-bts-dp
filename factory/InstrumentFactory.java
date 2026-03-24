public class InstrumentFactory {
    private InstrumentFactory() { }

    public static Guitare creerGuitare(boolean ukulele) {
        if (ukulele) {
            return new Ukulele();
        }

        return new Guitare();
    }
}
