// USADO PARA TESTES
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

import administracao.*;
import clientes.*;
import exceptions.*;
import exibicao.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Calendar c = Calendar.getInstance();
        double horaFilme = 18;
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
                // Teste das listas de filmes e usuários.
                Administrador adm = new Administrador("a", 5, "s", 200, 4);
                Funcionario fc = new Funcionario("a", 5, "s", 200);
                LinkedList<Usuario> us = new LinkedList<Usuario>();
                LinkedList<Filme> fm = new LinkedList<Filme>();

                Usuarios usuarios= new Usuarios(us);
                Filmes filmes = new Filmes(fm);
                Usuario p1 = new Usuario("teste", "teste", "teste", 15, "teste", "teste", "teste", "teste", "teste");
                Usuario p2 = new Usuario("teste", "teste", "teste", 20, "teste", "teste", "teste", "teste", "teste");
                Usuario p3 = new Usuario("teste", "teste", "teste", 30, "teste", "teste", "teste", "teste", "teste");

                Filme filme1 = new Filme("Avatar", 180, "Sinopse aqui", 20, null, true, 20);
                Filme filme2 = new Filme("Mario", 150, "Sinopse aqui", 20, null, true, 16);
                Filme filme3 = new Filme("Pânico 6", 120, "Sinopse aqui", 20, null, true, 22);

                adm.adicionarUsuario(usuarios, p1);
                adm.adicionarUsuario(usuarios, p2);
                adm.adicionarUsuario(usuarios, p3);
                adm.excluirUsuario(usuarios, p1);
                adm.alterarUsuario(usuarios, p2, p1);

                fc.incluirFilme(filmes, filme1);
                fc.incluirFilme(filmes, filme2);
                fc.incluirFilme(filmes, filme3);
                fc.excluirFilme(filmes, filme2);

                System.out.println("DADOS DAS LISTAS:\n---------------------");
                System.out.println(usuarios.getUsuarios());
                System.out.println(filmes.getFilmes());
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
