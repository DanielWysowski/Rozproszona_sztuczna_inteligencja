
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class PotwierdzanieDanych implements Print{

    public static HashMap<String, List<Miasto>> prepareCityData() {
        HashMap<String, List<Miasto>> countryCity = new HashMap<>();


        List<Miasto> citiesM = new ArrayList<>();
        List<Miasto> citiesW = new ArrayList<>();
        List<Miasto> citiesN = new ArrayList<>();
        List<Miasto> citiesI = new ArrayList<>();
        List<Miasto> citiesH = new ArrayList<>();
        List<Miasto> citiesF = new ArrayList<>();
        List<Miasto> citiesNi = new ArrayList<>();

        Miasto city = Miasto.builder()
                .name("Valetta")
                .priceForDay(200.0)
                .surface(105.0)
                .levelOfPopulation(34.0)
                .additionalInformation("capital")
                .build();

        Miasto city1 = Miasto.builder()
                .name("Marsaxlokk")
                .priceForDay(200.0)
                .surface(55.0)
                .levelOfPopulation(34.0)
                .build();

        citiesM.add(city);
        citiesM.add(city1);
        countryCity.put("Malta", citiesM);

        Miasto city2 = Miasto.builder()
                .name("Dublin")
                .priceForDay(200.0)
                .surface(105.0)
                .levelOfPopulation(34.0)
                .additionalInformation("capital")
                .build();

        Miasto city3 = Miasto.builder()
                .name("Limerick")
                .priceForDay(200.0)
                .surface(55.0)
                .levelOfPopulation(34.0)
                .build();

        citiesI.add(city2);
        citiesI.add(city3);
        countryCity.put("Irlandia", citiesI);

        Miasto city4 = Miasto.builder()
                .name("Oslo")
                .priceForDay(200.0)
                .surface(105.0)
                .levelOfPopulation(34.0)
                .additionalInformation("capital")
                .build();

        Miasto city5 = Miasto.builder()
                .name("Bergen")
                .priceForDay(200.0)
                .surface(55.0)
                .levelOfPopulation(34.0)
                .build();

        citiesN.add(city4);
        citiesN.add(city5);
        countryCity.put("Norwegia", citiesN);

        Miasto city6 = Miasto.builder()
                .name("Neapol")
                .priceForDay(200.0)
                .surface(105.0)
                .levelOfPopulation(34.0)
                .build();

        Miasto city7 = Miasto.builder()
                .name("Rzym")
                .priceForDay(200.0)
                .surface(55.0)
                .levelOfPopulation(388.0)
                .build();

        citiesW.add(city6);
        citiesW.add(city7);
        countryCity.put("Włochy", citiesW);

        Miasto city8 = Miasto.builder()
                .name("Paryż")
                .priceForDay(200.0)
                .surface(105.0)
                .levelOfPopulation(34.0)
                .additionalInformation("capital")
                .build();

        Miasto city9 = Miasto.builder()
                .name("Tuluza")
                .priceForDay(200.0)
                .surface(55.0)
                .levelOfPopulation(34.0)
                .build();

        citiesF.add(city8);
        citiesF.add(city9);
        countryCity.put("Francja", citiesF);

        Miasto city10 = Miasto.builder()
                .name("Berlin")
                .priceForDay(376.0)
                .surface(109005.0)
                .levelOfPopulation(34000000.0)
                .additionalInformation("capital")
                .build();

        Miasto city11 = Miasto.builder()
                .name("Dortmund")
                .priceForDay(200.0)
                .surface(55.0)
                .levelOfPopulation(34.0)
                .build();

        citiesNi.add(city10);
        citiesNi.add(city11);
        countryCity.put("Niemcy", citiesNi);

        Miasto city12 = Miasto.builder()
                .name("Madryt")
                .priceForDay(200.0)
                .surface(105.0)
                .levelOfPopulation(34.0)
                .additionalInformation("capital")
                .build();

        Miasto city13 = Miasto.builder()
                .name("Barcelona")
                .priceForDay(200.0)
                .surface(55.0)
                .levelOfPopulation(34.0)
                .build();

        citiesH.add(city12);
        citiesH.add(city13);
        countryCity.put("Hiszpania", citiesH);



        return countryCity;
    }


    public static List<Panstwa> prepareCountryData() {
        List<Panstwa> countries = new ArrayList<>();

        Panstwa country = Panstwa.builder()
                .name("Włochy")
                .priceForDay(587.0)
                .levelOfPopulation(877.0)
                .surface(876.0)
                .accessToTheSea(true)
                .cities(findCities("Włochy"))
                .build();
        Panstwa country1 = Panstwa.builder()
                .name("Malta")
                .priceForDay(987.0)
                .levelOfPopulation(877.0)
                .surface(876.0)
                .accessToTheSea(true)
                .cities(findCities("Malta"))
                .build();
        Panstwa country2 = Panstwa.builder()
                .name("Norwegia")
                .priceForDay(387.0)
                .levelOfPopulation(877.0)
                .surface(876.0)
                .accessToTheSea(true)
                .cities(findCities("Norwegia"))
                .build();
        Panstwa country3 = Panstwa.builder()
                .name("Irlanda")
                .priceForDay(987.0)
                .levelOfPopulation(877.0)
                .surface(876.0)
                .accessToTheSea(true)
                .cities(findCities("Irlandia"))
                .build();
        Panstwa country4 = Panstwa.builder()
                .name("Hiszpania")
                .priceForDay(787.0)
                .levelOfPopulation(877.0)
                .surface(876.0)
                .accessToTheSea(true)
                .cities(findCities("Hiszpania"))
                .build();
        Panstwa country5 = Panstwa.builder()
                .name("Francja")
                .priceForDay(987.0)
                .levelOfPopulation(877.0)
                .surface(876.0)
                .accessToTheSea(true)
                .cities(findCities("Francja"))
                .build();
        Panstwa country6 = Panstwa.builder()
                .name("Niemcy")
                .priceForDay(10087.0)
                .levelOfPopulation(877009900.0)
                .surface(87600009.0)
                .accessToTheSea(true)
                .cities(findCities("Niemcy"))
                .timeZone("UTC + 01:00")
                .climate("umiarkowany z chłodnymi, pochmurnymi i mokrymi zimami i latami")
                .build();


        countries.add(country);
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);
        countries.add(country5);
        countries.add(country6);


        return countries;
    }



    public static List<Miasto> findCities(String countryName){
        for(String key: prepareCityData().keySet()){
            if(key.equals(countryName)){
                return prepareCityData().get(key);
            }
        }
        System.err.println("Magda znowu popsulas");
        return null;
    }

//    public Country findCountry(String countryName){
//        for(Country country: prep){
//            if(country.name.equals(countryName))
//                return country;
//        }
//        System.err.print("!!!");
//        return null;
//    }


    @Override
    public void print() {


    }
}