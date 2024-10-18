package application.usecases.cep;

import application.ports.inbound.cep.ConsultarCepInboundPort;
import application.ports.outbound.cep.ConsultarCepOutboundPort;
import core.domain.cep.Cep;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConsultarCepInboundUsecase implements ConsultarCepInboundPort {

    private final ConsultarCepOutboundPort consultarCepOutboundPort;

    @Override
    public Cep consultar(String cep) {
        return consultarCepOutboundPort.consultar(cep);
    }
}
