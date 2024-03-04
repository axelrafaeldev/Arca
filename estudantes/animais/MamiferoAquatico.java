package estudantes.animais;

public class MamiferoAquatico extends Mamifero {

    int PACIENCIA_MAXIMA = 40;

    public MamiferoAquatico(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal,
            Boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, peludo);

    }

}
