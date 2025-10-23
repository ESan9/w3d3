package emanuelesanna.w3d3.ese1;

import java.util.Date;

public class Info {
    private String nome;
    private String cognome;
    private Date dataDiNascita;

    // Costruttore
    public Info(String nome, String cognome, Date dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    // Metodi per l'accesso ai dati
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    // Metodi per la modifica dei dati (non usati nell'Adapter, ma per completezza)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
}
