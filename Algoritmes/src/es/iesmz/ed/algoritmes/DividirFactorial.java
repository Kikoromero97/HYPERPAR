package es.iesmz.ed.algoritmes;
/**
 * Esta clase obtiene el resultado de la división de dos factoriales.
 *
 * @author: Francisco Romero Gálvez
 * @version: 22/05/2023
 */
public class DividirFactorial {
    private final int numerador;
    private final int denominador;

    /**
     * Constructor para pasar el numerador y el denominador.
     *
     * @param numerador El parámetro define el número de arriba de la división (numerador).
     * @param denominador El parámetro define el número de abajo de la división (denominador).
     */
    public DividirFactorial(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Método que hace el factorial del numerador y del denominador.
     * @return Devuelve el resultado de los factoriales.
     */
    public long divisio() {
        long resultado = 1;
        for (int i = denominador + 1; i <= numerador; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
