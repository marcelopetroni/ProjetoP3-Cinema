package exibicao;

public enum Salas {
    SALACOMUM (1.0, "Sala Comum"),
    SALA3D (1.2, "Sala 3D"),
    SALAXD (1.3, "Sala XD"),
    SALAXD3D (1.4, "Sala XD 3D");

    private final double valor;
    private final String nome;

    private Salas(double valor, String nome) {
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
