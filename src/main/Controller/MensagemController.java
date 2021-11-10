package main.Controller;

import main.Dao.ClienteDao;
import main.Dao.MensagemDao;
import main.Model.Clientes;
import main.Model.Mensagens;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MensagemController {

    private List<Mensagens> listaMensagem = new ArrayList<Mensagens>();


    public void cadastraMensagem(Mensagens mensagens) throws IOException {

        MensagemDao MD = new MensagemDao();
        MD.cadastraMensagem();
        listaMensagem.add(mensagens);

    }

    public List <Mensagens> listarMensagem(long id) {

        List<Mensagens> clientList2 = new ArrayList<Mensagens>();


        for(int i= 0; i < listaMensagem.size(); i++){
            if(listaMensagem.get(i).getIdCliente() == id){
                clientList2.add(listaMensagem.get(i));
            }
        }


        return clientList2;

    }

    public void editarMensagem() throws IOException {

        MensagemDao CD = new MensagemDao();
        CD.editaMensagem();

    }

    public void removeMensagem() throws IOException {

        MensagemDao CD = new MensagemDao();
        CD.removeMensagem();

    }









}
