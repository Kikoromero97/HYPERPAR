package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {

    @Test
    void esHyperPar() {
        Hyperpar par = new Hyperpar(24680);
        boolean resultadoEsperado = par.esHyperPar();
        assertTrue(resultadoEsperado);
    }

    @Test
    void esHyperPar2() {
        Hyperpar par = new Hyperpar(0);
        boolean resultadoEsperado = par.esHyperPar();
        assertTrue(resultadoEsperado);
    }

    @Test
    void esHyperPar3() {
        Hyperpar par = new Hyperpar(46780);
        boolean resultadoEsperado = par.esHyperPar();
        assertFalse(resultadoEsperado);
    }

    @Test
    void esHyperPar4() {
        Hyperpar par = new Hyperpar(11123);
        boolean resultadoEsperado = par.esHyperPar();
        assertFalse(resultadoEsperado);
    }

    @Test
    void esHyperPar5() {
        Hyperpar par = new Hyperpar(200024403);
        boolean resultadoEsperado = par.esHyperPar();
        assertFalse(resultadoEsperado);
    }
}