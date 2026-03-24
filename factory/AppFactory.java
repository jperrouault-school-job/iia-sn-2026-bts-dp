public class AppFactory {
    public static void main(String[] args) {
        Guitariste g1 = MusicienFactory.creerGuitariste(false);
        Guitariste g2 = MusicienFactory.creerGuitariste(true);

        g1.jouer();
        g2.jouer();
    }
}
