package application.ports.outbound.cep;

import core.domain.cep.Cep;

public interface ConsultarCepOutboundPort {
    Cep consultar(String cep);
}
