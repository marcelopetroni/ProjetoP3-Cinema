public class Sessao {

    private int[][] cadeiras = new int[10][15];
    private Filme filme;

    //gets & sets
    public Filme getFilme() {
        return filme;
    }
    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    //construtor
    public Sessao(Filme filme){

        this.filme = filme;
    }

    //métodos
    public boolean disponivelParaCompra(int a, int b) {

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 15; j++){    
                if(a == i && b == j){
                    if(cadeiras[i][j] == 0){
                        System.out.println(cadeiras[i][j] + "disponivel");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void alternarDisponibilidade(int i, int j) {

        if(cadeiras[i][j] == 0){
            cadeiras[i][j] = 1;
        }else if(cadeiras[i][j] == 1){
            cadeiras[i][j] = 0;
        }
    }

    public void exibirCadeiras(){
        char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        System.out.println("  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15");
        for(int i = 0; i < 10; i++){
            System.out.print(alfabeto[i] + " ");
            for(int j = 0; j < 15; j++){
               if(this.cadeiras[i][j] == 0) {
                System.out.print("I ");
               }
               else {
                System.out.print("D ");
               }
            }
            System.out.println();
        }
    }
}
