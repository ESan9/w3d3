package emanuelesanna.w3d3;

import emanuelesanna.w3d3.ese1.DataSource;
import emanuelesanna.w3d3.ese1.Info;
import emanuelesanna.w3d3.ese1.InfoAdapter;
import emanuelesanna.w3d3.ese1.UserData;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class W3d3Application {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(1990, Calendar.OCTOBER, 15);
        Date dataNascita = cal.getTime();

        Info personaInfo = new Info("Mario", "Rossi", dataNascita);

        DataSource adapter = new InfoAdapter(personaInfo);

        UserData utente = new UserData();

        utente.getData(adapter);

        System.out.println("Nome completo: " + utente.getNomeCompleto());
        System.out.println("Età: " + utente.getEta());

//        Pagina p1 = new Pagina(1);
//        Pagina p2 = new Pagina(2);
//        Pagina p3 = new Pagina(3);
//        Pagina p4 = new Pagina(4);
//
//
//        Sezione sezA = new Sezione("Introduzione");
//        sezA.aggiungiElemento(p1);
//        sezA.aggiungiElemento(p2);
//
//        Sezione sottosezB = new Sezione("Capitolo 1.1 - Dettagli");
//        sottosezB.aggiungiElemento(p3);
//
//        Sezione sezB = new Sezione("Capitolo 1");
//        sezB.aggiungiElemento(sottosezB);
//        sezB.aggiungiElemento(p4);
//
//
//        Libro mioLibro = new Libro(
//                "Design Patterns Essenziali",
//                Arrays.asList("Erich Gamma", "Richard Helm"),
//                29.99,
//                Arrays.asList(sezA, sezB)
//        );
//
//        mioLibro.stampa();
//
//        sezB.stampa();
//
//        p1.stampa();
//
//        System.out.println("\nNumero totale pagine del Libro: " + mioLibro.getNumeroPagine());
//
//        System.out.println("Numero totale pagine di Sez B: " + sezB.getNumeroPagine());
//
//        Ufficiale tenente = new Tenente();
//        Ufficiale capitano = new Capitano();
//        Ufficiale maggiore = new Maggiore();
//        Ufficiale colonnello = new Colonnello();
//        Ufficiale generale = new Generale();
//
//        tenente.setResponsabileSuccessivo(capitano);
//        capitano.setResponsabileSuccessivo(maggiore);
//        maggiore.setResponsabileSuccessivo(colonnello);
//        colonnello.setResponsabileSuccessivo(generale);
//
//        System.out.println("--- Richiesta 1: Comando di basso livello (Gestito dal Tenente) ---");
//        tenente.gestisciComando("Pattuglia");
//
//        System.out.println("\n--- Richiesta 2: Comando di medio livello (Gestito dal Colonnello) ---");
//        tenente.gestisciComando("Strategia Operativa");
//
//        System.out.println("\n--- Richiesta 3: Comando di alto livello (Gestito dal Generale) ---");
//        tenente.gestisciComando("Decisioni Strategiche");
//
//        System.out.println("\n--- Richiesta 4: Comando non gestibile da nessuno ---");
//        tenente.gestisciComando("Comando Sconosciuto");
    }
}


