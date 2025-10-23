package emanuelesanna.w3d3.ese1;

public class UserData {
    private String nomeCompleto;
    private int eta;
    
    public void getData(DataSource ds) {
        this.nomeCompleto = ds.getNomeCompleto();
        this.eta = ds.getEta();
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public int getEta() {
        return eta;
    }
}

