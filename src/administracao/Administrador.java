package administracao;
import clientes.*;
import exibicao.*;

public class Administrador extends Base implements GerenciaDeFilmes {
    private double salario;
    private int id;

    public Administrador(String nome, int idade, String email, double salario, int id) {
        super(nome, idade, email);
        this.salario = salario;
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void incluirFilme(Filmes filmes, Filme filme) {
        filmes.getFilmes().add(filme);
    }

    @Override
    public void excluirFilme(Filmes filmes, Filme filme) {

        for (int i = 0; i < filmes.getFilmes().size(); i++) {
            if (filmes.getFilmes().contains(filme)) {
                filme.setEmcartaz(false);
                filmes.getFilmes().remove(filme);
            }
        }
    }

    @Override
    public void alterarFilme(Filmes filmes, Filme filme, Filme filme2) {

        for (int i = 0; i < filmes.getFilmes().size(); i++) {
            if (filmes.getFilmes().contains(filme)) {
                filme.setEmcartaz(false);
                filmes.getFilmes().remove(filme);
                filmes.getFilmes().add(filme2);
            }
        }
    }

    @Override
    public void adicionarUsuario(Usuarios usuarios, Usuario usuario) {
        usuarios.getUsuarios().add(usuario);

    }

    @Override
    public void alterarUsuario(Usuarios usuarios, Usuario usuario, Usuario usuario2) {

        for (int i = 0; i < usuarios.getUsuarios().size(); i++) {
            if (usuarios.getUsuarios().contains(usuario)) {
                usuarios.getUsuarios().remove(usuario);
                usuarios.getUsuarios().add(usuario2);
            }
        }

    }

    public void excluirUsuario(Usuarios usuarios, Usuario usuario) {
        for (int i = 0; i < usuarios.getUsuarios().size(); i++) {
            if (usuarios.getUsuarios().contains(usuario)) {
                usuarios.getUsuarios().remove(usuario);
            }
        }
    }
}
