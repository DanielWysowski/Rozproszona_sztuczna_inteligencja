import java.util.Scanner;
public class Main {

    public static void main(String args[]) {


        String tabG[] = new String[2];
        tabG[0] = "Dortmud";
        tabG[1] = "Frankfurt";

                    String tabF[] = new String[2];
                    tabF[0] = "Tuluza";
                    tabF[1] = "Lyon";

        String tabH[] = new String[2];
        tabH[0] = "Barcelona";
        tabH[1] = "Walencja";

                    String tabI[] = new String[2];
                    tabI[0] = "Limerick";
                    tabI[1] = " Cork";

        String tabN[] = new String[2];
        tabN[0] = "Bergen";
        tabN[1] = "Kristiansand";

                    String tabM[] = new String[2];
                    tabM[0] = " Marsaxlokk";
                    tabM[1] = "Mgarr";

        String tabW[] = new String[2];
        tabW[0] = "Neapol";
        tabW[1] = " Palermo";

            Panstwa tabCountry[] = new Panstwa[7];
            tabCountry[0] = new Panstwa("Grecja", "Ateny", tabG,  true);
            tabCountry[1] = new Panstwa("Francja", "Paryż", tabF,  true);
            tabCountry[2] = new Panstwa("Hiszpania", "  Granada", tabH,  true);
            tabCountry[3] = new Panstwa("Islandia", "   Rejkjavik", tabI, true);
            tabCountry[4] = new Panstwa("Norwegia", "  Oslo", tabN,  true);
            tabCountry[5] = new Panstwa("Malta", "  Valetta", tabM,  true);
            tabCountry[6] = new Panstwa(" Wlochy", "  Rzym", tabW, true);



            String tablica[][] = new String[4][tabCountry.length];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < tabCountry.length; j++) {
                    tablica[0][j] = tabCountry[j].podajNazwePanstwa();
                    tablica[1][j] = tabCountry[j].podajNazwePanstwa();
                    tablica[2][j] = tabCountry[j].podajMiasto()[0];
                    tablica[3][j] = tabCountry[j].podajMiasto()[1];
                }
            }



        System.out.println("     MIASTA-PAŃSTWA EUROPEJSKIE:");
        System.out.println("--------------------------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < tabCountry.length; j++) {
                System.out.print(tablica[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println();
        Scanner scanner= new Scanner(System.in);
        Uzytkownicy user = new Uzytkownicy();
        System.out.println("Podaj name, nazwisko i adres e-mail: ");
        user.imie = scanner.nextLine();
        user.nazwisko= scanner.nextLine();
        user.email= scanner.nextLine();
        Wymagania requirement= new Wymagania();
        requirement.ustawWymagania();
        System.out.println();
        Panstwa [] tablicaPanstw= new Panstwa[7];
        tablicaPanstw= requirement.proposeTown(tabCountry);


    }
}