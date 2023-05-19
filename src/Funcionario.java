import java.util.LinkedList;
public class Funcionario extends Base implements GerenciaDeFilmes {
    public Funcionario(String nome, int idade, String email, double salario) {
        super(nome, idade, email);
        this.salario = salario;
    }

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    @Override
    public void incluirFilme(Filmes filmes, Filme filme) {
        filmes.getFilmes().add(filme);
    }

    @Override
    public void excluirFilme(Filmes filmes, Filme filme) {

        for (int i = 0; i < filmes.getFilmes().size(); i++) {
            if (filmes.getFilmes().contains(filme)) {
                filmes.getFilmes().remove(filme);
            }
        }
    }

    @Override
    public void alterarFilme(Filmes filmes, Filme filme, Filme filme2) {

        for (int i = 0; i < filmes.getFilmes().size(); i++) {
            if (filmes.getFilmes().contains(filme)) {
                filmes.getFilmes().remove(filme);
                filmes.getFilmes().add(filme);
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

}
