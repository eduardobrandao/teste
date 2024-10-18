package adapters.outbound.repository.cep;

import core.domain.cep.Cep;
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
public class CepEntity implements Serializable {

    @EqualsAndHashCode.Include
    private UUID id;
    private String cep;
    private String endereco;
    private LocalDateTime horarioConsulta;

    public Cep toDomain() {
        return new Cep(
                id,
                cep,
                endereco,
                horarioConsulta
        );
    }

    public Cep convertToCep() {
        return new Cep(
                id,
                cep,
                endereco,
                horarioConsulta
        );
    }

}
