package Java_Basics.OOP;

abstract class Voertuig {

    private String merk;
    private String kleur;

    protected int snelheid;

    public Voertuig(String merk, String kleur) {
        this.merk = merk;
        this.kleur = kleur;
    }

    void rijden(){};

    void remmen() {}

    @Override
    public String toString() {
        return "Voertuig{" +
                "merk='" + merk + '\'' +
                ", kleur='" + kleur + '\'' +
                ", snelheid=" + snelheid +
                '}';
    }

    public String getMerk() {
        return merk;
    }

    public String getKleur() {
        return kleur;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }
}

