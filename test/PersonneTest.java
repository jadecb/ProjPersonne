import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {
    Personne personne = new Personne("kilian","Michel", "point du jour","Lyon","69005");

    @org.junit.jupiter.api.Test
    void get_nom() {
    }

    @org.junit.jupiter.api.Test
    void get_prenom() {
    }

    @org.junit.jupiter.api.Test
    void get_adresse() {
    }

    @org.junit.jupiter.api.Test
    void get_ville() {
    }

    @org.junit.jupiter.api.Test
    void get_codePostal() {
    }
    @Test
    void testToString() {
        assertEquals("nom : kilian Prenom : Michel adresse: point du jour code postal: 69005 ",personne.toString());
    }
}