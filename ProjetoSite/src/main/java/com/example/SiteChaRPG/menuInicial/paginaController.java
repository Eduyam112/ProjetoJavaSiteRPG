package com.example.SiteChaRPG.menuInicial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class paginaController {

    @GetMapping("/")
    public String paginaInicial() {
        return "index";
    }

    @RequestMapping("dnd5e")
    public String dndBotao() {
        return "dnd";
    }

    @RequestMapping("edp")
    public String edpBotao() {
        return "edp";
    }

    @RequestMapping("dnd5e/addPersonagem")
    public String formNovoPersonagemDND() {
        return "add_PersonagemDND_form";
    }
}
