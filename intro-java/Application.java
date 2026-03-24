import java.util.ArrayList;
import java.util.List;

public class Application {
    // psvm ou main
    public static void main(String[] args) {
        // sout ou sysout
        System.out.println("Hello World!");

        // Vehicule v = new Voiture();
        // Object v = "test";

        // if (v instanceof Voiture) {
        //     ((Voiture)v).demarrer();
        // }

        Vehicule v = new Voiture();
        Vehicule m = new Moto();
        Vehicule velo = new Velo();
        List<Vehicule> vehicules = new ArrayList<>();

        vehicules.add(v);
        vehicules.add(m);
        vehicules.add(velo);

        for (Vehicule vehicule : vehicules) {
            // vehicule.demarrer();
            if (vehicule instanceof Motorisable) {
                Motorisable motorisable = (Motorisable)vehicule;
                motorisable.demarrer();
            }

            if (vehicule instanceof Inclinable) {
                Inclinable inclinable = (Inclinable)vehicule;
                inclinable.incliner();
            }
            // System.out.println(vehicule);
        }
    }
}
