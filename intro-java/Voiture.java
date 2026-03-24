public class Voiture extends Vehicule implements Motorisable {
    public Voiture() {
        System.out.println("Fabrication d'une voiture");
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture démarre !");
    }

    @Override
    public String toString() {
        return "La superbe voiture";
    }
}
