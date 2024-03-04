package estudantes.animais;

import professor.*;
import estudantes.entidades.*;

public class Mamifero extends Animal {

    protected boolean peludo;

    public Mamifero(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal,
            boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        setPeludo(peludo);

    }

    public void setPeludo(boolean peludo) {
        this.peludo = peludo;
    }

}
