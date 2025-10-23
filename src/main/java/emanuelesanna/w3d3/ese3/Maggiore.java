package emanuelesanna.w3d3.ese3;

public class Maggiore extends Ufficiale {

    @Override
    public String getGrado() {
        return "Maggiore";
    }

    @Override
    protected double getStipendio() {
        return 4500.00;
    }

    @Override
    protected void eseguiFunzioneSpecifica() {
        System.out.println(getGrado() + ": È un ufficiale di staff e coordina le unità di battaglione.");
    }

    @Override
    public void gestisciComando(String comando) {
        System.out.println("-> Comando ricevuto da " + getGrado() + " (Stipendio: " + getStipendio() + "€)");

        if (comando.equalsIgnoreCase("Coordinamento Staff")) {
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
