package estudantes.animais;

public class MamiferoVoador extends Mamifero {

    int PACIENCIA_MAXIMA = 15;

    public MamiferoVoador(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal,
            Boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, peludo);

    }

}
