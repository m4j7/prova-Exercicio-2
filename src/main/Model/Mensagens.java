package main.Model;

public class Mensagens {

     private String mensagem;
     private Long idCliente;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagens) {
        this.mensagem = mensagem;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Mensagens(String mensagem, Long idCliente) {
        this.mensagem = mensagem;
        this.idCliente = idCliente;
    }

    public Mensagens() {
    }

    @Override
    public String toString() {
        return "MensagensModel{" +
                "mensagem='" + mensagem + '\'' +
                ", idCliente=" + idCliente +
                '}';
    }
}
