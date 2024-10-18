package adapters.inbound.cep;

import application.ports.inbound.cep.ConsultarCepInboundPort;
import core.domain.cep.Cep;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/cep")
public class CepRestAdapter {

    private final ConsultarCepInboundPort consultarCepInboundPort;

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Cep> consultarCep(@RequestParam(value = "cep") String cep) {
        return ResponseEntity
                .status(OK)
                .body(consultarCepInboundPort.consultar(cep));
    }

}
