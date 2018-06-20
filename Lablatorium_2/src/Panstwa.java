public class Panstwa {


    protected String nazwaPanstwa;
    protected String nazwaStolicy;
    protected String Miasto [] = new String[2];
    protected boolean dostepDoMorza;
    protected double cenaZaDzien;

    public Panstwa(String nazwaPanstwa, String nazwaStolicy, String[] miasto, boolean dostepDoMorza) {
        this.nazwaPanstwa = this.nazwaPanstwa;
        this.nazwaStolicy = this.nazwaStolicy;
        Miasto = miasto;
        this.dostepDoMorza = dostepDoMorza;
    }


    public String podajNazwePanstwa() {
        return nazwaPanstwa;
    }

    public void ustawNazwePanstwa(String nazwaPanstwa) {
        this.nazwaPanstwa = nazwaPanstwa;
    }

    public String podajNazweStolicy() {
        return nazwaStolicy;
    }

    public void setNazwaStolicy(String nazwaStolicy) {
        this.nazwaStolicy = nazwaStolicy;
    }

    public String[] podajMiasto() {
        return Miasto;
    }

    public void ustawaMiasto(String[] miasto) {
        Miasto = miasto;
    }


    public boolean czyJestDostepDoMorza() {
        return dostepDoMorza;
    }

    public void ustawDostepDoMorza(boolean dostepDoMorza) {
        this.dostepDoMorza = dostepDoMorza;
    }
    public double podajCeneZaDzien() {
        return cenaZaDzien;
    }

    public void setPriceForDay(double cenaZaDzien) {
        this.cenaZaDzien = cenaZaDzien;
    }

}