package mercadoria;

public enum Produtos {
    CHOCOLATE(5, "Chocolate"),
    REFRIGERANTE(5, "Refrigerante"),
    PIPOCA(20, "Pipoca"),
    BALA(2, "Bala"),
    AGUA(5, "Água");

    private final int valor;
    private final String nome;

    private Produtos(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

}
