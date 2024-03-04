package estudantes.animais;

import professor.entidades.*;
import estudantes.entidades.*;

public class Reptil extends Animal {

    int PACIENCIA_MAXIMA = 15;

    public Reptil(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);

    }

    public int getPACIENCIA_MAXIMA() {
        return PACIENCIA_MAXIMA;
    }

}
