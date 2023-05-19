public class FilmeException extends Exception {
    public int ingresso;
    public Filme filme;

    public FilmeException() {
        super("Esse filme não está mais em cartaz. "); // getMessage()
    }

    public FilmeException(int ingresso, Filme filme) {
        this.ingresso = ingresso;
        this.filme = filme;
    }

    // Informativo: A classe Usuário realiza a compra dos ingressos em que será permitido a compra a partir da 
    // disponibilidade do filme, caso contrário cai nessa exceção ou no HorarioException.
    // a condição de disponibilidade é tratado na classe Filme e pelos métodos implementados 
    // da classe Adminstrador e Funcionario.
}
