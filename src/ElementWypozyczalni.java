import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

abstract class ElementWypozyczalni implements Walidowalny {
    protected static List<ElementWypozyczalni> listaElementow = new ArrayList<>();
    protected int id;

    public static void dodajElement(ElementWypozyczalni element) {
        listaElementow.add(element);
    }

    public static void usunElement(ElementWypozyczalni element) {
        listaElementow.remove(element);
    }

    public static void sortujElementy() {
        listaElementow.sort(Comparator.comparingInt(o -> o.id));
    }

    @Override
    public abstract void waliduj() throws IllegalArgumentException;

    public static void inicjalizujPrzyklady() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                dodajElement(new Klient());
            } else {
                dodajElement(new Produkt());
            }
        }
    }
}
