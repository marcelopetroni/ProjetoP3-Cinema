package exibicao;

import java.util.Arrays;
import java.util.Calendar;

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
        Calendar horas = Calendar.getInstance();
        this.nome = nome;
        this.duração = duração;
        this.sinopse = sinopse;
        this.valor = valor;
        this.critica = critica;
        this.emCartaz = emCartaz;
        // Foi calculado a hora do filme em que ele começa em minutos para comparar com a hora atual em minutos
        // A fim de definir sua disponibilidade a partir do horário da compra
        this.horaFilme = horaFilme;
        double horasFilme = horaFilme * 60;
        
        double horaAtual = (horas.get(Calendar.HOUR_OF_DAY)) * 60; // 60 para passar horas para minutos
        double minutoAtual = horas.get(Calendar.MINUTE);
        double horaAtualEmMinutos = horaAtual + minutoAtual; 

        if(horaAtualEmMinutos < horasFilme){
            // Se o horário de compra for antes da hora que começa o filme, é deixado a disponibilidade como true
            this.disponibilidade = true;
        }
        else {
            this.disponibilidade = false;
            // Toda vez que a compra for feita depois que começou o filme, estará indisponível o filme.
            // e cairá na exceção HorarioException
        }
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