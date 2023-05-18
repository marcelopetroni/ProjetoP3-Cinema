import java.util.Calendar;
import java.util.Scanner;

public class Usuario {

  private String user;
  private String CPF;
  private String senha;
  private int idade;
  private String sexo;
  private String email;
  private String numeroCartao;
  private String nomeCartao;
  private String codigoVerificadorDoCartao;

  // Construtor
  public Usuario(String user, String CPF, String senha, int idade, String sexo, String email,
      String numeroCartao, String nomeCartao, String codigoVerificadorDoCartao) {

    this.user = user;
    this.CPF = CPF;
    this.senha = senha;
    this.idade = idade;
    this.sexo = sexo;
    this.email = email;
    this.numeroCartao = numeroCartao;
    this.nomeCartao = nomeCartao;
    this.codigoVerificadorDoCartao = codigoVerificadorDoCartao;
  }

  // Construtor vazio para pode usar os métodos sem necessariamente recolher algum
  // dado.
  public Usuario() {
  }

  // gets & sets
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String CPF) {
    this.CPF = CPF;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNumeroCartao() {
    return numeroCartao;
  }

  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  public String getNomeCartao() {
    return nomeCartao;
  }

  public void setNomeCartao(String nomeCartao) {
    this.nomeCartao = nomeCartao;
  }

  public String getCodigoVerificadorDoCartao() {
    return codigoVerificadorDoCartao;
  }

  public void setCodigoVerificadorDoCartao(String codigoVerificadorDoCartao) {
    this.codigoVerificadorDoCartao = codigoVerificadorDoCartao;
  }

  // métodos
  public double realizarCompraAlimentos(int pipoca, int refrigerante, int chocolate, int bala, int agua) {

    // Usar bibloteca Date, instanciar Filmes, Poltronas com as listas
    Compra compra = new Compra(pipoca, refrigerante, chocolate, bala, agua);

    double gastosAlimentos = compra.compraAlimentos();

    return gastosAlimentos;
  }

  public double realizarCompraIngresso(int ingresso, Filme filme) {

    Calendar horas = Calendar.getInstance();

    // if (horas.getTime() == fi ){

    Compra compra = new Compra(ingresso);

    double gastosIngresso = compra.compraIngressos();

    return gastosIngresso;

  }

  public void recolherDados() {

    Scanner in = new Scanner(System.in);

    System.out.print("Informe seu nome de usuário: ");
    this.user = in.nextLine();

    System.out.print("Informe seu CPF: ");
    this.CPF = in.nextLine();

    System.out.print("Informe sua senha: ");
    this.senha = in.nextLine();

    System.out.print("Informe sua idade: ");
    this.idade = in.nextInt();
    in.nextLine();
    // Limpeza de buffer

    System.out.print("Informe seu sexo: ");
    this.sexo = in.nextLine();

    System.out.print("Informe seu e-mail: ");
    this.email = in.nextLine();

    System.out.print("Informe o número do cartão: ");
    this.numeroCartao = in.nextLine();

    System.out.print("Informe o nome do cartão: ");
    this.nomeCartao = in.nextLine();

    System.out.print("Informe o código verificador do cartão: ");
    this.codigoVerificadorDoCartao = in.nextLine();

  }
}