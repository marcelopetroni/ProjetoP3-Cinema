public class Estudante extends Usuario {

  public Estudante(String user, String CPF, String senha, int idade, String sexo, String email, String numeroCartao,
      String nomeCartao, String codigoVerificadorDoCartao) {
    super(user, CPF, senha, idade, sexo, email, numeroCartao, nomeCartao, codigoVerificadorDoCartao);
  }

  public Estudante() {
  }

  @Override
  public double realizarCompraAlimentos(int pipoca, int refrigerante, int chocolate, int bala, int agua) {

    Compra compra = new Compra(pipoca, refrigerante, chocolate, bala, agua);

    double gastosAlimentos = (compra.compraAlimentos()) / 2;

    return gastosAlimentos;

  }

  @Override
  public double realizarCompraIngresso(int ingresso, Filme filme) throws HorarioException, FilmeException {

    if(filme.getDisponibilidade()) {
      Compra compra = new Compra(ingresso);
      double gastosIngresso = (compra.compraIngressos())/2;
      return gastosIngresso;
    }
    else if(filme.getEmcartaz() == false) {
      FilmeException b = new FilmeException(ingresso, filme);
      throw b;
    }
    else {
      HorarioException e = new HorarioException(ingresso, filme);
      throw e;
    }  
  }

}
