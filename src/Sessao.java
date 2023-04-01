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

    public void numeroCadeira(int k){

        int a = 1;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 15; j++){
                cadeiras[i][j] = a;
                if(cadeiras[i][j] == k){
                    if(disponivelParaCompra(i, j) == true){
                        System.out.println("cadeira " + cadeiras[i][j] + "numero " + a);
                    }
                }
                a++;
            }
        }
    }
}
