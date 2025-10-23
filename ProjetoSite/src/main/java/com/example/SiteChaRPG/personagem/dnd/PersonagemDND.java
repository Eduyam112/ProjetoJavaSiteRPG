package com.example.SiteChaRPG.personagem.dnd;

import com.example.SiteChaRPG.personagem.PersonagemAbstract;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "personagem_dnd")
public class PersonagemDND extends PersonagemAbstract {

    // Atributos específicos de D&D
    private String raca;
    private Integer nivelDND;

    @Enumerated(EnumType.STRING)
    private ClassePersonagemDND classe;

    private int pontosDeVidaMaximos;
    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;

    public Integer getNivelDND() {
        return nivelDND;
    }

    public void setNivelDND(Integer nivelDND) {
        this.nivelDND = nivelDND;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public ClassePersonagemDND getClasse() {
        return classe;
    }

    public void setClasse(ClassePersonagemDND classe) {
        this.classe = classe;
    }

    public int getPontosDeVidaMaximos() {
        return pontosDeVidaMaximos;
    }

    public void setPontosDeVidaMaximos(int pontosDeVidaMaximos) {
        this.pontosDeVidaMaximos = pontosDeVidaMaximos;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }
}
