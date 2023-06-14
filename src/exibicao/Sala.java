package exibicao;

import java.util.LinkedList;

public class Sala {

    public Sala() {
    }

    public void FilmesDisponiveis(LinkedList<Filme> filmes) {
        int contador = 1;
        System.out.println("Filmes Disponíveis: ");
        for(int i = 0; i < filmes.size(); i++) {
            if(filmes.get(i) != null) {
                System.out.println(contador + " - " + filmes.get(i).getHoraFilme() + "h, " + filmes.get(i).getNome() + ", R$20");
            }
            contador ++;
        }
    }
}
