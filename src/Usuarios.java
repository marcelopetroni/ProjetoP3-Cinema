import java.util.LinkedList;

public class Usuarios {

    LinkedList<Usuario> usuarios = new LinkedList<Usuario>();

    public Usuarios(LinkedList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public LinkedList<Usuario> getUsuarios() {
        return usuarios;
    }
}
