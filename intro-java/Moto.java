public class Moto extends Vehicule implements Motorisable, Inclinable {
    @Override
    public void demarrer() {
        System.out.println("La moto démarre : VROOM VROOM !!");
    }

    @Override
    public void incliner() {
        System.out.println("Le pilote penche la moto et met le genou sur le goudron !");
    }
}
