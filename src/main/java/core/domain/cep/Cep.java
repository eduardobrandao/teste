package core.domain.cep;

import java.time.LocalDateTime;
import java.util.UUID;

public class Cep {

    private UUID id;
    private String cep;
    private String endereco;
    private LocalDateTime horarioConsulta;

    public Cep() {
    }

    public Cep(UUID id, String cep, String endereco, LocalDateTime horarioConsulta) {
        this.id = id;
        this.cep = cep;
        this.endereco = endereco;
        this.horarioConsulta = horarioConsulta;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDateTime getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(LocalDateTime horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }


}
