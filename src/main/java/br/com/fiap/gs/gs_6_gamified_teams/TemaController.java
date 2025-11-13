package br.com.fiap.gs.gs_6_gamified_teams;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;
import java.util.LinkedHashMap;

@RestController
public class TemaController {

    
     
    @GetMapping("/info")
    public Map<String, String> getInfo() {
        
        Map<String, String> info = new LinkedHashMap<>();

        info.put("tema", "Soluções gamificadas para motivação em equipes hibridas");
        info.put("membro1", "Leonardo Franco de Oliveira");
        info.put("membro2", "Pablo Rangel");
        info.put("descricao", "Uma API que facilita a implementação de mecânicas de jogos para engajar equipes que trabalham tanto remotamente quanto presencialmente.");

        return info;
    }
}
