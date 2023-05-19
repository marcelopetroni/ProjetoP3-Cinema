public class PoltronaException extends Exception {
    public int ingresso;
    public Filme filme;

    public PoltronaException() {
        super("Essa poltrona está indisponível. "); // getMessage()
    }

    public PoltronaException(int ingresso, Filme filme) {
        this.ingresso = ingresso;
        this.filme = filme;
    }
}
