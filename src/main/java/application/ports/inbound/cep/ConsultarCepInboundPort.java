package application.ports.inbound.cep;

import core.domain.cep.Cep;

public interface ConsultarCepInboundPort {
    Cep consultar(String cep);
}
