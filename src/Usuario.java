import java.util.Scanner;
public class Usuario{

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
  String numeroCartao, String nomeCartao, String codigoVerificadorDoCartao){

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
  // Construtor vazio para pode usar os métodos sem necessariamente recolher algum dado.
  public Usuario() {
  }

  //gets & sets
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

  //métodos
  public void realizarCompra(int ingressos, int pipoca, int refrigerante, int chocolate){
    Scanner in = new Scanner(System.in);
    System.out.println("1 - Comprar ingressos.\n2 - Comprar alimentos.");
    System.out.print("Informe o que você deseja: ");
    int escolha = in.nextInt();

    while(escolha != 1 && escolha != 2) {
      System.out.print("Valor incorreto. Reinforme 1 ou 2: ");
      escolha = in.nextInt();
    }

    if(escolha == 1) {
      Compra compra = new Compra(ingressos);
      System.out.println("O valor total dos ingressos foi de R$" + compra.compraIngressos());
      System.out.println("[1] Alterar compra.\n[2] Cancelar compra.\n[3] Seguir compra.");
      int escolha2 = in.nextInt();

      while(escolha2 != 1 && escolha2 != 2) {
        System.out.print("Valor incorreto. Reinforme 1 ou 2: ");
        escolha2 = in.nextInt();
      }
      if(escolha2 == 1) {
        System.out.print("Quantos ingressos você deseja? ");
        int ingresso = in.nextInt();
        compra = new Compra(ingresso);
        System.out.println("O novo valor dos ingressos é de R$" + compra.compraIngressos());

      }
      else if(escolha2 == 2) {
        System.out.println("Compra cancelada.");
      }
      else {
        System.out.println("Aguardo do pagamento.");
      }
    }
    else {
      Compra compra = new Compra(pipoca, refrigerante, chocolate);
      System.out.println("O valor total dos ingressos foi de R$" + compra.compraAlimentos());
      System.out.println("[1] Alterar compra.\n[2] Cancelar compra.\n[3] Seguir compra.");
      int escolha2 = in.nextInt();

      while(escolha2 != 1 && escolha2 != 2) {
        System.out.print("Valor incorreto. Reinforme 1 ou 2: ");
        escolha2 = in.nextInt();
      }
      if(escolha2 == 1) {
        System.out.println("Informe o novo número de produtos desejados: ");
        System.out.print("Pipoca:");
        int pipoca2 = in.nextInt();

        System.out.print("Refrigerante: ");
        int refrigerante2 = in.nextInt();

        System.out.print("Chocolate: ");
        int chocolate2 = in.nextInt();

        compra = new Compra(pipoca2, refrigerante2, chocolate2);
        System.out.println("O novo valor dos ingressos é de R$" + compra.compraAlimentos());
      }
      else if(escolha2 == 2) {
        System.out.println("Compra cancelada.");
      }
      else {
        System.out.println("Aguardo do pagamento.");
      }
    }
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