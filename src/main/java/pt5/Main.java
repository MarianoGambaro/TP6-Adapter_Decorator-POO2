package pt5;

import java.time.LocalDate;

public class Main {
    static void main() {

        ConcursoInscribible concursoComun = new Concurso(LocalDate.now(), LocalDate.now().plusDays(5));

        //lo envolvuelvo en el decorador para que envie email
        ConcursoConEmail concursoConEmail = new ConcursoConEmail(concursoComun,
                "sandbox.smtp.mailtrap.io", "176608dbaea411", "x", 587);

        Participante p = new Participante("Mariano", "mariano@gmail.com");

        concursoConEmail.inscribirParticipante(p, LocalDate.now());
    }
}
