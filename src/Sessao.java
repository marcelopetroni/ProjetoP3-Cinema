public class Sessao {

    private int[][] cadeiras = new int[10][15];
    private String filme;

    //gets & sets
    public String getFilme() {
        return filme;
    }
    public void setFilme(String filme) {
        this.filme = filme;
    }

    //construtor
    public Sessao(String filme, int[][] cadeiras){

        this.filme = filme;
        this.cadeiras = cadeiras;
    }

    //métodos
    public void DisponivelParaCompra() {

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 15; j++){
                if(cadeiras[i][j] == 0){
                    System.out.println(cadeiras[i][j] + "disponivel");
                }
            }
        }
    }

    public void AlternarDisponibilidade(int i, int j) {

        if(cadeiras[i][j] == 0){
            cadeiras[i][j] = 1;
        }else if(cadeiras[i][j] == 1){
            cadeiras[i][j] = 0;
        }
    }
}
