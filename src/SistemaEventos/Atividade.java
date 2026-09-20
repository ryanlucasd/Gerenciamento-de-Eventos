package SistemaEventos;

public class Atividade {

    private String nome;
    private String horario;
    private int duracao;
    private String local;
    private Palestrante palestrante;
    private Evento evento;

    public Atividade(String nome, String horario, int duracao, String local,
                     Palestrante palestrante, Evento evento) {

        this.nome = nome;
        this.horario = horario;
        this.duracao = duracao;
        this.local = local;
        this.palestrante = palestrante;
        this.evento = evento;
    }

    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getLocal() {
        return local;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public Evento getEvento() {
        return evento;
    }
}