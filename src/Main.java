

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //wyswietlenie menu
        while(true)
        {
            System.out.println("Witamy w bibliotece. Co chciałbyś(a) zrobić?");

            System.out.println("1: Wyswietl liste książek ");
            System.out.println("2: Dodaj książke do listy ");
            System.out.println("3: Zmien status książki  ");
            System.out.println("4: Pokaż liste wypożyczonych książek  ");
            System.out.println("5: Pokaż liste dostępnych książek  ");


            //Pobranie numeru z klawiatury i wybranie konkretnej opcji
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();



            switch (number)
            {
                case 1 -> wyswietlKsiazka.displayksiazka();

                case 2 -> Ksiazki.addKsiazki();

                case 3 -> changeStatus.changeBookStatus();

                case 4 -> wyswietlKsiazka.displayWypozyczoneKsiazki();

                case 5 -> wyswietlKsiazka.displayDostepneKsiazki();

            }
        }


    }

}
