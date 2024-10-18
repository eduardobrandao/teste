package application.ports.inbound.log;

import core.domain.log.Log;

import java.util.UUID;

public interface ConsultarLogInboundPort {
    Log consultar(UUID id);
}
