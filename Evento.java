package SistemaEventos;
import java.util.ArrayList;

public class Evento {

    private String nome;
    private String local;
    private int capacidadeMaxima;

    private ArrayList<Inscricao> inscricoes;
    private ArrayList<Atividade> atividades;

    public Evento(String nome, String local, int capacidadeMaxima) {
        this.nome = nome;
        this.local = local;
        this.capacidadeMaxima = capacidadeMaxima;

        inscricoes = new ArrayList<>();
        atividades = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void adicionarParticipante(Participante participante) {

        if (inscricoes.size() >= capacidadeMaxima) {
            System.out.println("Evento lotado.");
            return;
        }

        for (Inscricao inscricao : inscricoes) {

            if (inscricao.getParticipante().getCpf().equals(participante.getCpf())) {
                System.out.println("Participante ja esta inscrito.");
                return;
            }
        }

        Inscricao inscricao = new Inscricao(participante, this);

        inscricoes.add(inscricao);

        System.out.println("Participante inscrito com sucesso.");
    }

    public void adicionarAtividade(Atividade atividade) {

        for (Atividade a : atividades) {

            if (a.getHorario().equals(atividade.getHorario())
                    && a.getLocal().equals(atividade.getLocal())) {

                System.out.println("Erro: ja existe uma atividade neste horario e local.");
                return;
            }
        }

        atividades.add(atividade);

        System.out.println("Atividade adicionada com sucesso.");
    }

    public Participante buscarParticipante(String cpf) {
        return buscarParticipanteRecursivo(cpf, 0);
    }

    private Participante buscarParticipanteRecursivo(String cpf, int indice) {

        if (indice >= inscricoes.size()) {
            return null;
        }

        Participante participante = inscricoes.get(indice).getParticipante();

        if (participante.getCpf().equals(cpf)) {
            return participante;
        }

        return buscarParticipanteRecursivo(cpf, indice + 1);
    }


}

