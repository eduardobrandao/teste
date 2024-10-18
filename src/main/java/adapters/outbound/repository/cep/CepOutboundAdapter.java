package adapters.outbound.repository.cep;

import application.ports.outbound.cep.ConsultarCepOutboundPort;
import core.domain.cep.Cep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CepOutboundAdapter implements ConsultarCepOutboundPort {

    private final CepRepository cepRepository;

    @Override
    public Cep consultar(String cep) {
        return cepRepository.findByCep(cep).toDomain();
    }
}
