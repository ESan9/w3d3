package emanuelesanna.w3d3.ese3;

public class Colonnello extends Ufficiale {

    @Override
    public String getGrado() {
        return "Colonnello";
    }

    @Override
    protected double getStipendio() {
        return 6000.00;
    }

    @Override
    protected void eseguiFunzioneSpecifica() {
        System.out.println(getGrado() + ": Comanda un reggimento e gestisce la strategia a livello operativo.");
    }

    @Override
    public void gestisciComando(String comando) {
        System.out.println("-> Comando ricevuto da " + getGrado() + " (Stipendio: " + getStipendio() + "€)");

        if (comando.equalsIgnoreCase("Strategia Operativa")) {
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