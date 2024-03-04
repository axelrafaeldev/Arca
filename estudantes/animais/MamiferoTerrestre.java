package estudantes.animais;

public class MamiferoTerrestre extends Mamifero {
    int PACIENCIA_MAXIMA = 35;

    public MamiferoTerrestre(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal,
            Boolean peludo) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, peludo);

    }

    public int getPACIENCIA_MAXIMA() {
        return PACIENCIA_MAXIMA;
    }

}
