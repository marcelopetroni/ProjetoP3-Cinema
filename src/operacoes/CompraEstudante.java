package operacoes;

import exceptions.*;
import exibicao.*;

public class CompraEstudante extends Compra{


    public CompraEstudante(int pipoca, int chocolate, int refrigerante, int bala, int agua) {
        super(pipoca, chocolate, refrigerante, bala, agua);
    }

    public CompraEstudante(int numeroIngressos) {
        super(numeroIngressos);
    }

    public CompraEstudante() {
    }

    @Override
    public double realizarCompraAlimentos() {
        return (double) (super.compraAlimentos());
    }
   @Override
    public double realizarCompraIngresso(Filme filme) throws FilmeException {

        if(filme.getEmcartaz()) {
            CompraCritico compra = new CompraCritico(getNumeroIngressos());
            double gastosIngresso = compra.compraIngressos()/2;
            return gastosIngresso;
        }
        else {
            FilmeException b = new FilmeException(filme);
            throw b;
        }
    }
}
