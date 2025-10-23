package emanuelesanna.w3d3.ese3;

public class Capitano extends Ufficiale {

    @Override
    public String getGrado() {
        return "Capitano";
    }

    @Override
    protected double getStipendio() {
        return 3500.00;
    }

    @Override
    protected void eseguiFunzioneSpecifica() {
        System.out.println(getGrado() + ": Comanda una compagnia e pianifica operazioni tattiche.");
    }

    @Override
    public void gestisciComando(String comando) {
        System.out.println("-> Comando ricevuto da " + getGrado() + " (Stipendio: " + getStipendio() + "€)");

        if (comando.equalsIgnoreCase("Pianifica Operazione")) {
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
