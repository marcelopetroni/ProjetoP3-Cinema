package exceptions;

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
    // O local que está armazenado a disponibilidade das cadeiras está na classe sessão que possui um vetor.
}
