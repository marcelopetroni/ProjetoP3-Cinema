package operacoes;

import exceptions.*;
import exibicao.*;

public class CompraCupom extends Compra {

    private CupomPromocional cupom;

    public CompraCupom(int pipoca, int refrigerante, int chocolate, int numeroIngressos, CupomPromocional cupom) {
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
    public double realizarCompraAlimentos() {
        return (double) (super.compraAlimentos());
    }

    @Override
    public double realizarCompraIngresso(Filme filme) throws HorarioException, FilmeException {

        if(filme.getDisponibilidade() && filme.getEmcartaz()) {
            CompraGeral compra = new CompraGeral(getNumeroIngressos());
            double gastosIngresso = compra.compraIngressos() - (compra.compraIngressos() * cupom.getValor());
            return gastosIngresso;
        }
        else if(!filme.getEmcartaz()) {
            FilmeException b = new FilmeException(getNumeroIngressos(), filme);
            throw b;
        }
        else {
            HorarioException e = new HorarioException(getNumeroIngressos(), filme);
            throw e;
        } 
    }
}
