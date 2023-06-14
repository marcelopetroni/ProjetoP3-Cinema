package exceptions;
import exibicao.*;

public class HorarioException extends Exception {
    public Filme filme;

    public HorarioException() {
        super("O filme está indisponível para esse horário. "); // getMessage()
    }

    public HorarioException(Filme filme) {
        this.filme = filme;
    }

    // Informativo: A classe Compra realiza a compra dos ingressos em que será permitido a compra se o filme
    // estiver em cartaz, caso contrário cai nessa exceção. A classe Horário verifica se está dentro 
    // do horário para assistir o filme ou se já passou do início da hora do filme.
    // A classe Adminstrador e Funcionario são responsáveis por administrar os filmes.
}