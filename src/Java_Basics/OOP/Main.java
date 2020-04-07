package Java_Basics.OOP;

public class Main {


    public static void main(String[] args) {
        Auto auto = new Auto("Tesla", "Rood");


        auto.rijden();
        auto.remmen();
        //System.out.println(auto.snelheid);

        Auto zijnAuto = new Auto("Suzuki", "Grijs");
        zijnAuto.rijden();
        zijnAuto.rijden();
        zijnAuto.rijden();
        System.out.println(zijnAuto.snelheid);

        Vrachtwagen truck1 = new Vrachtwagen("Volvo", "Blauw");
        truck1.setLaadVermogen(1000);

        RaceAuto mijnTweedeAuto = new RaceAuto("Ferrari", "Rood");



    }
}
