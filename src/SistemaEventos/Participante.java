package SistemaEventos;

public class Participante {
    private String nome;
    private String cpf;


    public Participante (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
