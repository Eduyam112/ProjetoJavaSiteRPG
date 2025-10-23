package com.example.SiteChaRPG.personagem.edp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemEDPRepository extends JpaRepository<PersonagemEDP, Long> {
}
