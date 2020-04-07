package Java_Basics.OOP;

public class Vrachtwagen extends Auto {

    private int laadVermogen;

    public Vrachtwagen(String merk, String kleur) {
        super(merk, kleur);
    }

    @Override
    public void rijden(){
        snelheid += 5;
    }

    @Override
    public void remmen(){
        snelheid -= 5;
    }


    public int getLaadVermogen() {
        return laadVermogen;
    }

    public void setLaadVermogen(int laadVermogen) {
        this.laadVermogen = laadVermogen;
    }
}
