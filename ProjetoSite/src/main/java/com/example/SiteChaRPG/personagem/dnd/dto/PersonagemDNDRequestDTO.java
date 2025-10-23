package com.example.SiteChaRPG.personagem.dnd.dto;

import com.example.SiteChaRPG.personagem.dnd.ClassePersonagemDND;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * DTO usado para RECEBER dados do cliente para criar um novo PersonagemDND.
 * Note que ele não tem 'id' ou 'nivel', pois são definidos pelo back-end.
 */
public class PersonagemDNDRequestDTO {

    @NotBlank(message = "O nome não pode ser vazio.")
    private String nome;

    @NotBlank(message = "A raça não pode ser vazia.")
    private String raca;

    @NotNull(message = "A classe não pode ser nula.")
    private ClassePersonagemDND classe;

    // Assumindo que os atributos são rolados ou definidos na criação
    @NotNull
    @Min(value = 3, message = "Atributo deve ser no mínimo 3.")
    @Max(value = 18, message = "Atributo deve ser no máximo 18.")
    private Integer forca;

    @NotNull @Min(3) @Max(18)
    private Integer destreza;

    @NotNull @Min(3) @Max(18)
    private Integer constituicao;

    @NotNull @Min(3) @Max(18)
    private Integer inteligencia;

    @NotNull @Min(3) @Max(18)
    private Integer sabedoria;

    @NotNull @Min(3) @Max(18)
    private Integer carisma;

    // Getters e Setters (Necessários para o Spring converter JSON para Objeto)

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }
    public ClassePersonagemDND getClasse() { return classe; }
    public void setClasse(ClassePersonagemDND    classe) { this.classe = classe; }
    public Integer getForca() { return forca; }
    public void setForca(Integer forca) { this.forca = forca; }
    public Integer getDestreza() { return destreza; }
    public void setDestreza(Integer destreza) { this.destreza = destreza; }
    public Integer getConstituicao() { return constituicao; }
    public void setConstituicao(Integer constituicao) { this.constituicao = constituicao; }
    public Integer getInteligencia() { return inteligencia; }
    public void setInteligencia(Integer inteligencia) { this.inteligencia = inteligencia; }
    public Integer getSabedoria() { return sabedoria; }
    public void setSabedoria(Integer sabedoria) { this.sabedoria = sabedoria; }
    public Integer getCarisma() { return carisma; }
    public void setCarisma(Integer carisma) { this.carisma = carisma; }
}
