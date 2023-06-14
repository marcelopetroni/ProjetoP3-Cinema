package clientes;
import java.util.LinkedList;

public class Usuarios {

    private LinkedList<Usuario> usuarios;

    public Usuarios(LinkedList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public LinkedList <Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(LinkedList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    // Armazena todos os usuários no LinkedList, apenas as classes Funcionário e Administrador podem alterar essa lista.
}
