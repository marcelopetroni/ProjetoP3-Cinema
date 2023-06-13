package exibicao;
import exceptions.*;

public class Poltrona {
    
    private int[][] cadeiras = new int[10][15];
    private Filme filme;

    // Construtor
    public Poltrona() {
    }
    public Poltrona(Filme filme) {
        this.filme = filme;
    }
    public Poltrona(int[][]cadeiras) {
        this.cadeiras = cadeiras;
    }
    
    // Gets & Sets
    public Filme getFilme() {
        return filme;
    }
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    public int[][] getCadeiras() {
        return cadeiras;
    }
    public void setCadeiras(int[][] cadeiras) {
        this.cadeiras = cadeiras;
    }

    // Métodos
    public void alternarDisponibilidade(int i, int j) {
        // 0 é disponível e 1 significa indisponível
        if(cadeiras[i][j] == 0){
            this.cadeiras[i][j] = 1;
        }else if(cadeiras[i][j] == 1){
            this.cadeiras[i][j] = 0;
        }
        setCadeiras(cadeiras);
    }
    // Mostra um mapa de cadeiras disponíveis (D) e indisponíveis (I)
    public void exibirCadeiras(){
        char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        System.out.println("  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15");
        for(int i = 0; i < 10; i++){
            System.out.print(alfabeto[i] + " ");
            for(int j = 0; j < 15; j++){
               if(this.cadeiras[i][j] == 0) {
                System.out.print("D ");
               }
               else {
                System.out.print("I ");
               }
            }
            System.out.println();
        }
    }
    public void escolherPoltrona(int i, int j) throws PoltronaException {
        // 0 significa disponível
        if(cadeiras[i][j] == 0) {
            alternarDisponibilidade(i, j);
            // aqui altera a cadeira escolhida para indisponível
        }
        else {
            PoltronaException p = new PoltronaException(i, j);
            throw p;
        }
    }
    // Será chamado esse método que se não tiver disponibilidade cairá na exceção PoltronaException
    // A disponibiidade é definida a partir de um vetor que ao escolher uma nova cadeira é marcado 
    // certa posição como preenchido (indisponível), (assim um novo usuário não poderá escolher aquela mesma poltrona)
}
