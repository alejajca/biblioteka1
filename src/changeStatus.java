
import java.util.Scanner;
public class changeStatus {
    public static void changeBookStatus()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tytuł książki:");
        String tytul = scanner.nextLine();

        // Szukamy ksiazki z listy po jej nazwie i zmieniamy status
        for (Book book : Ksiazki.ksiazka)
        {
            if (book.getTytul().equalsIgnoreCase(tytul))
            {
                String statusString;
                boolean validStatus = false;

                do
                {
                    System.out.println("Wybierz nowy status (W - wypożyczony, D - dostępny):");
                    statusString = scanner.nextLine().toLowerCase();

                    if (statusString.equals("w"))
                    {
                        book.setStatus(false);
                        System.out.println("Status książki " + tytul + " został zmieniony na wypożyczony.");
                        validStatus = true;
                    }
                    else if (statusString.equals("d"))
                    {
                        book.setStatus(true);
                        System.out.println("Status książki " + tytul + " został zmieniony na dostępny.");
                        validStatus = true;
                    }
                    else
                    {
                        System.out.println("Nieprawidłowy status, wybierz jeszcze raz.");
                    }
                }
                while (!validStatus);

                return;
            }
        }

        System.out.println("Książka o podanym tytule nie została znaleziona.");
    }
}
