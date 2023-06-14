package mercadoria;

public class Bilhete {

    private String user;
    private String cpf;
    private String sala;
    private String sessao;
    private String filme;
    private double valor;
    private int cadeiraComprada;

    // Construtor
    public Bilhete(String user, String cpf, String sala, String sessao, String filme,
            double valor, int cadeiraComprada) {
        this.user = user;
        this.cpf = cpf;
        this.sala = sala;
        this.sessao = sessao;
        this.filme = filme;
        this.valor = valor;
        this.cadeiraComprada = cadeiraComprada;
    }

    // Getters and Setters
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCadeiraComprada() {
        return cadeiraComprada;
    }

    public void setCadeiraComprada(int cadeiraComprada) {
        this.cadeiraComprada = cadeiraComprada;
    }

    @Override
    public String toString() {
        return "\nBilhete: \nuser =" + user + "\ncpf = " + cpf + "\nsala = " + sala + "\nsessao = " + sessao + "\nfilme = " + filme
                + "\n valor = " + valor + "\ncadeiraComprada = " + cadeiraComprada;
    }
    
}