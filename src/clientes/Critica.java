package clientes;
public class Critica {
    private String nome;
    private String origem;
    private String mensagem;
    private Critica critica[] = new Critica[100];

    public Critica(String nome, String origem, String mensagem) {
        this.nome = nome;
        this.origem = origem;
        this.mensagem = mensagem;
    }

    public Critica(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Critica[] getCritica() {
        return critica;
    }

    public void setCritica(Critica[] critica) {
        this.critica = critica;
    }

}
