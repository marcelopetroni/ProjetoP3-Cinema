public class Compra { 

    private int pipoca; 
    private int chocolate;
    private int refrigerante;
    private int numeroIngressos;

    // Diferentes construtores, pois os métodos de compra exigem dados diferentes para cada tarefa.
    public Compra(int numeroIngressos) {
        this.numeroIngressos = numeroIngressos;
    }

    public Compra(int pipoca, int chocolate, int refrigerante) {
        this.pipoca = pipoca;
        this.chocolate = chocolate;
        this.refrigerante = refrigerante;
    }

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

    public int compraAlimentos() {
        int gastoTotal = (this.chocolate * 5) + (this.refrigerante * 5) + (this.pipoca * 20);
        return gastoTotal;
    }

    public int compraIngressos() {
        int gasto = this.numeroIngressos * 20;
        return gasto;
    }
}