package SistemaEventos;

public class Inscricao {

        private Participante participante;
        private Evento evento;

        public Inscricao(Participante participante, Evento evento) {
            this.participante = participante;
            this.evento = evento;
        }

        public Participante getParticipante() {
            return participante;
        }

        public Evento getEvento() {
            return evento;
        }
    }

