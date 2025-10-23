package com.example.SiteChaRPG.personagem.dnd;

import com.example.SiteChaRPG.personagem.dnd.dto.PersonagemDNDRequestDTO;
import com.example.SiteChaRPG.personagem.dnd.dto.PersonagemDNDResponseDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonagemDNDService {
    @Autowired
    private PersonagemDNDRepository personagemRepository;

    // @Transactional garante que esta operação é "atômica"
    // Ou ela funciona por completo, ou ela falha por completo (rollback)
    @Transactional
    public PersonagemDNDResponseDTO criar(PersonagemDNDRequestDTO requestDto) {

        // === AQUI ESTÁ A LÓGICA DE NEGÓCIO ===

        // 1. **Mapeamento (Conversão):** Transforma o RequestDTO) instanciando uma nova Entidade)
        PersonagemDND personagemDND = new PersonagemDND();
        personagemDND.setNome(requestDto.getNome());
        personagemDND.setRaca(requestDto.getRaca());
        personagemDND.setClasse(requestDto.getClasse());

        personagemDND.setForca(requestDto.getForca());
        personagemDND.setDestreza(requestDto.getDestreza());
        personagemDND.setConstituicao(requestDto.getConstituicao());
        personagemDND.setInteligencia(requestDto.getInteligencia());
        personagemDND.setSabedoria(requestDto.getSabedoria());
        personagemDND.setCarisma(requestDto.getCarisma());

        // 2. **Regra de Negócio:** Define valores que o usuário não pode enviar
        personagemDND.setNivelDND(1);

        // 3. **Regra de Negócio (Exemplo):** Calcular pontos de vida
        // (Ex: 10 + modificador de constituição)
        int modConstituicao = (personagemDND.getConstituicao() - 10) / 2;
        personagemDND.setPontosDeVidaMaximos(10 + modConstituicao); // Exemplo de regra

        // 4. **Persistência:** Pede ao "Estoque" para salvar o ingrediente
        PersonagemDND personagemDNDsalvo = personagemRepository.save(personagemDND);

        // 5. **Mapeamento (Conversão):** Transforma a personagemDND salva no "Prato Pronto" (ResponseDTO)
        //    Usamos o construtor que criamos no DTO para facilitar
        return new PersonagemDNDResponseDTO(personagemDNDsalvo);
    }
}
