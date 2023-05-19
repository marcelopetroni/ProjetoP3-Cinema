import java.util.LinkedList;

public class Filmes{

    private LinkedList <Filme> filmes = new LinkedList<Filme>();

    public Filmes(LinkedList<Filme> filmes) {
        this.filmes = filmes;
    }

    public LinkedList<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(LinkedList<Filme> filmes) {
        this.filmes = filmes;
    }

}

