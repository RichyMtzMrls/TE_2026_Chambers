package com.chambers.demo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chambers")

public class ControladorPrincipal {
    @GetMapping("/principal/")
    public String mostrarPrincipal(){
        return "pagina_principal";
    }

    @GetMapping("/Teoria-Basica/")
    public String mostrarTeoriaBasica(){
        return "apartado1";
    }

    @GetMapping("/Patrones-de-Diseño/")
    public String mostrarPatronesdeDisenhio(){
        return "apartado2";
    }

    @GetMapping("/scrum/")
    public String mostrarScrum(){
        return "apartado3";
    }

    @GetMapping("/Integrantes/")
    public String mostrarIntegrantes(){
        return "apartado4";
    }


}
