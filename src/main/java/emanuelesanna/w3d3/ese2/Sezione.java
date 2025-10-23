package emanuelesanna.w3d3.ese2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ElementoLibro {
    private String titolo;
    private List<ElementoLibro> elementi = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungiElemento(ElementoLibro elemento) {
        elementi.add(elemento);
    }

    public void rimuoviElemento(ElementoLibro elemento) {
        elementi.remove(elemento);
    }

    @Override
    public void stampa() {
        System.out.println("\nStampa Sezione: " + titolo);
        for (ElementoLibro elemento : elementi) {
            elemento.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int totalePagine = 0;

        for (ElementoLibro elemento : elementi) {
            totalePagine += elemento.getNumeroPagine();
        }
        return totalePagine;
    }
}
