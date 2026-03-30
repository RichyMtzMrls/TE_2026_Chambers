package mx.unam.aragon.ico.te.chambers.controlador;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/chambers")
public class paginaController {
    @GetMapping({"/principal", "/principal/"})
    public String mostrarPaginaPrincipal() {
        return "pagina_principal";
    }

    @GetMapping({"/Teoria-Basica", "/Teoria-Basica/"})
    public String mostrarTeoriaBasica() {
        return "apartado1";
    }

    @GetMapping({"/Patrones-de-Diseño", "/Patrones-de-Diseño/"})
    public String mostrarPatronesDeDiseno() {
        return "apartado2";
    }

    @GetMapping({"/Scrum", "/Scrum/"})
    public String mostrarScrum() {
        return "apartado3";
    }

    @GetMapping({"/Integrantes", "/Integrantes/"})
    public String mostrarIntegrantesDelEquipo() {
        return "apartado4";
    }
    
}
