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
  
//construtor
  public Usuario(String user, String CPF, String senha, int idade, String sexo, String email, String numeroCartao, String nomeCartao, String codigoVerificadorDoCartao ){

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

  //métodos
  public void realizarCompra(){
    
  }
  public void alterarCompra(){
    
  }
  public void cancelarCompra(){
    
  }
}
