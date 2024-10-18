package adapters.outbound.repository.log;

import application.ports.outbound.log.ConsultarLogOutboundPort;
import core.domain.log.Log;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class LogOutboundAdapter implements ConsultarLogOutboundPort {

    private final LogRepository logRepository;

    @Override
    public Log consultar(UUID id) {
        return logRepository.findByLog(id).toDomain();
    }
}
