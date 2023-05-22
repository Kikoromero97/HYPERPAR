package es.iesmz.ed.algoritmes;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase comprueba cuántos digitos diferentes hay en un número.
 *
 * @author: Francisco Romero Gálvez
 * @version: 22/05/2023
 */


public class Any {
    private final long numero;

    /**
     * Constructor para pasar el año pedido.
     *
     * @param numero El parámetro define el año que se va a comprobar.
     */
    public Any(long numero) {
        this.numero = numero;
    }

    /**
     * Método que comprueba la cantidad de dígitos del número pasado que son diferentes.
     *
     * @return Devuelve la cantidad de dígitos que son diferentes.
     */
    public int digitsDiferents() {
        List<Character> digitsList = new ArrayList<>();
        String anyoStr = String.valueOf(numero);
        for (char digitChar : anyoStr.toCharArray()) {
            if (!digitsList.contains(digitChar)) {
                digitsList.add(digitChar);
            }
        }
        return digitsList.size();
    }
}
