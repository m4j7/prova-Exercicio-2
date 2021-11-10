package main.Controller;

import main.Dao.ClienteDao;
import main.Model.Clientes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {


    List<Clientes> listaCliente = new ArrayList<Clientes>();


    public void cadastraCategoria(Clientes clientes) throws IOException {

        ClienteDao CD = new ClienteDao();
        CD.cadastraCliente();
        listaCliente.add(clientes);

    }

    public List <Clientes> listarClientes() throws IOException {

        ClienteDao CD = new ClienteDao();
        return listaCliente;

    }

    public void editarClients() throws IOException {

        ClienteDao CD = new ClienteDao();
        CD.editaCliente();

    }

    public void removeCliente() throws IOException {

        ClienteDao CD = new ClienteDao();
        CD.removeCliente();

    }










}
