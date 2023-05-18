import java.util.LinkedList;

public class Poltronas {

    LinkedList<Sessao> poltronas = new LinkedList<Sessao>();

    public Poltronas(LinkedList<Sessao> poltronas) {
        this.poltronas = poltronas;
    }

    public LinkedList<Sessao> getPoltronas() {
        return poltronas;
    }
}
