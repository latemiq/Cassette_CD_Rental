import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            BibliotekaWypozyczalni biblioteka = new BibliotekaWypozyczalni();
            ElementWypozyczalni.inicjalizujPrzyklady();

            Scanner scanner = new Scanner(System.in);
            int wybor;

            do {
                System.out.println("1. Dodaj element");
                System.out.println("2. Usuń element");
                System.out.println("3. Sortuj elementy");
                System.out.println("0. Wyjście");
                System.out.print("Twój wybór: ");
                wybor = scanner.nextInt();

                switch (wybor) {
                    case 1:
                        biblioteka.dodajElement(scanner);
                        break;
                    case 2:
                        biblioteka.usunElement(scanner);
                        break;
                    case 3:
                        biblioteka.sortujElementy();
                        break;
                    case 0:
                        System.out.println("Do widzenia!");
                        break;
                    default:
                        System.out.println("Niepoprawny wybór");
                }
            } while (wybor != 0);
        }
    }

