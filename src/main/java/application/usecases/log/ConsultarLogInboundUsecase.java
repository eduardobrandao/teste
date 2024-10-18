package application.usecases.log;

import application.ports.inbound.log.ConsultarLogInboundPort;
import application.ports.outbound.log.ConsultarLogOutboundPort;
import core.domain.log.Log;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class ConsultarLogInboundUsecase implements ConsultarLogInboundPort {

    private final ConsultarLogOutboundPort consultarLogOutboundPort;


    @Override
    public Log consultar(UUID id) {
        return consultarLogOutboundPort.consultar(id);
    }
}