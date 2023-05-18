public class Sala {
    private Sessao[] horarios = new Sessao[7];

    public Sala(Sessao[] horarios) {
        this.horarios = horarios;
    }

    public Sessao[] getHorarios() {
        return horarios;
    }

    public void setHorarios(Sessao[] horarios) {
        this.horarios = horarios;
    }
    
    public void sessoesDisponiveis() {
        int contador = 8;
        System.out.println("Sessões Disponíveis: ");
        for(int i = 0; i < horarios.length; i++) {
            if(horarios[i] != null) {
                System.out.println(contador + "-" + (contador +  horarios[i].getFilme().getDuração() ) + "h, " + horarios[i].getFilme().getNome() + ", R$20");
            }
            contador += 2;
        }
    }
}
