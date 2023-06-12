package clientes;

public class Estudante extends Usuario {

  public Estudante(String user, String CPF, String senha, int idade, String sexo, String email, String numeroCartao,
      String nomeCartao, String codigoVerificadorDoCartao) {
    super(user, CPF, senha, idade, sexo, email, numeroCartao, nomeCartao, codigoVerificadorDoCartao);
  }

  public Estudante() {
  }

}
