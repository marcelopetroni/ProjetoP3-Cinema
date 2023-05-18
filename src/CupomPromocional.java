public enum CupomPromocional {
    IDOSO(0.25, "Idoso"),
    CARTAOITAU(0.25, "Itaú"),
    CARTAOBRADESCO(0.25, "Bradesco");

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
