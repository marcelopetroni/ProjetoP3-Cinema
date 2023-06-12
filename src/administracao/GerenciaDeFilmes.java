package administracao;
import exibicao.*;
public interface GerenciaDeFilmes {
    
    public abstract void incluirFilme(Filmes filmes, Filme filme);

    public abstract void excluirFilme(Filmes filmes, Filme filme);

    public abstract void alterarFilme(Filmes filmes, Filme filme, Filme filme2);
}
