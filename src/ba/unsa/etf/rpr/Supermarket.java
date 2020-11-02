package ba.unsa.etf.rpr;

public class Supermarket {

    private Artikl[] artikli;
    private int broj_artikala;

    Supermarket () {
        artikli = new Artikl[200];
        broj_artikala = 0;
    }

    int getBrojArtikala() {
        return broj_artikala;
    }

    Artikl izbaciArtiklSaKodom (String kod){
        for (int i = 0; i < broj_artikala; i++) {
            if (artikli[i].getKod().equals(kod)) {
                Artikl pomocni = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                artikli[i] = null;
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
    public Artikl[] getArtikli() {
        Artikl[] svi = new Artikl[broj_artikala];
        System.out.println("Broj artikala je " + broj_artikala);

        for (int i = 0; i < broj_artikala; i++) {
            svi[i] = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
        }
        return svi;
    }

    boolean dodajArtikl(Artikl a) {
        if (broj_artikala < 200) {
            artikli[broj_artikala] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            broj_artikala = broj_artikala + 1;
            return true;
        }
        return false;
    }
}
