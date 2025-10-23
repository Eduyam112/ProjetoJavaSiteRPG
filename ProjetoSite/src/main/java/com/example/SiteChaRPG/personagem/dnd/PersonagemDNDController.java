package com.example.SiteChaRPG.personagem.dnd;

import com.example.SiteChaRPG.personagem.dnd.dto.PersonagemDNDRequestDTO;
import com.example.SiteChaRPG.personagem.dnd.dto.PersonagemDNDResponseDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/personagens/dnd")
public class PersonagemDNDController {
    @Autowired
    private PersonagemDNDService personagemService;

    // Mapeia para POST /personagens/dnd
    @PostMapping
    public ResponseEntity<PersonagemDNDResponseDTO> criar(
            @Valid @RequestBody PersonagemDNDRequestDTO requestDto
    ) {
        // 1. O Controller recebe o RequestDTO
        //    @Valid diz ao Spring: "Valide este objeto!" Se falhar, retorna 400 Bad Request.
        // 2. Passa o Pedido para o Service
        PersonagemDNDResponseDTO responseDto = personagemService.criar(requestDto);

        // 3. O Controller recebe o "Prato Pronto" (ResponseDTO) do cozinheiro

        // 4. Entrega o Prato para o cliente.
        //    Retorna 201 Created com a localização do novo recurso
        URI location = URI.create("/personagens/dnd/" + responseDto.getId());
        return ResponseEntity.created(location).body(responseDto);
    }
}
