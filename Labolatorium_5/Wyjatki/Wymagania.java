import java.util.Scanner;


public class Wymagania {

    private int liczbaUczestnikow;
    private int liczbaDni;
    private boolean dostepDoMorza;
    private double budget;

    public void ustawWymagania() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("WYPEŁNIJ FORMULARZ:  ");
        System.out.println("------------------------------------");
        System.out.println("LICZBA PASAŻERÓW: ");
        liczbaUczestnikow = scanner.nextInt();
        System.out.println("LICZBA DNI: ");
        liczbaDni = scanner.nextInt();
        System.out.println("TWÓJ BUDŻET: ");
        budget = scanner.nextDouble();
        System.out.println("DOSTĘP DO MORZA (true/false): ");
        dostepDoMorza = scanner.nextBoolean();

    }




    public Panstwa[] proposeTown(Panstwa[] tablica) {
        Panstwa[] tabC = new Panstwa[7];
        for (int i = 0; i < 7; i++) {
            if (tablica[i].podajCeneZaDzien() * liczbaDni * liczbaUczestnikow <= budget) {
                tabC[i] = tablica[i];
                System.out.println("Koszt wyjazdu do: " + tablica[i].podajNazwePanstwa() + " wyniesie: " +
                        tablica[i].podajCeneZaDzien() * liczbaDni * liczbaUczestnikow + "zł.");
            } else {
                System.out.println("Niestety nie stać Cię na: " + tablica[i].podajNazwePanstwa() +
                        ". Braknie Ci: " + ((tablica[i].podajCeneZaDzien() * liczbaDni * liczbaUczestnikow)-budget) + "zł.");
            }
        }
        return tabC;
    }


}