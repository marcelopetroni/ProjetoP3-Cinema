package operacoes;

import exceptions.*;
import exibicao.*;

public class CompraCritico extends Compra {

    public CompraCritico(int pipoca, int chocolate, int refrigerante, int bala, int agua) {
        super(pipoca, chocolate, refrigerante, bala, agua);
    }

    public CompraCritico(int numeroIngressos) {
        super(numeroIngressos);
    }

    public CompraCritico() {
    }

    @Override
    public double realizarCompraAlimentos() {
        return (double) (super.compraAlimentos());
    }

    @Override
    public double realizarCompraIngresso(Filme filme) throws FilmeException {

        if(filme.getEmcartaz()) {
            CompraCritico compra = new CompraCritico(getNumeroIngressos());
            double gastosIngresso = compra.compraIngressos() * 0;
            return gastosIngresso;
        }
        else {
            FilmeException b = new FilmeException(filme);
            throw b;
        }
    }
}
