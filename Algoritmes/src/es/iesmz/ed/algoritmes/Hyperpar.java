package es.iesmz.ed.algoritmes;

public class Hyperpar {
    private long numero;

    public Hyperpar(long numero) {
        this.numero = numero;
    }

    public boolean esHyperPar (long num) {
        int contadorNoHyper = 0;
        String numero = String.valueOf(num);
        boolean esHyperPar = true;
        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) % 2 != 0) {
                contadorNoHyper++;
            }
        }
        if (contadorNoHyper > 0) {
            esHyperPar = false;
        }
        return esHyperPar;
    }
}
