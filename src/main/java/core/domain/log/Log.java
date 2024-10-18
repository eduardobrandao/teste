package core.domain.log;

import core.domain.cep.Cep;

import java.time.LocalDateTime;
import java.util.UUID;

public class Log {

    private UUID id;
    private Cep cep;
    private LocalDateTime horarioConsulta;
    private String resultadoConsulta;

    public Log() {
    }

    public Log(UUID id, Cep cep, LocalDateTime horarioConsulta, String resultadoConsulta) {
        this.id = id;
        this.cep = cep;
        this.horarioConsulta = horarioConsulta;
        this.resultadoConsulta = resultadoConsulta;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

    public LocalDateTime getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(LocalDateTime horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public String getResultadoConsulta() {
        return resultadoConsulta;
    }

    public void setResultadoConsulta(String resultadoConsulta) {
        this.resultadoConsulta = resultadoConsulta;
    }
}
