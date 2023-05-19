public abstract class Base {
    private String nome;
    private int idade;
    private String email;

    public Base(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void adicionarUsuário(Usuario usuario);

    public abstract void alterarUsuario(String CPF, Usuario usuarioalterado);
    // Será preciso instanciar a classe Usuarios que vai ter a lista/vetor/banco de
    // dados
    // e adicionar/alterar usuario e será aramzenado essas infos nesse objeto
    // as classes que tiverem esse metodo implementado irá procurar por meio do
    // cpf o usuario e mudar as infos da lista.

}
