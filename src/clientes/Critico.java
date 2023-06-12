package clientes;
import exceptions.*;
import exibicao.*;
import operacoes.*;

public class Critico extends Usuario {
  private String origem;
  private double nota;
  private int quantidade_criticos = 0;
  private double notas = 0;
  private double media = 0;

  public Critico(String user, String CPF, String senha, int idade, String sexo, String email, String numeroCartao,
      String nomeCartao, String codigoVerificadorDoCartao, String origem, double nota, int quantidade_criticos) {
    super(user, CPF, senha, idade, sexo, email, numeroCartao, nomeCartao, codigoVerificadorDoCartao);
    this.origem = origem;
    this.nota = nota;
    this.quantidade_criticos = quantidade_criticos;
  }

  public Critico() {
  }

  public double getNotas() {
    return notas;
  }

  public double getMedia() {
    return media;
  }

  public String getOrigem() {
    return origem;
  }

  public void setOrigem(String origem) {
    this.origem = origem;
  }

  public double getNota() {
    return nota;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }

  public int getQuantidade_criticos() {
    return quantidade_criticos;
  }

  public void setQuantidade_criticos(int quantidade_criticos) {
    this.quantidade_criticos = quantidade_criticos;
  }

  @Override
  public double realizarCompraAlimentos(int pipoca, int refrigerante, int chocolate, int bala, int agua) {

    Compra compra = new Compra(pipoca, refrigerante, chocolate, bala, agua);

    double gastosAlimentos = compra.compraAlimentos();

    return gastosAlimentos;
  }

  @Override
  public double realizarCompraIngresso(int ingresso, Filme filme) throws HorarioException, FilmeException {

    if(filme.getDisponibilidade()) {
      Compra compra = new Compra(ingresso);
      double gastosIngresso = (compra.compraIngressos()) * 0;
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

  public void atribuirNota(Filme Filme, double nota) {
    quantidade_criticos = +quantidade_criticos;
    this.nota = nota;
    this.notas += nota;
    this.media = notas / quantidade_criticos;
  }

  public void atribuirCritica(Filme filme, String critica) {
    Critica[] criticas = new Critica[100];
    for (int i = 99; i >= 0; i--) {
      if (criticas[i] == null) {
        criticas[i] = new Critica(critica);
      }
    }
    filme.setCritica(criticas);
  }
}
