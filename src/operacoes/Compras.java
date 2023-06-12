package operacoes;

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
    public double compraAlimentos() {
        return (double) (super.compraAlimentos() * this.cupom.getValor());
    }

    @Override
    public double compraIngressos() {
        return (double) (super.compraIngressos() * this.cupom.getValor());
    }
}
