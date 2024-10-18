package adapters.outbound.repository.log;

import adapters.outbound.repository.cep.CepEntity;
import core.domain.log.Log;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Accessors(fluent = true)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class LogEntity implements Serializable {

    @EqualsAndHashCode.Include
    private UUID id;
    private CepEntity cep;
    private LocalDateTime horarioConsulta;
    private String resultadoConsulta;

    public Log toDomain() {
        return new Log(
                id,
                cep.convertToCep(),
                horarioConsulta,
                resultadoConsulta
        );
    }


}
