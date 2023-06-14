// USADO PARA TESTES
import java.util.LinkedList;
import java.util.Scanner;

import administracao.*;
import clientes.*;
import exceptions.*;
import exibicao.*;
import operacoes.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Sala sala = new Sala();
        LinkedList<Filme> fm = new LinkedList<Filme>();
        Filmes filmes = new Filmes(fm);
        Poltrona poltronas = new Poltrona();

        Filme filme1 = new Filme("Homem-Aranha: Através do Aranhaverso", 120, "Sinopse aqui", 20, null, true, 8);
        Filme filme2 = new Filme("A Pequena Sereia", 120, "Sinopse aqui", 20, null, true, 10);
        Filme filme3 = new Filme("Guardiões da Galáxia 3", 120, "Sinopse aqui", 20, null, true, 12);
        fm.add(filme1);
        fm.add(filme2);
        fm.add(filme3);

        // Programa principal
        for (int i = 0; i < 5; i++) {
            System.out.println("\nVocê é usuário ou adim?\n[1] Usuário\n[2] Adim");

            int resposta = in.nextInt();
            if (resposta == 1) {
                System.out.println("O que você deseja?\n[1] Comprar ingressos.\n[2] Comprar comida.");
                int desejo = in.nextInt();

                if (desejo == 1) {
                    sala.FilmesDisponiveis(fm);
                    System.out.print("Escolha um filme pela númeração: ");
                    int escolha = in.nextInt();
                    Filme filmeEscolhido = fm.get(escolha - 1);
                    poltronas.setFilme(filmeEscolhido);

                    // Primeira exceção a ser tratada (se a partir do horário atual pode comprar filme escolhido):
                    try {
                        Horario verificacao = new Horario();
                        verificacao.horarioDisponivel(filmeEscolhido);;
                    }
                    catch (HorarioException fl) {
                        fl = new HorarioException();
                        System.out.println(fl.getMessage());
                        continue;
                    }

                    System.out.println("\nQuantas poltronas você deseja? ");
                    int quantidade = in.nextInt();
                    poltronas.exibirCadeiras();

                    boolean erro = false;
                    for (int x = 1; x <= quantidade; x++) {
                        System.out.println("\nSelecione a " + x + "º poltrona desejada: ");
                        System.out.print("Letra: ");
                        char letra = in.next().charAt(0);
                        char[] alfabeto = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };

                        int linha = 0;
                        for (int z = 0; z < 10; z++) {
                            if (Character.toUpperCase(letra) == alfabeto[z]) {
                                linha = z;
                            }
                        }
                        System.out.print("Número: ");
                        int coluna = in.nextInt();

                        // Segunda exceção a ser tratada (se poltrona se encontra disponível ou não):
                        try {
                            poltronas.escolherPoltrona(linha, coluna - 1);

                        } catch (PoltronaException p) {
                            p = new PoltronaException();
                            System.out.println(p.getMessage());
                            erro = true;
                            break;
                        }
                    }
                    if(erro) {
                        continue;
                    }
                    else {
                        System.out.println("Poltrona(s) selecionada(s) com sucesso.\n");
                    }

                    System.out.println("Selecione a opção abaixo:\n[1] Meia\n[2] Inteira\n[3] Crítico" +
                            "\n[4] Meia idoso\n[5] Meia Itaú\n[6] Meia Bradesco");
                    int desejo2 = in.nextInt();

                    System.out.println("---------------------------------");

                    // Terceira exceção a ser tratada (se filme se encontra em cartaz ou não):
                    if (desejo2 == 1) {
                        Compra estudante = new CompraEstudante(quantidade);
                        try {
                            System.out.println("Será um total de R$ " + estudante.realizarCompraIngresso(filmeEscolhido));
                        } catch (FilmeException fl) {
                            fl = new FilmeException();
                            System.out.println(fl.getMessage());
                        } 
                    } else if (desejo2 == 2) {
                        Compra geral = new CompraGeral(quantidade);
                        try {
                            System.out.println("Será um total de R$ " + geral.realizarCompraIngresso(filmeEscolhido));
                        } catch (FilmeException fl) {
                            fl = new FilmeException();
                            System.out.println(fl.getMessage());
                        } 
                    } else if (desejo2 == 3) {
                        Compra critico = new CompraCritico(quantidade);
                        try {
                            System.out.println("Será um total de R$ " + critico.realizarCompraIngresso(filmeEscolhido));
                        } catch (FilmeException fl) {
                            fl = new FilmeException();
                            System.out.println(fl.getMessage());
                        } 
                    } else {
                        CupomPromocional algumCupom = CupomPromocional.IDOSO;
                        Compra cupom = new CompraCupom(quantidade, algumCupom);
                        try {
                            System.out.println("Será um total de R$ " + cupom.realizarCompraIngresso(filmeEscolhido));
                        } catch (FilmeException fl) {
                            fl = new FilmeException();
                            System.out.println(fl.getMessage());
                        } 
                    }
                } else {
                    // Comprar comida
                    Compra compra = new CompraGeral();
                    System.out.println("O que você deseja comprar?\n[1] Pipoca \n[2] Chocolate\n[3] Refrigerante" +
                            "\n[4] Bala\n[5] Água");
                    int comida = in.nextInt();

                    System.out.println("Quantos? ");
                    int quantidade2 = in.nextInt();

                    if (comida == 1) {
                        compra.setPipoca(quantidade2);
                    }
                    if (comida == 2) {
                        compra.setChocolate(quantidade2);
                    }
                    if (comida == 3) {
                        compra.setRefrigerante(quantidade2);
                    }
                    if (comida == 4) {
                        compra.setBala(quantidade2);
                    } else {
                        compra.setAgua(quantidade2);
                    }
                    System.out.println("Será um total de R$ " + compra.realizarCompraAlimentos());
                }
            } else {
                // Teste das listas de filmes e usuários.
                Administrador adm = new Administrador("a", 5, "s", 200, 4);
                Funcionario fc = new Funcionario("a", 5, "s", 200);
                LinkedList<Usuario> us = new LinkedList<Usuario>();

                Usuarios usuarios = new Usuarios(us);
                Usuario p1 = new Usuario("teste", "teste", "teste", 15, "teste", "teste", "teste", "teste", "teste");
                Usuario p2 = new Usuario("teste", "teste", "teste", 20, "teste", "teste", "teste", "teste", "teste");
                Usuario p3 = new Usuario("teste", "teste", "teste", 30, "teste", "teste", "teste", "teste", "teste");

                Filme filme4 = new Filme("Avatar", 120, "Sinopse aqui", 20, null, true, 14);
                Filme filme5 = new Filme("Mario", 120, "Sinopse aqui", 20, null, true, 16);
                Filme filme6 = new Filme("Pânico 6", 120, "Sinopse aqui", 20, null, true, 20);

                adm.adicionarUsuario(usuarios, p1);
                adm.adicionarUsuario(usuarios, p2);
                adm.adicionarUsuario(usuarios, p3);
                adm.excluirUsuario(usuarios, p1);
                adm.alterarUsuario(usuarios, p2, p1);

                fc.incluirFilme(filmes, filme4);
                fc.incluirFilme(filmes, filme5);
                fc.incluirFilme(filmes, filme6);
                fc.excluirFilme(filmes, filme5);

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
