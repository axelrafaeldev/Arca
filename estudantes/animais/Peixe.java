package estudantes.animais;

import professor.*;
import estudantes.entidades.*;

public class Peixe extends Animal {

    String corDasEscamas;
    int PACIENCIA_MAXIMA = 60;

    public Peixe(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal,
            String corDasEscamas) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        setCorDasEscamas(corDasEscamas);
    }

    public String getCorDasEscamas() {
        return corDasEscamas;
    }

    public void setCorDasEscamas(String corDasEscamas) {
        this.corDasEscamas = corDasEscamas;
    }

    public int getPACIENCIA_MAXIMA() {
        return PACIENCIA_MAXIMA;
    }

    public void setPACIENCIA_MAXIMA(int pACIENCIA_MAXIMA) {
        PACIENCIA_MAXIMA = pACIENCIA_MAXIMA;
    }
}
