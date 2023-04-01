public class Sessao {

    private int[][] cadeiras = new int[10][15];
    
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
}
