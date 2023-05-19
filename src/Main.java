// IGNORAR MAIN, USADO PARA TESTES
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar c = Calendar.getInstance();

        System.out.println("Data/Hora atual: " + c.getTime());
        System.out.println("Ano: " + c.get(Calendar.YEAR));
        System.out.println("Mês: " + c.get(Calendar.MONTH));
        System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));

        double horaFilme = 23 * 60;
        double horaAtual = (c.get(Calendar.HOUR_OF_DAY)) * 60;
        double minutoAtual = c.get(Calendar.MINUTE);
        double horaAtualEmMinutos = horaAtual + minutoAtual;
        if(horaAtualEmMinutos > horaFilme){
            System.out.println("Hora atual: " + horaAtualEmMinutos + "Hora filme: " + horaFilme);
        }
        Sessao sessao = new Sessao();
        // Testando exceção as exceções
        for(int i = 0; i < 5; i++) {
            System.out.println("Você é usuário ou adim?\n[1] Usuário\n[2] Adim");
            int resposta = in.nextInt();
            if(resposta == 1) {
                Usuario usuario = new Usuario();
                Filme filme = new Filme("Avatar", 180, "Sinopse aqui", 20, null, true, horaFilme);
    
                sessao.exibirCadeiras();
        
                System.out.println("\nSelecione a poltrona desejada: ");
                System.out.print("Letra: ");
                char letra = in.next().charAt(0);
                char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        
                int linha = 0;
                for(int z = 0; z < 10; z++) {
                    if(Character.toUpperCase(letra) == alfabeto[z]) {
                        linha = z;
                    }
                }
                System.out.print("Número: ");
                int coluna = in.nextInt();
                
                System.out.println("---------------------------------");
                try {
                    sessao.escolherPoltrona(linha, coluna - 1);
                    System.out.println("Poltrona selecionada com sucesso.");
                    System.out.println("Será um total de R$ " + usuario.realizarCompraIngresso(4, filme));
                }
                catch(HorarioException hr) {
                    hr = new HorarioException();
                    System.out.println(hr.getMessage());
                }
                catch(FilmeException fm) {
                    fm = new FilmeException();
                    System.out.println(fm.getMessage());
                }
                catch(PoltronaException p) {
                    p = new PoltronaException();
                    System.out.println(p.getMessage());
                }
            }
            else {
                Administrador adm = new Administrador("a", 5, "s", 200, 4);
                LinkedList<Usuario> us = new LinkedList<Usuario>();
                Usuarios usuarios= new Usuarios(us);
                Usuario p1 = new Usuario("teste", "teste", "teste", 15, "teste", "teste", "teste", "teste", "teste");
                Usuario p2 = new Usuario("teste", "teste", "teste", 20, "teste", "teste", "teste", "teste", "teste");
                Usuario p3 = new Usuario("teste", "teste", "teste", 30, "teste", "teste", "teste", "teste", "teste");

                adm.adicionarUsuario(usuarios, p1);
                adm.adicionarUsuario(usuarios, p2);
                adm.adicionarUsuario(usuarios, p3);
                adm.excluirUsuario(usuarios, p1);
                adm.alterarUsuario(usuarios, p2, p1);

                System.out.println(usuarios.getUsuarios());
            }
        }

        // Recolher dados de um novo usuário:
        System.out.print("Informe seu nome de usuário: ");
        String user = in.nextLine();
    
        System.out.print("Informe seu CPF: ");
        String CPF = in.nextLine();
    
        System.out.print("Informe sua senha: ");
        String senha = in.nextLine();
    
        System.out.print("Informe sua idade: ");
        int idade = in.nextInt();
        in.nextLine();
        // Limpeza de buffer
    
        System.out.print("Informe seu sexo: ");
        String sexo = in.nextLine();
    
        System.out.print("Informe seu e-mail: ");
        String email = in.nextLine();
    
        System.out.print("Informe o número do cartão: ");
        String numeroCartao = in.nextLine();
    
        System.out.print("Informe o nome do cartão: ");
        String nomeCartao = in.nextLine();
    
        System.out.print("Informe o código verificador do cartão: ");
        String codigoVerificadorDoCartao = in.nextLine();
    
    }
}
