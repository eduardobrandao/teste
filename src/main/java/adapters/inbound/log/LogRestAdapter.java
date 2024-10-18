package adapters.inbound.log;

import application.ports.inbound.log.ConsultarLogInboundPort;
import core.domain.log.Log;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/log")
public class LogRestAdapter {

    private final ConsultarLogInboundPort consultarLogInboundPort;

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Log> consultarLog(@RequestParam(value = "id") UUID id) {
        return ResponseEntity
                .status(OK)
                .body(consultarLogInboundPort.consultar(id));
    }

}
