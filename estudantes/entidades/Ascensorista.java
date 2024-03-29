package estudantes.entidades;

import java.util.ArrayList;
import java.util.List;

import professor.entidades.Andar;
import professor.entidades.Arca;
import professor.entidades.Elevador;

/**
 * Classe que traz a lógica do algoritmo de uso do elevador.
 * <br>
 * <br>
 * Você pode incluir novos atributos e métodos nessa classe para criar
 * lógicas mais complexas para o gerenciamento do uso do elevador, mas esses
 * <strong>atributos e métodos devem ser todos privados</strong>. O único
 * método público deve ser "agir".
 * 
 * @author Jean Cheiran
 * @version 1.1
 */
public class Ascensorista {
    int contadorDeMovimento = 0;

    public int getContadorDeMovimento() {
        return contadorDeMovimento;
    }

    /**
     * Construtor padrão de Ascensorista.
     * Esse construtor sem parâmetros que será usado pela Arca. Embora a
     * assinatura do construtor não deva ser mudada, o código interno pode
     * ser alterado conforme a necessidade.
     */
    public Ascensorista() {

    }

    /**
     * Executa a lógica de controle do elevador e dos animais.
     * Esse método é o único método de controle invocado durante a simulação
     * de vida da arca.
     * <br>
     * <br>
     * Aqui podem ser feitas todas as verificações sobre os animais do elevador
     * e da fila de animais que estão esperando no andar. A partir desses
     * estados, você pode movimentar animais para dentro e para fora do
     * elevador usando os métodos "desembarcar" e "embarcar" por exemplo.
     * O estado do elevador também é importante para acionar os comandos do
     * elevador como "drenar", "encher", "subir" e "descer".
     * <br>
     * <br>
     * O método de subir ou descer só deve ser acionado uma vez durante a
     * invocação desse método. Por exemplo, se o método subir foi invocado em
     * algum momento desse método, ele não pode ser invocado de novo e nem o
     * método de descer pode ser invocado.
     * 
     * @param elevador o elevador controlado pelo ascensorista
     * @param andar    o andar no qual o elevador está parado
     */
    public void agir(Elevador elevador, Andar andarAtual) {

        Animal[] animaisNoAndar = andarAtual.checarFilaParaElevador();

        for (Animal animal : animaisNoAndar) {

            System.out.println(elevador.getTemperaturaDoArCondicionado());
            elevador.embarcar(animal);
            andarAtual.checarDestino(animal, animal.getAndarDesejado());
        }
        if (contadorDeMovimento < 4) {
            if (elevador.getDirecao() == 1) {
                elevador.subir();
                contadorDeMovimento++;
            } else if (elevador.getDirecao() == -1) {
                elevador.descer();
                contadorDeMovimento++;
            }
        } else if (contadorDeMovimento == 4) {
            elevador.mudarDirecao();
            contadorDeMovimento = 0;
        }

        System.out.println("contador" + contadorDeMovimento);
        System.out.println("direçao" + elevador.getDirecao());

    }

    // public void checarModoRespirar(Animal animal, Elevador elevador) {

    // }

    // public void checarTemperatura(Animal animal, Andar andar, Elevador elevador)
    // {
    // Animal[] animaisNoElevador = elevador.checarAnimaisNoElevador();
    // for (Animal animalNoElevador : animaisNoElevador) {
    // if (animalNoElevador.getTemperaturaIdeal() !=
    // elevador.getTemperaturaDoArCondicionado()) {
    // animal.aumentaEspera(animal);
    // elevador.desembarcar(animal, andar);
    // Andar.filaParaElevador.add(animal);

    // andar.tirarDaFila(animal);
    // } else {
    // System.out.println(animal.getNome() + "Seguindo viagem");
    // }

    // }

    public int checarPesoElevador(Animal animal, Elevador elevador) {
        Animal[] animaisNoElevador = elevador.checarAnimaisNoElevador();
        int pesoTotal = 0;
        for (Animal animalNoElevador : animaisNoElevador) {
            pesoTotal += animalNoElevador.getPeso();
        }
        return pesoTotal;
    }

}
