public class Book {
    // Pola przechowujące dane
    private String tytul;
    private String autor;
    private String gatunek;
    private boolean status;

    // Inicjalizacja pól
    public Book(String tytul, String autor, String gatunek, boolean status)
    {
        this.tytul = tytul;
        this.autor = autor;
        this.gatunek = gatunek;
        this.status = status;
    }
    // Zwracamy wartości poszczególnych pól
    public String getTytul()
    {
        return tytul;
    }

    public String getAutor()
    {
        return autor;
    }

    public String getGatunek()
    {
        return gatunek;
    }

    public boolean isStatus()
    {
        return status;
    }
    public void setStatus(boolean status)
    {
        this.status = status;
    }
    // Wszystko wyswietlamy
    public void displayBookInformation()
    {
        System.out.println();
        String statusString = status ? "Dostępna" : "Wypożyczona";
        System.out.println("Tytuł: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Gatunek: " + gatunek);
        System.out.println("Status: " + statusString);
        System.out.println();
    }
}
