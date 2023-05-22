package es.iesmz.ed.algoritmes;

public class DividirFactorial {
    private final int numerador;
    private final int denominador;

    public DividirFactorial(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public double divisio() {
        double resultado = 1;
        for (int i = denominador + 1; i <= numerador; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
