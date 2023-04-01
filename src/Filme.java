public class Filme {
    private String nome;
    private int duração;
    private String sinopse;
    private double valor;
    
    public Filme(String nome, int duração, String sinopse, double valor) {
        this.nome = nome;
        this.duração = duração;
        this.sinopse = sinopse;
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getDuração() {
        return duração;
    }
    public void setDuração(int duração) {
        this.duração = duração;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
