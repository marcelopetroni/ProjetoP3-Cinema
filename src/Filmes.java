import java.util.LinkedList;

public class Filmes{

    LinkedList <Filme> filmes = new LinkedList<Filme>();

    public Filmes(LinkedList<Filme> filmes) {
        this.filmes = filmes;
    }

    public LinkedList<Filme> getFilmes() {
        return filmes;
    }

}

