public class wyswietlKsiazka {
    // Wysietla wszystkie książki
    public static void displayksiazka() {
        for (Book book : Ksiazki.ksiazka) {
            book.displayBookInformation();
        }
    }
    // Wyswietla ksiazki dostępne
    public static void displayDostepneKsiazki() {
        System.out.println("Oto książki dostępne do wpyżyczenia: ");
        for (Book book : Ksiazki.ksiazka) {
            if (book.isStatus()) {
                book.displayBookInformation();
            }
        }
    }
    // Wyswietla ksiazki wypożyczone
    public static void displayWypozyczoneKsiazki() {
        System.out.println("Oto książki wypożyczone: ");
        for (Book book : Ksiazki.ksiazka) {
            if (!book.isStatus()) {
                book.displayBookInformation();
            }
        }
    }
}
