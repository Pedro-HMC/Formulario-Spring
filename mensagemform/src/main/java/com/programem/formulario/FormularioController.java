package com.programem.formulario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormularioController {
    @GetMapping("/formulario")
    public String formulario(Model model){
        model.addAttribute("formulario", new Formulario());
        return "formulario";
    }

    @PostMapping("/formulario")
    public String envioFormulario(@ModelAttribute Formulario formulario){
        return "exibicao";
    }
    
}