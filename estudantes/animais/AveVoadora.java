package estudantes.animais;

public class AveVoadora extends Ave {

    public AveVoadora(int id, String nome, String especie, int andarDesejado, int peso, int temperaturaIdeal,
            String corDasPenas) {
        super(id, nome, especie, andarDesejado, peso, temperaturaIdeal, corDasPenas);

    }

    @Override
    public String toString() {
        return "AveQueVoa";
    }

    public String voar() {
        return "voando";
    }

}
