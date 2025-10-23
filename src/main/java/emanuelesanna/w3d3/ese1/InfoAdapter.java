package emanuelesanna.w3d3.ese1;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        // Combina nome e cognome
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        Date dataNascitaUtil = info.getDataDiNascita();

        LocalDate dataNascitaLocale = dataNascitaUtil.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        
        return Period.between(dataNascitaLocale, LocalDate.now()).getYears();
    }
}
