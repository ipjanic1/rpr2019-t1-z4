package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;

    Artikl (String naziv, int cijena, String kod) {
        this.naziv = naziv; this.cijena = cijena; this.kod = kod;
    }
    Artikl () { naziv = null; cijena = 0; kod = null;}

    Artikl (Artikl a) {
        this.naziv = a.getNaziv(); this.cijena = a.getCijena(); this.kod = getKod();
    }
    String getNaziv () { return naziv; }
    int getCijena () { return cijena; }
    String getKod () { return kod; }
}
