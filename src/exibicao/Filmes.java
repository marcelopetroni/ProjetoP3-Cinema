package exibicao;

import java.util.LinkedList;

public class Filmes{

    private LinkedList <Filme> filmes;

    public Filmes(LinkedList<Filme> filmes) {
        this.filmes = filmes;
    }

    public LinkedList<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(LinkedList<Filme> filmes) {
        this.filmes = filmes;
    }
    // Armazena todos os filmes no LinkedList, apenas as classes Funcionário e Administrador podem alterar essa lista.

}

