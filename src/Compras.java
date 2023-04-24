public class Compras extends Compra {
    
    private CupomPromocional cupom;

    public Compras(int pipoca, int refrigerante, int chocolate, int numeroIngressos, CupomPromocional cupom) {
        super(pipoca, refrigerante, chocolate, numeroIngressos);
        this.cupom = cupom;
    }

    public CupomPromocional getCupom() {
        return cupom;
    }

    public void setCupom(CupomPromocional cupom) {
        this.cupom = cupom;
    }

    @Override
    public int compraAlimentos() {
        return (int) (super.compraAlimentos() * this.cupom.getValor());
    }

    @Override
    public int compraIngressos() {
        return (int) (super.compraIngressos() * this.cupom.getValor());
    }
    
    
}
