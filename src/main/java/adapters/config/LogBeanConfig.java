package adapters.config;

import application.ports.inbound.log.ConsultarLogInboundPort;
import application.ports.outbound.log.ConsultarLogOutboundPort;
import application.usecases.log.ConsultarLogInboundUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogBeanConfig {

    @Bean
    public ConsultarLogInboundPort consultarLogInboundPort(ConsultarLogOutboundPort consultarLogOutboundPort) {
        return new ConsultarLogInboundUsecase(consultarLogOutboundPort);
    }
}
