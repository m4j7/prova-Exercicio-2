package main.View;

import main.Controller.MensagemController;
import main.Model.Mensagens;

import java.io.IOException;
import java.util.Scanner;

public class MensagemView {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    MensagemController MC = new MensagemController();

    public void menu (long id) throws IOException {

        int opcao = 4;

        do {
            do {
                System.out.println("Escolha uma das opçoes abaixo");
                System.out.println("1 - Cadastrar mensagem");
                System.out.println("2 - Editar mensagem");
                System.out.println("3 - Remover mensagem");
                System.out.println("4 - Mostrar mensagem");
                System.out.println("----------------------------");
                System.out.print("Digite aqui sua opção: ");
                opcao = scanner.nextInt();

            } while (opcao == 5);

            switch (opcao) {
                case 1:
                    cadastrarMensagem(id);
                    System.out.println("5 - voltar");
                    opcao = scanner.nextInt();

                    break;

                case 2:
                    editarMensagem(id);
                    System.out.println("5 - voltar");
                    opcao = scanner.nextInt();

                    break;

                case 3:
                    removeMensagem(id);
                    System.out.print("5 - voltar ");
                    opcao = scanner.nextInt();

                    break;

                case 4:
                    mostrarMensagem(id);
                    System.out.print("5 - voltar ");
                    opcao = scanner.nextInt();

                    break;

                default:
                    System.out.println("Opção inválida");
                    System.out.println("4 - voltar");
                    opcao = scanner.nextInt();
                    break;
            }
        } while(opcao != 0);

    }

    public void mostrarMensagem(long id){


        System.out.println(MC.listarMensagem(id));


    }


    public void cadastrarMensagem(long id) throws IOException {

        Mensagens mensagens = new Mensagens();

        Scanner leitor = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Informe a mensagem:");
        mensagens.setMensagem(leitor.next());

        mensagens.setIdCliente(id);

        System.out.println(mensagens);
        MC.cadastraMensagem(mensagens);

    }

    public void editarMensagem(long id) throws IOException {



        System.out.println(MC.listarMensagem(id));

        System.out.println("Qual mensagem voce deseja editar:");
        String nome = scanner.next();

        MC.editarMensagem();

    }

    public void removeMensagem (long id) throws IOException {



        System.out.println(MC.listarMensagem(id));

        System.out.println("Qual mensagem voce deseja remover:");
        String nome = scanner.next();

        MC.removeMensagem();

    }







}
