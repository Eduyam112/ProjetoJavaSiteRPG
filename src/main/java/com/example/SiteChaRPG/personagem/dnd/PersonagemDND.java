package com.example.SiteChaRPG.personagem.dnd;

import com.example.SiteChaRPG.personagem.PersonagemAbstract;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "personagem_dnd") // Tabela específica para D&D
public class PersonagemDND extends PersonagemAbstract {

    // Atributos específicos de D&D
    private String raca;

    @Enumerated(EnumType.STRING)
    private ClassePersonagemDND classe; // O Enum que criamos antes!

    private int pontosDeVidaMaximos;
    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;

}
