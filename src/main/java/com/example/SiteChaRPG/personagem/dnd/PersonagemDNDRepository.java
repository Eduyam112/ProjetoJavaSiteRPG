package com.example.SiteChaRPG.personagem.dnd;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemDNDRepository extends JpaRepository<PersonagemDND, Long> {
}
