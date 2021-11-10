package main.Dao;

import java.io.*;

public class MensagemDao {


    public void cadastraMensagem() throws IOException {

        FileWriter arquivoTxt = new FileWriter("C:\\Users\\maria\\Log.txt", true);
        PrintWriter gravaArq = new PrintWriter(arquivoTxt);

        FileReader arquivoTxt1 = new FileReader("C:\\Users\\maria\\Log.txt");
        BufferedReader lerArq = new BufferedReader(arquivoTxt1);


        gravaArq.print("Uma mensagem foi cadastrado \n");

        gravaArq.flush();
        arquivoTxt.close();
        gravaArq.close();

    }

    public void removeMensagem() throws IOException {

        FileWriter arquivoTxt = new FileWriter("C:\\Users\\maria\\Log.txt", true);
        PrintWriter gravaArq = new PrintWriter(arquivoTxt);

        FileReader arquivoTxt1 = new FileReader("C:\\Users\\maria\\Log.txt");
        BufferedReader lerArq = new BufferedReader(arquivoTxt1);


        gravaArq.print("Uma mensagem foi removido \n");

        gravaArq.flush();
        arquivoTxt.close();
        gravaArq.close();

    }

    public void editaMensagem() throws IOException {

        FileWriter arquivoTxt = new FileWriter("C:\\Users\\maria\\Log.txt", true);
        PrintWriter gravaArq = new PrintWriter(arquivoTxt);
        FileReader arquivoTxt1 = new FileReader("C:\\Users\\maria\\Log.txt");
        BufferedReader lerArq = new BufferedReader(arquivoTxt1);


        gravaArq.print("Uma mensagem foi editada \n");

        gravaArq.flush();
        arquivoTxt.close();
        gravaArq.close();

    }

}
