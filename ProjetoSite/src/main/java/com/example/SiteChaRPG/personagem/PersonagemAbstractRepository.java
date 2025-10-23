package com.example.SiteChaRPG.personagem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemAbstractRepository extends JpaRepository<PersonagemAbstract, Long> {
}
