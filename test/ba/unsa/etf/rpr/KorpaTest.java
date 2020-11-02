package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    private Korpa korpa;

    @BeforeEach
    void kreirajKorpu() {
        korpa = new Korpa();

    }


    @Test
    void dodajArtikl() {
        boolean rezultat = korpa.dodajArtikl(new Artikl("Artikl1", 12, "12345"));
        assertTrue(rezultat);
    }

    @Test
    void izbaciArtiklSaKodom() {
        korpa.dodajArtikl(new Artikl("Artikl1", 11, "4321"));
        Artikl a = korpa.izbaciArtiklSaKodom("4321");
        assertNotNull(a);
    }

   /* @Test
    void izbaciArtiklSaKodom2() {
        Artikl a = new Artikl("ArtiklX", 15, "abc");
        korpa.dodajArtikl(a);
        Artikl b = korpa.izbaciArtiklSaKodom("abc");
        assertEquals(a, b);
    }*/

    @Test
    void izbaciArtiklSaKodom3() {
        korpa.dodajArtikl(new Artikl("ArtiklY", 25, "bcde"));
        Artikl a = korpa.izbaciArtiklSaKodom("bbb");
        assertNull(a);
    }

    @Test
    void dodajArtikl2() {
        for (int i = 0; i < 50; i++) {
            korpa.dodajArtikl(new Artikl("Artikl" + i + 1, 20 + i, "abc" + i));
        }
        boolean rez = korpa.dodajArtikl(new Artikl("novi", 11, "cde"));
        assertFalse(rez);
    }

    @Test
    void getArtikli() {


    }

    @Test
    void dajUkupnuCijenuArtikala() {
        korpa.dodajArtikl(new Artikl("Prvi", 11, "abc"));
        korpa.dodajArtikl(new Artikl("Drugi", 13, "bcd"));
        korpa.dodajArtikl(new Artikl("Treci", 14, "sss"));
        int cijena = korpa.dajUkupnuCijenuArtikala();
        assertEquals(38, cijena);

    }


}