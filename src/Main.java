// IGNORAR MAIN, USADO PARA TESTES
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar c = Calendar.getInstance();

        System.out.println("Data/Hora atual: " + c.getTime());
        System.out.println("Ano: " + c.get(Calendar.YEAR));
        System.out.println("Mês: " + c.get(Calendar.MONTH));
        System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));

        double horaFilme = 17 * 60;
        double horaAtual = (c.get(Calendar.HOUR_OF_DAY)) * 60;
        double minutoAtual = c.get(Calendar.MINUTE);
        double horaAtualEmMinutos = horaAtual + minutoAtual;
        if(horaAtualEmMinutos > horaFilme){
            System.out.println("Hora atual: " + horaAtualEmMinutos + "Hora filme: " + horaFilme);
        }

        // Testando exceção as exceções
        Usuario usuario = new Usuario();
        Filme filme = new Filme("Avatar", 180, "Sinopse aqui", 20, null, false, horaFilme);
        try {
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
