package com.example.SiteChaRPG.personagem.dnd.dto;

import com.example.SiteChaRPG.personagem.dnd.PersonagemDND;

public class PersonagemDNDResponseDTO {
    private Long id;
    private String nome;
    private Integer nivel;
    private String raca;
    private String classe; // Note que convertemos o Enum para String, mais fácil para o front-end
    private Integer pontosDeVidaMaximos;
    private Integer forca;
    private Integer destreza;
    private Integer constituicao;
    private Integer inteligencia;
    private Integer sabedoria;
    private Integer carisma;

    // Construtor que facilita a conversão da Entidade para o DTO
    public PersonagemDNDResponseDTO(PersonagemDND entidade) {
        this.id = entidade.getId();
        this.nome = entidade.getNome();
        this.nivel = entidade.getNivelDND();
        this.raca = entidade.getRaca();
        this.classe = entidade.getClasse().name(); // Converte Enum para String (ex: "GUERREIRO")
        this.pontosDeVidaMaximos = entidade.getPontosDeVidaMaximos();
        this.forca = entidade.getForca();
        this.destreza = entidade.getDestreza();
        this.constituicao = entidade.getConstituicao();
        this.inteligencia = entidade.getInteligencia();
        this.sabedoria = entidade.getSabedoria();
        this.carisma = entidade.getCarisma();
    }

    // Getters (Setters não são estritamente necessários para um DTO de *resposta*)

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public Integer getNivel() { return nivel; }
    public String getRaca() { return raca; }
    public String getClasse() { return classe; }
    public Integer getPontosDeVidaMaximos() { return pontosDeVidaMaximos; }
    public Integer getForca() { return forca; }
    public Integer getDestreza() { return destreza; }
    public Integer getConstituicao() { return constituicao; }
    public Integer getInteligencia() { return inteligencia; }
    public Integer getSabedoria() { return sabedoria; }
    public Integer getCarisma() { return carisma; }
}
