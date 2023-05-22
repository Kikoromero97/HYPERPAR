package es.iesmz.ed.algoritmes;

/**
 * Esta clase compara si un número introducido y todos sus digitos (digito a digito) son pares.
 *
 * @author: Francisco Romero Gálvez
 * @version: 22/05/2023
 */

public class Hyperpar {
    private long numero = 0;

    /**
     * Constructor para pasar el número pedido.
     *
     * @param numero El parámetro define el número que se quiere comprobar si es par o no.
     */
    public Hyperpar(long numero) {
        this.numero = numero;
    }

    /**
     * Método que devuelve si los dígitos del número pasado son pares o impares.
     *
     * @return Devuelve false si alguno de los dígitos del número pasado son impares. Devuelve true si todos los dígitos son pares.
     */
    public boolean esHyperPar() {
        int contadorNoHyper = 0;
        String numeroStr = String.valueOf(numero);
        boolean esHyperPar = true;
        for (int i = 0; i < numeroStr.length(); i++) {
            if (numeroStr.charAt(i) % 2 != 0) {
                contadorNoHyper++;
            }
        }
        if (contadorNoHyper > 0) {
            esHyperPar = false;
        }
        return esHyperPar;
    }
}
