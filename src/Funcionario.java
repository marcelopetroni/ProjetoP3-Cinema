import java.util.LinkedList;

public class Funcionario extends Base implements GerenciaDeFilmes{
    private double salario;

    public Funcionario(String nome, int idade, String email, double salario) {
        super(nome, idade, email);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    @Override
    public void adicionarUsuário(LinkedList funcionarios) {
        Funcionario funcionario = new Funcionario(getNome(), getIdade(), getEmail(), this.salario);
        funcionarios.add(funcionario);
    }

    @Override
    public void alterarUsuario(LinkedList funcionarios) {

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
}
