package estudantes.animais;

import professor.*;
import estudantes.entidades.*;

public class Ave extends Animal {

    protected String corDasPenas;

    public Ave(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal,
            String corDasPenas) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal);
        setCorDasPenas(corDasPenas);

    }

    public String getCorDasPenas() {
        return corDasPenas;
    }

    public void setCorDasPenas(String corDasPenas) {
        this.corDasPenas = corDasPenas;
    }

}
