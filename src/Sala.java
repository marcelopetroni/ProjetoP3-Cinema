public class Sala {
    private Sessao[] horarios = new Sessao[7];;

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
        System.out.println("Sessões Disponíveis: ");
        for(int i = 0; i < horarios.length; i++) {
            if(horarios[i] != null) {
                System.out.println(horarios.GetFilme().GetNome());
            }
        }
    }
}
