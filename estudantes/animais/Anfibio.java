package estudantes.animais;

import estudantes.entidades.*;
import professor.entidades.*;

public class Anfibio extends Animal {

    int PACIENCIA_MAXIMA = 45;

    public Anfibio(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal) {

        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
    }

    public int getPACIENCIA_MAXIMA() {
        return PACIENCIA_MAXIMA;
    }

    public void setPACIENCIA_MAXIMA(int pACIENCIA_MAXIMA) {
        PACIENCIA_MAXIMA = pACIENCIA_MAXIMA;
    }

    public String nadar() {
        return "nadando";
    }

    public String andar() {
        return "andando";
    }
}
