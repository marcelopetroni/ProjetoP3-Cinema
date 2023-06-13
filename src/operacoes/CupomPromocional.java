package operacoes;

public enum CupomPromocional {
    IDOSO(0.5, "Idoso"),
    CARTAOITAU(0.5, "Itaú"),
    CARTAOBRADESCO(0.5, "Bradesco");

    private final double valor;
    private final String nome;

    private CupomPromocional(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

}
