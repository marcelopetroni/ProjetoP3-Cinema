public class HorarioException extends Exception {
    public Compra compra;

    public HorarioException() {
        super("O filme está indisponível para esse horário. "); // getMessage()
    }

    public HorarioException(Compra compra) {
        this.compra = compra;
    }
}