package operacoes;

import exibicao.*;
import exceptions.*;

public abstract class Compra {
    private int pipoca;
    private int chocolate;
    private int refrigerante;
    private int bala;
    private int agua;
    private int numeroIngressos;

    // Diferentes construtores, pois os métodos de compra exigem dados diferentes
    // para cada tarefa.
    public Compra(int numeroIngressos) {
        this.numeroIngressos = numeroIngressos;
    }

    public Compra(int pipoca, int chocolate, int refrigerante, int bala, int agua) {
        this.pipoca = pipoca;
        this.chocolate = chocolate;
        this.refrigerante = refrigerante;
        this.bala = bala;
        this.agua = agua;
    }

    public Compra(int pipoca, int refrigerante, int chocolate, int numeroIngressos) {
        this.pipoca = pipoca;
        this.refrigerante = refrigerante;
        this.chocolate = chocolate;
        this.numeroIngressos = numeroIngressos;
    }
    
    public Compra() {
    }

    public int getBala() {
        return bala;
    }

    public void setBala(int bala) {
        this.bala = bala;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getNumeroIngressos() {
        return numeroIngressos;
    }

    public void setNumeroIngressos(int numeroIngressos) {
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

    public double compraAlimentos() {
        double gastoTotal = (this.chocolate * 5) + (this.refrigerante * 5) + (this.pipoca * 20) + (this.bala * 2)
                + (this.agua * 5);
        return gastoTotal;
    }

    public double compraIngressos() {
        double gasto = this.numeroIngressos * 20;
        return gasto;
    }
    public abstract double realizarCompraAlimentos();

    public abstract double realizarCompraIngresso(Filme filme) throws FilmeException;

}