import java.util.Scanner;

public class BibliotekaWypozyczalni {
    private ElementWypozyczalni elementWypozyczalni;

    public void dodajElement(Scanner scanner) {
        System.out.println("1. Dodaj Klienta");
        System.out.println("2. Dodaj Produkt");
        int wybor = scanner.nextInt();

        switch (wybor) {
            case 1:
                elementWypozyczalni = new Klient();
                break;
            case 2:
                elementWypozyczalni = new Produkt();
                break;
            default:
                System.out.println("Niepoprawny wybór");
                return;
        }

        inicjalizujElement(elementWypozyczalni);
        ElementWypozyczalni.dodajElement(elementWypozyczalni);
    }

    public void usunElement(Scanner scanner) {
        System.out.println("Podaj ID elementu do usunięcia: ");
        int id = scanner.nextInt();

        ElementWypozyczalni.usunElement(findElementById(id));
    }

    public void sortujElementy() {
        ElementWypozyczalni.sortujElementy();
        System.out.println("Elementy posortowane.");
    }

    private ElementWypozyczalni findElementById(int id) {
        for (ElementWypozyczalni element : ElementWypozyczalni.listaElementow) {
            if (element.id == id) {
                return element;
            }
        }
        return null;
    }

    private void inicjalizujElement(ElementWypozyczalni element) {
        // Inicjalizacja pól elementu
        element.waliduj();
    }

}
