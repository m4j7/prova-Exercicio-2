package main;
import main.View.ClienteView;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ClienteView CV = new ClienteView();
        CV.cadastrarCliente();
        CV.editarCliente();
        CV.removeCliente();


    }


    }

