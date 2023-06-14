package exibicao;

import java.util.LinkedList;

public class Poltronas{

    private LinkedList <Poltrona> poltronas;

    public Poltronas(LinkedList<Poltrona> poltronas) {
        this.poltronas = poltronas;
    }

    public LinkedList<Poltrona> getPoltronas() {
        return poltronas;
    }

    public void setpoltronas(LinkedList<Poltrona> poltronas) {
        this.poltronas = poltronas;
    }
    // Armazena todas as Poltronas de cada filme na LinkedList

}

