package br.com.fiap.gs.gs_6_gamified_teams;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Controller principal da aplicação.
 * Expõe o endpoint GET /info.
 */
@RestController
public class TemaController {

    /**
     * Endpoint GET /info
     * [cite_start]Retorna um JSON com os detalhes do tema e dos membros do grupo [cite: 34-40].
     */
    @GetMapping("/info")
    public Map<String, String> getInfo() {
        // Usamos LinkedHashMap para garantir a ordem das chaves
        Map<String, String> info = new LinkedHashMap<>();

        info.put("tema", "Soluções gamificadas para motivação em equipes hibridas");
        info.put("membro1", "Leonardo Franco de Oliveira");
        info.put("membro2", "Pablo Rangel");
        info.put("descricao", "Uma API que facilita a implementação de mecânicas de jogos para engajar equipes que trabalham tanto remotamente quanto presencialmente.");

        return info;
    }
}