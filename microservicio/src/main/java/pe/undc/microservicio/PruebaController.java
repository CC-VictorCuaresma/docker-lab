package pe.undc.microservicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PruebaController {

    @GetMapping("/prueba")
    public Map<String, String> prueba() {
        return Map.of(
            "id", "20491363402",
            "institucion", "Universidad Nacional de Cañete",
            "correo", "consultas@undc.edu.pe"
        );
    }
}
