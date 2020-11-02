package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli;
    private int broj_artikala;


    Korpa() {
        artikli = new Artikl[50];
        broj_artikala = 0;
    }

    int dajBrojArtikala() {
        return broj_artikala;
    }

    boolean dodajArtikl(Artikl a) {
        if (broj_artikala < 50) {
            artikli[broj_artikala] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            broj_artikala = broj_artikala + 1;
            return true;
        }
        return false;
    }

    Artikl izbaciArtiklSaKodom (String kod){
        for (int i = 0; i < broj_artikala; i++) {
            if (artikli[i].getKod().equals(kod)) {
                Artikl pomocni = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                
                if (broj_artikala > 1 && i != broj_artikala - 1) {
                    artikli[i] = new Artikl(artikli[broj_artikala - 1].getNaziv(), artikli[broj_artikala - 1].getCijena(), artikli[broj_artikala - 1].getKod());
                    artikli[broj_artikala] = null;
                }

                broj_artikala = broj_artikala - 1;
                return pomocni;
            }
        }
        return null;
    }

    Artikl[] getArtikli() {
        Artikl[] svi = new Artikl[broj_artikala];
        for (int i = 0; i < broj_artikala; i++) {
            svi[i] = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
        }
        return svi;
    }

    int dajUkupnuCijenuArtikala() {
        int cijena = 0;
        for (int i = 0; i < broj_artikala; i++) {
            cijena = cijena + artikli[i].getCijena();
        }
        return cijena;
    }
}
