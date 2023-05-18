public class FilmeException extends Exception {
    public Filme filme;

    public FilmeException() {
        super("Esse filme não está mais em cartaz. "); // getMessage()
    }

    public FilmeException(Filme filme) {
        this.filme = filme;
    }
}
