import java.util.regex.Pattern;

public class Produkt extends ElementWypozyczalni {
    private int idProduktu;
    private String tytul;
    private String wykonawca;
    private int rokWydania;
    private String gatunek;
    private boolean dostepnosc;

    public Produkt() {
        this.idProduktu = idProduktu;
        this.tytul = tytul;
        this.wykonawca = wykonawca;
        this.rokWydania = rokWydania;
        this.gatunek = gatunek;
        this.dostepnosc = dostepnosc;
    }
    public void setTytul(String tytul) {
        if (isValidTytul(tytul)) {
            this.tytul = tytul;
        } else {
            throw new IllegalArgumentException("Tytuł nie może zawierać cyfr ani znaków specjalnych.");
        }
    }

    public void setRokWydania(int rokWydania) {
        if (rokWydania > 0) {
            this.rokWydania = rokWydania;
        } else {
            throw new IllegalArgumentException("Rok wydania musi być liczbą dodatnią.");
        }
    }

    public int getIdProduktu() {
        return idProduktu;
    }

    public void setIdProduktu(int idProduktu) {
        this.idProduktu = idProduktu;
    }

    public String getTytul() {
        return tytul;
    }

    public String getWykonawca() {
        return wykonawca;
    }

    public void setWykonawca(String wykonawca) {
        this.wykonawca = wykonawca;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public boolean isDostepnosc() {
        return dostepnosc;
    }

    public void setDostepnosc(boolean dostepnosc) {
        this.dostepnosc = dostepnosc;
    }
    private boolean isValidTytul(String tytul) {
        return Pattern.matches("[a-zA-Z]+", tytul);
    }

    @Override
    public void waliduj() throws IllegalArgumentException {

    }
}
