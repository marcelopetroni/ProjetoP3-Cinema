public class PoltronaException extends Exception {
    public Sessao sessao;

    public PoltronaException() {
        super("Essa poltrona está indisponível. "); // getMessage()
    }

    public PoltronaException(Sessao sessao) {
        this.sessao = sessao;
    }
}
