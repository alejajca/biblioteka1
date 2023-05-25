import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ksiazki {
    //Stworzenie listy ksiazka oraz skanera
    static List<Book> ksiazka = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    //Dodanie początkowych książek do listy ksiazka

    static
    {
        ksiazka.add(new Book("Powrót do domu", "Kristin Hannah", "Literatura obyczajowa", false));
        ksiazka.add(new Book("Langer", "Remigiusz Mróz", "Kryminał", true));
        ksiazka.add(new Book("Medusa czyli 23 kilometry do...", "Salomon Adrian", "Komedia", false));
        ksiazka.add(new Book("1984", "George Orwell", "Fantastyka naukowa", false));
        ksiazka.add(new Book("Kod Leonarda da Vinci", "Dan Brown", "GKryminał", true));
        ksiazka.add(new Book("Harry Potter 1", "J.K. Rowling", "Fantazy", false));
        ksiazka.add(new Book("Pieśń lodu i ognia", "GGeorge R.R. Martin", "Fantazy", false));
        ksiazka.add(new Book("Sherlock Holmes", "Arthur Conan Doyle", "Kryminał", true));
        ksiazka.add(new Book("Najbardziej niebieskie oko", "T. Morrison", "Romans", false));
    }

    // Wprowadzenie danych ksążki oraz dodanie jej do listy ksiazka
    public static void addKsiazki()
    {
        System.out.println("Podaj tytuł:");
        String tytul = scanner.nextLine();

        System.out.println("Podaj autora:");
        String autor = scanner.nextLine();

        System.out.println("Podaj gatunek:");
        String gatunek = scanner.nextLine();

        // Wprowadzanie statusu (dostępna lub wypożyczona)

        boolean status = false;
        boolean validStatusInput = false;

        do
        {
            System.out.println("Podaj status: naciśnij 'w' jeśli książka jest wypożyczona lub 'd' jeśli jest dostępna");
            String statusString = scanner.nextLine();

            if (statusString.equals("w"))
            {
                status = false;
                validStatusInput = true;
            }
            else if (statusString.equals("d"))
            {
                status = true;
                validStatusInput = true;
            }
            else
            {
                System.out.println("Nieprawidłowy status! Wybierz 'w' dla wypożyczonej książki lub 'd' dla dostępnej.");
            }
        }
        while (!validStatusInput);
        // Tworzenie obiektu Book na podstawie wprowadzonych danych i dodanie go do listy ksiazka

        Book book = new Book(tytul, autor, gatunek, status);
        ksiazka.add(book);
    }



    }

