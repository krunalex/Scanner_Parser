public class Fahrzeug {

    private int nummer;
    private int ps;
    private int anzahlraeder;

    public Fahrzeug(int nummer, int ps, int anzahlraeder){
        this.nummer = nummer;
        this.ps = ps;
        this.anzahlraeder = anzahlraeder;
    }

    public int getNummer() {
        return nummer;
    }

    public int getPs() {
        return ps;
    }

    public int getAnzahlraeder() {
        return anzahlraeder;
    }
}
