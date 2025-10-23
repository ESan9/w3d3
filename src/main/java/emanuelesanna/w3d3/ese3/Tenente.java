package emanuelesanna.w3d3.ese3;

public class Tenente extends Ufficiale {

    @Override
    public String getGrado() {
        return "Tenente";
    }

    @Override
    protected double getStipendio() {
        return 2500.00;
    }

    @Override
    protected void eseguiFunzioneSpecifica() {
        System.out.println(getGrado() + ": Esegue pattugliamenti di base e supervisiona le squadre più piccole.");
    }

    @Override
    public void gestisciComando(String comando) {
        System.out.println("-> Comando ricevuto da " + getGrado() + " (Stipendio: " + getStipendio() + "€)");

        if (comando.equalsIgnoreCase("Pattuglia")) {
            System.out.println(getGrado() + " gestisce il comando: " + comando + ".");
            eseguiFunzioneSpecifica();
        } else if (responsabileSuccessivo != null) {
            System.out.println(getGrado() + " non gestisce il comando, lo passa al " + responsabileSuccessivo.getGrado() + ".");
            responsabileSuccessivo.gestisciComando(comando);
        } else {
            System.out.println("Nessun ufficiale può gestire il comando: " + comando + ".");
        }
    }
}
