package pt5;

import java.time.LocalDate;

public interface ConcursoInscribible {
    void inscribirParticipante(Participante participante, LocalDate fechaInscripcion);
}
