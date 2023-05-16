public class VendasException extends Exception {
    public Compra compra;

    public VendasException() {
        super("Erro no sistema."); //getMessage()
    }
    public VendasException(Compra compra) {
        this.compra = compra;
    }
    
}
