package es.iesmz.ed.algoritmes;

public class Hyperpar {
    private long numero = 0;

    public Hyperpar(long numero) {
        this.numero = numero;
    }
    public boolean esHyperPar () {
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
