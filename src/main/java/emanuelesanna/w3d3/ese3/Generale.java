package emanuelesanna.w3d3.ese3;

public class Generale extends Ufficiale {

    @Override
    public String getGrado() {
        return "Generale";
    }

    @Override
    protected double getStipendio() {
        return 8500.00;
    }

    @Override
    protected void eseguiFunzioneSpecifica() {
        System.out.println(getGrado() + ": Prende decisioni strategiche di alto livello e politiche militari.");
    }

    @Override
    public void gestisciComando(String comando) {
        System.out.println("-> Comando ricevuto da " + getGrado() + " (Stipendio: " + getStipendio() + "€)");

        if (comando.equalsIgnoreCase("Decisioni Strategiche")) {
            System.out.println(getGrado() + " gestisce il comando: " + comando + ".");
            eseguiFunzioneSpecifica();
        } else {
            System.out.println(getGrado() + " non può gestire il comando: " + comando + ". Nessun altro ufficiale è disponibile.");
        }
    }
}
