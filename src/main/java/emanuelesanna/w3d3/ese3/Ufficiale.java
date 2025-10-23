package emanuelesanna.w3d3.ese3;

public abstract class Ufficiale {
    protected Ufficiale responsabileSuccessivo;

    public void setResponsabileSuccessivo(Ufficiale responsabile) {
        this.responsabileSuccessivo = responsabile;
    }

    public abstract void gestisciComando(String comando);
    
    protected abstract void eseguiFunzioneSpecifica();

    protected abstract double getStipendio();

    protected abstract String getGrado();
}
