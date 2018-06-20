import java.util.List;

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
    @AllArgsConstructor
    @NoArgsConstructor

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

    public void ustawaCenaZaDzien(double cenaZaDzien) {
        this.cenaZaDzien = cenaZaDzien;
    }

    public void ustawPoziomPopulacji(Double poziomPopulacji) {
    }

    public void ustawNazwe(String nazwa) {
    }

    public void ustawMiasta(List<Miasto> miasta) {
    }

    public void ustawPowierzchnie(Double powierzchnia) {
    }

    public void ustawStrefeCzasowa(String strefeCzasowa) {
    }

    public void ustawKlimat(String klimat) {
    }
}