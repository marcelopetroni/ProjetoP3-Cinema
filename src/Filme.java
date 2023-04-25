public class Filme {
    private String nome;
    private int duração;
    private String sinopse;
    private double valor;
    private Critica critica [] = new Critica [100];
    
   
    public Filme(String nome, int duração, String sinopse, double valor, Critica []critica) {
        this.nome = nome;
        this.duração = duração;
        this.sinopse = sinopse;
        this.valor = valor;
        this.critica = critica;
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
    public Critica[] getCritica() {
        return critica;
    }
    public void setCritica(Critica[] critica) {
        this.critica = critica;
    }
}
