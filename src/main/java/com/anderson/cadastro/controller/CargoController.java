package com.anderson.cadastro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anderson on 26/05/2019.
 */

@Controller
@RequestMapping("/cargos")
public class CargoController {
    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "/cargo/cadastro";
    }

    @GetMapping("/listar")
    public String listar() {
        return "/cargo/lista";
    }

}
