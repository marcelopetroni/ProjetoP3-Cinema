package exceptions;
import exibicao.*;

public class FilmeException extends Exception {
    public int ingresso;
    public Filme filme;

    public FilmeException() {
        super("Esse filme não está mais em cartaz. "); // getMessage()
    }

    public FilmeException(int ingresso, Filme filme) {
        this.ingresso = ingresso;
        this.filme = filme;
    }

    // Informativo: A classe Usuário realiza a compra dos ingressos em que será permitido a compra se o filme
    // estiver em cartaz, caso contrário cai nessa exceção.
    // a condição de estar em cartaz é tratado na classe Filme por um atributo no qual os métodos implementados 
    // da classe Adminstrador e Funcionario são responsáveis por administrar.
}
