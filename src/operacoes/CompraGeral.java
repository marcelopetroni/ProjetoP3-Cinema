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

    public CompraGeral() {
    }

    @Override
    public double realizarCompraAlimentos() {
        return (double) (super.compraAlimentos());
    }

    @Override
    public double realizarCompraIngresso(Filme filme) throws FilmeException {

        if(filme.getEmcartaz()) {
            CompraCritico compra = new CompraCritico(getNumeroIngressos());
            double gastosIngresso = compra.compraIngressos();
            return gastosIngresso;
        }
        else {
            FilmeException b = new FilmeException(filme);
            throw b;
        }
    }
}