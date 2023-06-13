package exibicao;

import java.util.Arrays;

import clientes.*;

public class Filme {
    private String nome;
    private int duração;
    private String sinopse;
    private double valor;
    private Critica critica[] = new Critica[100];
    private boolean emCartaz;
    private boolean disponibilidade;
    private double horaFilme;

    public Filme(boolean emCartaz) {
        this.emCartaz = emCartaz;
    }
    
    public Filme(String nome, int duração, String sinopse, double valor, Critica []critica, boolean emCartaz, double horaFilme) {
        this.nome = nome;
        this.duração = duração;
        this.sinopse = sinopse;
        this.valor = valor;
        this.critica = critica;
        this.emCartaz = emCartaz;
        this.horaFilme = horaFilme;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuração() {
        return duração;
    }

    public void setDuração(int duração) {
        this.duração = duração;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Critica[] getCritica() {
        return critica;
    }

    public void setCritica(Critica[] critica) {
        this.critica = critica;
    }

    public boolean getEmcartaz() {
        return emCartaz;
    }

    public void setEmcartaz(boolean emCartaz) {
        this.emCartaz = emCartaz;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public double getHoraFilme() {
        return horaFilme;
    }

    public void setHoraFilme(double horaFilme) {
        this.horaFilme = horaFilme;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nDuração: " + duração + "\nSinopse: " + sinopse + "\nValor: " + valor
                + "\nCrítica: " + Arrays.toString(critica) + "\nEm Cartaz: " + emCartaz + "\nDisponibilidade: "
                + disponibilidade + "\nHora do Filme: " + horaFilme;
    }
    
}