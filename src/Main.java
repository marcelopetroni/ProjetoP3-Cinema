// USADO PARA TESTES
import java.util.LinkedList;
import java.util.Scanner;

import administracao.*;
import clientes.*;
import exceptions.*;
import exibicao.*;
import mercadoria.*;
import operacoes.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double horaFilme = 12;

        Poltrona poltronas = new Poltrona();
        // Testando exceção as exceções
        for (int i = 0; i < 5; i++) {
            System.out.println("Você é usuário ou adim?\n[1] Usuário\n[2] Adim");

            int resposta = in.nextInt();
            if (resposta == 1) {
                System.out.println("O que você deseja?\n[1] Comprar ingressos.\n[2] Comprar comida.");
                int desejo = in.nextInt();

                if (desejo == 1) {
                    Filme filme = new Filme("Avatar", 180, "Sinopse aqui", 20, null, true, horaFilme);
                    HorarioFilme verificacao = new HorarioFilme();
                    verificacao.disponibilidadePelaHora(filme);

                    System.out.println("Quantas poltronas você deseja? ");
                    int quantidade = in.nextInt();
                    poltronas.exibirCadeiras();

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
                        try {
                            poltronas.escolherPoltrona(linha, coluna - 1);

                        } catch (PoltronaException p) {
                            p = new PoltronaException();
                            System.out.println(p.getMessage());
                        }
                    }
                    System.out.println("Selecione a opção abaixo:\n[1] Meia\n[2] Inteira\n[3] Crítico" +
                            "\n[4] Meia idoso\n[5] Meia Itaú\n[6] Meia Bradesco");
                    int desejo2 = in.nextInt();

                    System.out.println("---------------------------------");

                    if (desejo2 == 1) {
                        Compra estudante = new CompraEstudante(quantidade);
                        try {
                            System.out.println("Poltrona selecionada com sucesso.");
                            System.out.println("Será um total de R$ " + estudante.realizarCompraIngresso(filme));
                        } catch (HorarioException hr) {
                            hr = new HorarioException();
                            System.out.println(hr.getMessage());
                        } catch (FilmeException fm) {
                            fm = new FilmeException();
                            System.out.println(fm.getMessage());
                        }
                    } else if (desejo2 == 2) {
                        Compra geral = new CompraGeral(quantidade);
                        try {
                            System.out.println("Poltrona selecionada com sucesso.");
                            System.out.println("Será um total de R$ " + geral.realizarCompraIngresso(filme));
                        } catch (HorarioException hr) {
                            hr = new HorarioException();
                            System.out.println(hr.getMessage());
                        } catch (FilmeException fm) {
                            fm = new FilmeException();
                            System.out.println(fm.getMessage());
                        }
                    } else if (desejo2 == 3) {
                        Compra critico = new CompraCritico(quantidade);
                        try {
                            System.out.println("Poltrona selecionada com sucesso.");
                            System.out.println("Será um total de R$ " + critico.realizarCompraIngresso(filme));
                        } catch (HorarioException hr) {
                            hr = new HorarioException();
                            System.out.println(hr.getMessage());
                        } catch (FilmeException fm) {
                            fm = new FilmeException();
                            System.out.println(fm.getMessage());
                        }
                    } else {
                        Compra cupom = new CompraCupom(quantidade);
                        try {
                            System.out.println("Poltrona selecionada com sucesso.");
                            System.out.println("Será um total de R$ " + cupom.realizarCompraIngresso(filme));
                        } catch (HorarioException hr) {
                            hr = new HorarioException();
                            System.out.println(hr.getMessage());
                        } catch (FilmeException fm) {
                            fm = new FilmeException();
                            System.out.println(fm.getMessage());
                        }
                    }
                } else {
                    // Comprar comida
                    Compra compra = new CompraGeral(50, 100, 20, 200, 60);
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
                    compra.realizarCompraAlimentos();
                }
            } else {
                // Teste das listas de filmes e usuários.
                Administrador adm = new Administrador("a", 5, "s", 200, 4);
                Funcionario fc = new Funcionario("a", 5, "s", 200);
                LinkedList<Usuario> us = new LinkedList<Usuario>();
                LinkedList<Filme> fm = new LinkedList<Filme>();

                Usuarios usuarios = new Usuarios(us);
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
