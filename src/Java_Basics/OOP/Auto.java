package Java_Basics.OOP;

public class Auto extends Voertuig{

    public Auto(String merk, String kleur) {
    super(merk, kleur);
    }


    @Override
    public void rijden() {
        snelheid += 10;
    }
    @Override
    public void remmen() {
        snelheid -= 10;
    }
    }
