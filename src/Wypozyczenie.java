import java.util.Date;

public class Wypozyczenie {
    private int idWypozyczenia;
    private int idKlienta;
    private int idProduktu;
    private Date dataWypozyczenia;
    private Date dataZwrotu;

    public void setDataWypozyczenia(Date dataWypozyczenia) {
        Date aktualnaData = new Date();
        if (dataWypozyczenia.before(aktualnaData)) {
            throw new IllegalArgumentException("Data wypożyczenia nie może być wcześniejsza niż aktualna data.");
        }
        this.dataWypozyczenia = dataWypozyczenia;
    }

    public void setDataZwrotu(Date dataZwrotu) {
        if (dataZwrotu.after(dataWypozyczenia)) {
            this.dataZwrotu = dataZwrotu;
        } else {
            throw new IllegalArgumentException("Data zwrotu musi być późniejsza niż data wypożyczenia.");
        }
    }

    public Wypozyczenie(int idWypozyczenia, int idKlienta, int idProduktu, Date dataWypozyczenia, Date dataZwrotu) {
        this.idWypozyczenia = idWypozyczenia;
        this.idKlienta = idKlienta;
        this.idProduktu = idProduktu;
        this.dataWypozyczenia = dataWypozyczenia;
        this.dataZwrotu = dataZwrotu;
    }

    public int getIdWypozyczenia() {
        return idWypozyczenia;
    }

    public void setIdWypozyczenia(int idWypozyczenia) {
        this.idWypozyczenia = idWypozyczenia;
    }

    public int getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(int idKlienta) {
        this.idKlienta = idKlienta;
    }

    public int getIdProduktu() {
        return idProduktu;
    }

    public void setIdProduktu(int idProduktu) {
        this.idProduktu = idProduktu;
    }

    public Date getDataWypozyczenia() {
        return dataWypozyczenia;
    }

    public Date getDataZwrotu() {
        return dataZwrotu;
    }

}
