package operacoes;

import exceptions.*;
import exibicao.*;

public class CompraGeral extends Compra{


    public CompraGeral(int pipoca, int chocolate, int refrigerante, int bala, int agua) {
        super(pipoca, chocolate, refrigerante, bala, agua);
    }

    public CompraGeral(int numeroIngressos) {
        super(numeroIngressos);
    }

    @Override
    public double realizarCompraAlimentos() {
        return (double) (super.compraAlimentos());
    }

    @Override
    public double realizarCompraIngresso(Filme filme) throws HorarioException, FilmeException {

        if(filme.getDisponibilidade() && filme.getEmcartaz()) {
            CompraGeral compra = new CompraGeral(getNumeroIngressos());
            double gastosIngresso = compra.compraIngressos();
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