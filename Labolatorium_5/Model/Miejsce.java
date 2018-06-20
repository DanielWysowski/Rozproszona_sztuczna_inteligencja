import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public abstract class Miejsce{

    protected String name;
    protected Double priceForDay;
    protected Double levelOfPopulation;
    protected Double surface;


    public String getName() {
        return name;
    }

    public Miejsce name(String name) {
        this.name = name;
        return this;
    }

    public Double getPriceForDay(Miejsce miejsce) {

        return priceForDay;
    }

    public Miejsce priceForDay(Double priceForDay) {
        this.priceForDay = priceForDay;
        return this;
    }

    public Double getLevelOfPopulation() {
        return levelOfPopulation;
    }

    public Miejsce levelOfPopulation(Double levelOfPopulation) {
        this.levelOfPopulation = levelOfPopulation;
        return this;
    }

    public Double getSurface() {
        return surface;
    }

    public Miejsce surface(Double surface) {
        this.surface = surface;
        return this;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceForDay(Double priceForDay) {
        this.priceForDay = priceForDay;
    }

    public void ustawPoziom(Double levelOfPopulation) {
        this.levelOfPopulation = levelOfPopulation;
    }

    public void podajPowierzchnie(Double surface) {
        this.surface = surface;
    }



