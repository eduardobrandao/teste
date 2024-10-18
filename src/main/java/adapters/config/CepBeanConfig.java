package adapters.config;

import application.ports.inbound.cep.ConsultarCepInboundPort;
import application.ports.outbound.cep.ConsultarCepOutboundPort;
import application.usecases.cep.ConsultarCepInboundUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CepBeanConfig {

    @Bean
    public ConsultarCepInboundPort consultarCepInboundPort(ConsultarCepOutboundPort consultarCepOutboundPort) {
        return new ConsultarCepInboundUsecase(consultarCepOutboundPort);
    }
}
