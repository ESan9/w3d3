package emanuelesanna.w3d3.ese2;

public class Pagina implements ElementoLibro {
    private int numeroPagina;

    public Pagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    @Override
    public void stampa() {
        System.out.println("Stampa Pagina " + numeroPagina);
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}
