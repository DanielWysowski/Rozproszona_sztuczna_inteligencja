import java.util.List;

public class KreatorPanstw {

    private Panstwa panstwa;

    public KreatorPanstw() {
        panstwa = new Panstwa();
    }

    public KreatorPanstw accessToTheSea(boolean dostepDoMorza) {
        panstwa.ustawDostepDoMorza(dostepDoMorza);
        return this;
    }

    public KreatorPanstw climate(String klimat) {
        panstwa.ustawKlimat(klimat);
        return this;
    }

    public KreatorPanstw timeZone(String strefeCzasowa) {
        panstwa.ustawStrefeCzasowa(strefeCzasowa);
        return this;
    }

    public KreatorPanstw cities(List<Miasto> Miasta) {
        panstwa.ustawMiasta(Miasta);
        return this;
    }

    public KreatorPanstw name(String nazwa) {
        panstwa.ustawNazwe(nazwa);
        return this;
    }

    public KreatorPanstw priceForDay(Double cenaZaDzien) {
        panstwa.ustawaCenaZaDzien(cenaZaDzien);
        return this;
    }

    public KreatorPanstw levelOfPopulation(Double poziomPopulacji) {
        panstwa.ustawPoziomPopulacji(poziomPopulacji);
        return this;
    }

    public KreatorPanstw surface(Double surface) {
        panstwa.ustawPowierzchnie(surface);
        return this;
    }

    public Panstwa build() {
        return panstwa;
    }
}