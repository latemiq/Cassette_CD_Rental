import java.util.regex.Pattern;

public class Klient extends ElementWypozyczalni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String adres;
    private String numerTelefonu;

    public void setImie(String imie) {
        if (isValidImie(imie)) {
            this.imie = imie;
        } else {
            throw new IllegalArgumentException("Imię nie może zawierać cyfr ani znaków specjalnych.");
        }
    }

    public void setNumerTelefonu(String numerTelefonu) {
        if (isValidNumerTelefonu(numerTelefonu)) {
            this.numerTelefonu = numerTelefonu;
        } else {
            throw new IllegalArgumentException("Numer telefonu musi być w formacie xxx-xxx-xxxx.");
        }
    }

    public int getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(int idKlienta) {
        this.idKlienta = idKlienta;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }
    private boolean isValidImie(String imie) {
        return Pattern.matches("[a-zA-Z]+", imie);
    }

    private boolean isValidNumerTelefonu(String numerTelefonu) {
        return Pattern.matches("\\d{3}-\\d{3}-\\d{4}", numerTelefonu);
    }

    @Override
    public void waliduj() throws IllegalArgumentException {

    }
}
