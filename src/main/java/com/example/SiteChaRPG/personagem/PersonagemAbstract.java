package com.example.SiteChaRPG.personagem;

import jakarta.persistence.*;

@Entity
@Table(name="personagem")
@Inheritance(strategy = InheritanceType.JOINED)
public class PersonagemAbstract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;
    private String backStory;
    private String descricaoAparencia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getBackStory() {
        return backStory;
    }

    public void setBackStory(String backStory) {
        this.backStory = backStory;
    }

    public String getDescricaoAparencia() {
        return descricaoAparencia;
    }

    public void setDescricaoAparencia(String descricaoAparencia) {
        this.descricaoAparencia = descricaoAparencia;
    }
}
