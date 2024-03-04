package estudantes.entidades;

import javax.swing.JOptionPane;

/**
 * Classe que define um animal da arca.
 * <br>
 * <br>
 * Essa classe pode ser estendida. Adicionalmente, ela deve:
 * <br>
 * <br>
 * 1) ter um construtor completo,<br>
 * 2) implementar métodos de acesso (getters), sendo que métodos de modificação
 * (setters) NÃO devem ser implementados,<br>
 * 3) sobre-escrever os métodos toString, equals e hashCode,<br>
 * 4) deve implementar o método <i>aumentaEspera</i> conforme indicado na
 * documentação.
 * <br>
 * <br>
 * <strong>Não devem ser criados métodos adicionais nessa classe.</strong>
 * 
 * @author Jean Cheiran
 * @version 1.1
 */
public class Animal {

    /**
     * Limite da paciência de um animal esperando na fila antes de ir embora.
     */
    public final int PACIENCIA_MAXIMA = 25; // em segundos (ciclos de espera)

    private int id;
    private String nome;
    private String especie;
    private int peso; // em quilos
    private int andarDesejado; // 0 é o térreo
    private int tempoDeEspera;
    private int temperaturaIdeal; // em graus Celsius

    /**
     * Construtor do animal.
     * Todos os atributos são passados por parâmetro, exceto o tempo de espera
     * que sempre começa em 0.
     * 
     * @param id
     * @param nome
     * @param especie
     * @param andarDesejado
     * @param peso
     * @param temperaturaIdeal
     */
    public Animal(int id, String nome, String especie, int andarDesejado,
            int peso, int temperaturaIdeal) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.andarDesejado = andarDesejado;
        this.peso = peso;
        this.temperaturaIdeal = temperaturaIdeal;
        this.tempoDeEspera = 0;

    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getAndarDesejado() {
        return andarDesejado;
    }

    public int getTempoDeEspera() {
        return tempoDeEspera;
    }

    public int getTemperaturaIdeal() {
        return temperaturaIdeal;
    }

    public int getId() {
        return id;
    }

    public int getPeso() {
        return peso;
    }

    /**
     * Aumenta o tempo de espera um animal na fila quando passa um ciclo.
     * Esse é o tempo de espera na fila de um andar para embarcar no elevador.
     * Um ciclo ocorre sempre que o método de simular vida na arca é invocado.
     * Esse método não deve ser chamado fora da classe Arca.
     * <br>
     * <br>
     * A implementação desse método deve comparar a paciência do animal com
     * o tempo de espera depois de incrementado. Se ela for menor, uma exceção
     * deve ser lançada.
     * <br>
     * <br>
     * 
     * @throws RuntimeException se o animal está esperando a mais tempo que a
     *                          paciência
     * @see professor.entidades.Arca#simularVida
     */
    public void aumentaEspera() {
        tempoDeEspera++;
        if (tempoDeEspera > PACIENCIA_MAXIMA) {
            JOptionPane.showMessageDialog(null, "Animal " + nome + " está furioso! Paciência esgotada.");
            throw new RuntimeException("Paciência do animal esgotada");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", peso=" + peso +
                ", andarDesejado=" + andarDesejado +
                ", tempoDeEspera=" + tempoDeEspera +
                ", temperaturaIdeal=" + temperaturaIdeal +
                '}';
    }

}
// a lista de animais que desembarcaram vai sendo testada pra ver se
// o animal ja está no andar desejado , e os outros vc vai realocando
// pra movimentar
// faça uma movimentaçao ciclica de 1 a 5
//