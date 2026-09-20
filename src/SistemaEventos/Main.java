package SistemaEventos;

public class Main {

    public static void main(String[] args) {

        // Criando um participante
        Participante p1 = new Participante(
                "João",
                "123456789"
        );


        Participante p2 = new Participante(
                "Maria",
                "987654321"
        );

        Participante p3 = new Participante(
                "Pedro",
                "456789123"
        );

        // Criando um palestrante
        Palestrante palestrante1 = new Palestrante(
                "Carlos Silva",
                "Programação Java"
        );

        // Mostrando informações do participante
        System.out.println("=== Participante ===");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("CPF: " + p1.getCpf());

        System.out.println();

        // Mostrando informações do palestrante
        System.out.println("=== Palestrante ===");
        System.out.println("Nome: " + palestrante1.getNome());
        System.out.println("Especialidade: " + palestrante1.getEspecialidade());

        System.out.println();

        // Criando um evento
        Evento evento1 = new Evento(
                "Semana de Tecnologia",
                "IFBA",
                2
        );

        // Mostrando informações do evento
        System.out.println("=== Evento ===");
        System.out.println("Nome: " + evento1.getNome());
        System.out.println("Local: " + evento1.getLocal());
        System.out.println("Capacidade: " + evento1.getCapacidadeMaxima());

        System.out.println();

        // Criando uma atividade
        Atividade atividade1 = new Atividade(
                "Introducao a POO",
                "14:00",
                2,
                "Laboratorio 1",
                palestrante1,
                evento1
        );

        // Criando uma segunda atividade
        Atividade atividade2 = new Atividade(
                "Java Avancado",
                "14:00",
                2,
                "Laboratorio 1",
                palestrante1,
                evento1
        );



        // Mostrando informações da atividade
        System.out.println("=== Atividade ===");
        System.out.println("Nome: " + atividade1.getNome());
        System.out.println("Horario: " + atividade1.getHorario());
        System.out.println("Duracao: " + atividade1.getDuracao() + " horas");
        System.out.println("Local: " + atividade1.getLocal());
        System.out.println("Palestrante: " + atividade1.getPalestrante().getNome());
        System.out.println("Evento: " + atividade1.getEvento().getNome());

        System.out.println();

        // Testando inscrição
        evento1.adicionarParticipante(p1);

        // Tentando inscrever o mesmo participante novamente
        evento1.adicionarParticipante(p1);

        // Inscrevendo segundo participante
        evento1.adicionarParticipante(p2);

        // Tentando ultrapassar a capacidade
        evento1.adicionarParticipante(p3);



        System.out.println();

        // Testando atividade
        evento1.adicionarAtividade(atividade1);
        evento1.adicionarAtividade(atividade2);

        Participante encontrado = evento1.buscarParticipante("123456789");

        if (encontrado != null) {
            System.out.println("Participante encontrado: " + encontrado.getNome());
        } else {
            System.out.println("Participante nao encontrado.");
        }



    }
}