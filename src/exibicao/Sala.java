package exibicao;

import java.util.LinkedList;

public class Sala {

    public void FilmesDisponiveis(LinkedList<Filme> filmes) {
        int contador = 8;
        System.out.println("Filmes Disponíveis: ");
        for(int i = 0; i < filmes.size(); i++) {
            if(filmes.get(i) != null) {
                System.out.println(contador + "-" + (contador +  filmes.get(i).getHoraFilme()) + "h, " + filmes.get(i).getNome() + ", R$20");
            }
            contador += filmes.get(i).getHoraFilme();
        }
    }
}
