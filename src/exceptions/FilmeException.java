package exceptions;
import exibicao.*;

public class FilmeException extends Exception {
    public Filme filme;

    public FilmeException() {
        super("Esse filme não está mais em cartaz. "); // getMessage()
    }

    public FilmeException(Filme filme) {
        this.filme = filme;
    }

    // Informativo: A classe Compra realiza a compra dos ingressos em que será permitido a compra se o filme
    // estiver em cartaz, caso contrário cai nessa exceção. A classe compra verifica se o filme se encontra
    // em cartaz. A classe Adminstrador e Funcionario são responsáveis por administrar os filmes.
}
