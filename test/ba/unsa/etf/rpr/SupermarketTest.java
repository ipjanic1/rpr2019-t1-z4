package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    private Supermarket supermarket;
    @BeforeEach
    void Incijalizacija() {
        supermarket = new Supermarket();
    }

    @Test
    void izbaciArtiklSaKodom() {
        supermarket.dodajArtikl(new Artikl("Prvi", 12, "abc"));
        Artikl a = supermarket.izbaciArtiklSaKodom("abc");
        assertNotNull(a);
    }

    @Test
    void izbaciArtiklSaKodom2() {
        supermarket.dodajArtikl(new Artikl("Drugi", 11, "cde"));
        Artikl a = supermarket.izbaciArtiklSaKodom("abc");
        assertNull(a);
    }

    @Test
    void dodajArtikl() {
        boolean rez = supermarket.dodajArtikl(new Artikl("ArtiklX", 13, "xyz"));
        assertTrue(rez);
    }

    @Test
    void dodajArtikl2() {
        for (int i = 0; i < 200; i++) {
            supermarket.dodajArtikl(new Artikl("Artikl" + i, 20 + i, "abd" + i));
        }
        boolean rez = supermarket.dodajArtikl(new Artikl("Artikl", 12, "abc"));
        assertFalse(rez);
    }
}