public class PoltronaException extends Exception {
    public int i;
    public int j;

    public PoltronaException() {
        super("Essa poltrona está indisponível. "); // getMessage()
    }

    public PoltronaException(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
