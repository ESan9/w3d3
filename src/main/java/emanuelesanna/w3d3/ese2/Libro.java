package emanuelesanna.w3d3.ese2;

import java.util.List;

public class Libro implements ElementoLibro {
    private String titolo;
    private List<String> autori;
    private double prezzo;

    private List<ElementoLibro> elementi;

    public Libro(String titolo, List<String> autori, double prezzo, List<ElementoLibro> elementi) {
        this.titolo = titolo;
        this.autori = autori;
        this.prezzo = prezzo;
        this.elementi = elementi;
    }

    @Override
    public void stampa() {
        System.out.println("=== Stampa Libro: " + titolo + " ===");
        System.out.println("Autori: " + String.join(", ", autori));
        System.out.println("Prezzo: " + prezzo + "€");
        for (ElementoLibro elemento : elementi) {
            elemento.stampa();
        }
        System.out.println("================================");
    }

    @Override
    public int getNumeroPagine() {
        int totalePagine = 0;
        for (ElementoLibro elemento : elementi) {
            totalePagine += elemento.getNumeroPagine();
        }
        return totalePagine;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public List<String> getAutori() {
        return autori;
    }
}
