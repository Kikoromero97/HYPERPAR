package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividirFactorialTest {

    @Test
    void divisio1() {
        DividirFactorial divid = new DividirFactorial(7,6);
        double resultadoEsperado = divid.divisio();
        assertEquals(7, resultadoEsperado);
    }

    @Test
    void divisio2() {
        DividirFactorial divid = new DividirFactorial(4,6);
        double resultadoEsperado = divid.divisio();
        assertEquals(1, resultadoEsperado);
    }
    @Test
    void divisio3() {
        DividirFactorial divid = new DividirFactorial(10,5);
        double resultadoEsperado = divid.divisio();
        assertEquals(30240, resultadoEsperado);
    }
    @Test
    void divisio4() {
        DividirFactorial divid = new DividirFactorial(0,5);
        double resultadoEsperado = divid.divisio();
        assertEquals(1, resultadoEsperado);
    }

    @Test
    void divisio5() {
        DividirFactorial divid = new DividirFactorial(0,0);
        double resultadoEsperado = divid.divisio();
        assertEquals(1, resultadoEsperado);
    }
    @Test
    void divisio6() {
        DividirFactorial divid = new DividirFactorial(10,0);
        double resultadoEsperado = divid.divisio();
        assertEquals(3628800, resultadoEsperado);
    }
}