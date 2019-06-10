package com.anderson.cadastro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anderson on 26/05/2019.
 */
@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "/funcionario/cadastro";
    }

    @GetMapping("/listar")
    public String listar() {
        return "/funcionario/lista";
    }

}
