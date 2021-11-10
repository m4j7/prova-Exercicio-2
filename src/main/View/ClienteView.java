package main.View;
import main.Controller.ClienteController;
import main.Model.Clientes;

import java.io.IOException;
import java.util.*;

public class ClienteView {

    Scanner leitor = new Scanner(System.in);
    Clientes clientes = new Clientes();

    public void cadastrarCliente() throws IOException {

            ClienteController CC = new ClienteController();

            System.out.println("Informe o Nome:");
            clientes.setNome(leitor.next());
            System.out.println("Informe o ID:");
            clientes.setId(leitor.nextLong());

            CC.cadastraCategoria(clientes);

        }

        public void editarCliente() throws IOException {

            ClienteController CC = new ClienteController();

            System.out.println(CC.listarClientes());

            System.out.println("Qual categoria voce deseja editar:");
            String nome = leitor.next();

            CC.editarClients();

        }

        public void removeCliente () throws IOException {

            ClienteController CC = new ClienteController();

            System.out.println(CC.listarClientes());

            System.out.println("Qual produto voce deseja remover:");
            String nome = leitor.next();

            CC.removeCliente();

        }




    }


