package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyTest {

    @Test
    void digitsDiferents() {
        Any anyo = new Any(2023);
        int resultadoEsperado = anyo.digitsDiferents();
        assertEquals(3, resultadoEsperado);
    }
    @Test
    void digitsDiferents2() {
        Any anyo = new Any(2222);
        int resultadoEsperado = anyo.digitsDiferents();
        assertEquals(1, resultadoEsperado);
    }

    @Test
    void digitsDiferents3() {
        Any anyo = new Any(2134);
        int resultadoEsperado = anyo.digitsDiferents();
        assertEquals(4, resultadoEsperado);
    }

    @Test
    void digitsDiferents4() {
        Any anyo = new Any(2134);
        int resultadoEsperado = anyo.digitsDiferents();
        assertEquals(4, resultadoEsperado);
    }

    @Test
    void digitsDiferents5() {
        Any anyo = new Any(0);
        int resultadoEsperado = anyo.digitsDiferents();
        assertEquals(1, resultadoEsperado);
    }

    @Test
    void digitsDiferents6() {
        Any anyo = new Any(13332);
        int resultadoEsperado = anyo.digitsDiferents();
        assertEquals(3, resultadoEsperado);
    }
}