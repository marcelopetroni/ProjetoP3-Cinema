package exibicao;

import java.util.Calendar;

import exceptions.*;

public class Horario {
    public void horarioDisponivel(Filme filme) throws HorarioException{
        Calendar horas = Calendar.getInstance();
        double horasFilme = filme.getHoraFilme() * 60;
        
        // Foi calculado a hora do filme em que ele começa em minutos para comparar com a hora atual em minutos
        // A fim de definir sua disponibilidade a partir do horário da compra

        double horaAtual = (horas.get(Calendar.HOUR_OF_DAY)) * 60; // 60 para passar horas para minutos
        double minutoAtual = horas.get(Calendar.MINUTE);
        double horaAtualEmMinutos = horaAtual + minutoAtual; 

        if(horaAtualEmMinutos < horasFilme){
            // Se o horário de compra for antes da hora que começa o filme, é deixado a disponibilidade como true
            filme.setDisponibilidade(true);
        }
        else {
            filme.setDisponibilidade(false);
            HorarioException e = new HorarioException(filme);
            throw e;
            // Toda vez que a compra for feita depois que começou o filme, estará indisponível o filme.
            // e cairá na exceção HorarioException
        }
    }
}
