package application.ports.outbound.log;

import core.domain.log.Log;

import java.util.UUID;

public interface ConsultarLogOutboundPort {
    Log consultar(UUID id);
}
