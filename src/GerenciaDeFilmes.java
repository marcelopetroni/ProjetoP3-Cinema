import java.util.LinkedList;

public interface GerenciaDeFilmes {
    public abstract void incluirFilme(LinkedList list, Filme filme);
    public abstract void excluirFilme(LinkedList list, Filme filme);
    public abstract void alterarFilme(LinkedList list, Filme filme, Filme filme2);
}
