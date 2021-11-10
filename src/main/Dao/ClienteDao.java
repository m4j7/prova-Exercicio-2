package main.Dao;
import java.io.*;
import java.util.*;

public class ClienteDao {

    public void cadastraCliente() throws IOException {

        FileWriter arquivoTxt = new FileWriter("C:\\Users\\maria\\Log.txt");
        PrintWriter gravaArq = new PrintWriter(arquivoTxt);

        FileReader arquivoTxt1 = new FileReader("C:\\Users\\maria\\Log.txt");
        BufferedReader lerArq = new BufferedReader(arquivoTxt1);


        gravaArq.print("Uma cliente foi cadastrado");

        gravaArq.flush();
        arquivoTxt.close();
        gravaArq.close();

    }

    public void removeCliente() throws IOException {

        FileWriter arquivoTxt = new FileWriter("C:\\Users\\maria\\Log.txt");
        PrintWriter gravaArq = new PrintWriter(arquivoTxt);

        FileReader arquivoTxt1 = new FileReader("C:\\Users\\maria\\Log.txt");
        BufferedReader lerArq = new BufferedReader(arquivoTxt1);


        gravaArq.print("Um cliente foi removido");

        gravaArq.flush();
        arquivoTxt.close();
        gravaArq.close();

    }

    public void editaCliente() throws IOException {

        FileWriter arquivoTxt = new FileWriter("C:\\Users\\maria\\Log.txt");
        PrintWriter gravaArq = new PrintWriter(arquivoTxt);
        FileReader arquivoTxt1 = new FileReader("C:\\Users\\maria\\Log.txt");
        BufferedReader lerArq = new BufferedReader(arquivoTxt1);


        gravaArq.print("Uma cliente foi editado");

        gravaArq.flush();
        arquivoTxt.close();
        gravaArq.close();

    }






}
