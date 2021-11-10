package main.View;
import main.Controller.ClienteController;
import main.Controller.MensagemController;
import main.Model.Clientes;

import java.io.IOException;
import java.util.*;

public class ClienteView {

    Scanner leitor = new Scanner(System.in);
    Clientes clientes = new Clientes();
    ClienteController CC = new ClienteController();
    MensagemView MV = new MensagemView();

    private long idselecionado;

    public void menu () throws IOException {

        int opcao = 5;

        do {
            do {
                System.out.println("Escolha uma das opçoes abaixo");
                System.out.println("1 - Acessar cliente");
                System.out.println("2 - Cadastrar cliente");
                System.out.println("3 - Editar cliente");
                System.out.println("4 - Remover cliente");
                System.out.println("----------------------------");
                System.out.print("Digite aqui sua opção: ");
                opcao = leitor.nextInt();

            } while (opcao == 5);

            switch (opcao) {
                case 1:
                    this.idselecionado = acessarIdCliente();
                    MV.menu(idselecionado);

                    System.out.println("5 - voltar");
                   opcao = leitor.nextInt();
                    break;

                case 2:

                    cadastrarCliente();
                    System.out.println("5 - voltar");
                    opcao = leitor.nextInt();
                    break;

                case 3:
                    editarCliente();
                    System.out.println("5 - voltar");
                    opcao = leitor.nextInt();
                    break;

                case 4:
                    removeCliente();
                    System.out.print("5 - voltar ");
                    opcao = leitor.nextInt();
                    break;


                default:
                    System.out.println("Opção inválida");
                    System.out.println("4 - voltar");
                    opcao = leitor.nextInt();
                    break;
            }
        } while(opcao != 0);

    }




    public void cadastrarCliente() throws IOException {

            Clientes clientes = new Clientes();

            System.out.println("Informe o Nome:");
            clientes.setNome(leitor.next());
            System.out.println("Informe o ID:");
            clientes.setId(leitor.nextLong());

            CC.cadastraCategoria(clientes);

        }

        public void editarCliente() throws IOException {


            CC.listarClientes();

            System.out.println(CC.listarClientes());

            System.out.println("Qual categoria voce deseja editar:");
            String nome = leitor.next();

            CC.editarClients();

        }

        public void removeCliente () throws IOException {


            CC.listarClientes();

            System.out.println(CC.listarClientes());

            System.out.println("Qual produto voce deseja remover:");
            String nome = leitor.next();

            CC.removeCliente();

        }

     public long acessarIdCliente (){

         System.out.println("Qual cliente voce desejar enviar uma mensagem:");
         int Idseleciona = leitor.nextInt();

         return CC.acessarCliente(Idseleciona);

     }


    }


