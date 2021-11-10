package main.Model;

public class Clientes {

    private String nome;
    private long id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Clientes(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    public Clientes() {
    }

    @Override
    public String toString() {
        return "ClientesModel{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
