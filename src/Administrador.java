import java.util.LinkedList;

public class Administrador extends Base implements GerenciaDeFilmes{
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
    public void incluirFilme(LinkedList list, Filme filme) {
       list.add(filme);
    }

    @Override
    public void excluirFilme(LinkedList list, Filme filme) {
        for(int i = 0; i < list.size(); i++) {
            if(list.contains(filme)) {
                list.remove(filme);
            }
        }
    }

    @Override
    public void alterarFilme(LinkedList list, Filme filme, Filme filme2) {
        for(int i = 0; i < list.size(); i++) {
            if(list.contains(filme)) {
                list.remove(filme);
                list.add(filme2);
            }
        }
    }
    @Override
    public void adicionarUsuário(LinkedList funcionarios) {
        Funcionario funcionario = new Funcionario(getNome(), getIdade(), getEmail(), this.salario);
        funcionarios.add(funcionario);
    }
    @Override
    public void alterarUsuario(LinkedList list) {
        
    }
    public void excluirUsuario(LinkedList list, Usuario usuario) {
        for(int i = 0; i < list.size(); i++) {
            if(list.contains(usuario)) {
                list.remove(usuario);
            }
        }
    }
}
