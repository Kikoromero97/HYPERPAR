package es.iesmz.ed.algoritmes;

import java.util.ArrayList;
import java.util.List;

public class Any {
    private final long numero;

    public Any(long numero) {
        this.numero = numero;
    }

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
