package com.programem.formulario;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class paginainicialController {
    @GetMapping("/page0")
    public String inicial(){
        return "paginainicial";
    }
    
}