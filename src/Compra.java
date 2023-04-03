public class Compra { // matheus

    /*  A classe compra é a classe que contém as compras que podem ser realizadas, a
    compra pode conter itens como pipoca, refrigerante, chocolate ou qualquer outro
    item que esteja disponível(para este projeto não vamos trabalhar com estoque de
    itens, suponha que o estoque para os itens vendidos seja infinito), e deve ter um ou
    mais bilhetes. 

        O método de compra de bilhetes deve ser um método a parte,
    inicialmente o usuário irá buscar pelas sessões em cada sala, cada sala deve conter
    o filme em cartaz juntamente com o horário do filme(para este projeto, não vamos
    levar em consideração a comparação do horário atual com o horário de exibição do
    filme), uma vez que a sessão da sala tenha sido escolhida o usuário pode comprar
    os bilhetes, caso ele compre apenas um bilhete ele vai escolher uma poltrona livre
    dentro da sessão, o usuário também pode comprar vários bilhetes, caso seja
    comprado o sistema dará sugestões de cadeiras que estejam juntas para que todos
    possam se sentar juntos. */

    private int pipoca; 
    private int chocolate;
    private int refrigerante;
    private int numeroIngressos;


public Compra(int pipoca, int refrigerante, int chocolate, int numeroIngressos) {
    this.pipoca = pipoca;
    this.refrigerante = refrigerante;
    this.chocolate = chocolate;
    this.numeroIngressos = numeroIngressos;
}
    

public int getPipoca() {
    return pipoca;
}

public void setPipoca(int pipoca) {
    this.pipoca = pipoca;
}
    
public int getRefrigerante() {
    return refrigerante;
}

public void setRefrigerante(int refrigerante) {
    this.refrigerante = refrigerante;
}
    
public int getChocolate() {
    return chocolate;
}

public void setChocolate(int chocolate) {
    this.chocolate = chocolate;
}
public int compra() {
    int gastoTotal = (this.chocolate * 5) + (this.refrigerante * 5) + (this.pipoca * 20) + (this.numeroIngressos * 20);
    return gastoTotal;
}

}