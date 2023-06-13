package exceptions;
import exibicao.*;

public class HorarioException extends Exception {
    public int ingresso;
    public Filme filme;

    public HorarioException() {
        super("O filme está indisponível para esse horário. "); // getMessage()
    }

    public HorarioException(int ingresso, Filme filme) {
        this.ingresso = ingresso;
        this.filme = filme;
    }

    // Informativo: A classe Compra realiza a compra dos ingressos em que será permitido a partir da 
    // disponibilidade do filme, caso contrário cai nessa exceção. A condição de disponibilidade
    // é tratado na classe Filme e pelos métodos implementados da classe Adminstrador e Funcionario.
}