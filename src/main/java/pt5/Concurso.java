package pt5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso implements ConcursoInscribible {
    private static int cont = 1;

    private int id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private List<Participante> participantes;
    private List<Inscripcion> inscripciones;

    public Concurso(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.participantes = new ArrayList<>();
        this.inscripciones = new ArrayList<>();
        this.id = cont;
        cont++;
    }


    public void inscribirParticipante(Participante participante, LocalDate fechaInscripcion) {
        if (fechaInscripcion.isBefore(fechaInicio) || fechaInscripcion.isAfter(fechaFin)) {
            throw new RuntimeException("La inscripcion esta fuera de la fecha permitida");
        }
        participantes.add(participante);
        if (fechaInscripcion.equals(fechaInicio)) {
            participante.sumarPuntos(10);
        }
        Inscripcion inscripcion = new Inscripcion(participante, this, fechaInscripcion.atStartOfDay());
        inscripciones.add(inscripcion);
    }


    public int cantidadInscriptos() {
        return inscripciones.size();
    }

    public boolean estaInscripto(Participante par) {
        return participantes.contains(par);
    }

    public boolean primerDiaInscripto(LocalDate fechaInscripcion) {
        if (fechaInicio.equals(fechaInscripcion)) {
            return true;
        }
        return false;
    }


    public int getId() {
        return id;
    }

}


