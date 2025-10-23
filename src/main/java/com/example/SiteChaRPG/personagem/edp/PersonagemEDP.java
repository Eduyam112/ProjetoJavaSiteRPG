package com.example.SiteChaRPG.personagem.edp;

import com.example.SiteChaRPG.personagem.PersonagemAbstract;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="personagem_edp")
public class PersonagemEDP extends PersonagemAbstract {

    private Integer vigorMaximo;
    private Integer vigorAtual;
    private Integer classeArmadura;

    private Integer forca;
    private Integer destreza;
    private Integer inteligencia;
    private Integer vontade;

    public Integer getVigorMaximo() {
        return vigorMaximo;
    }

    public void setVigorMaximo(Integer vigorMaximo) {
        this.vigorMaximo = vigorMaximo;
    }

    public Integer getVigorAtual() {
        return vigorAtual;
    }

    public void setVigorAtual(Integer vigorAtual) {
        this.vigorAtual = vigorAtual;
    }

    public Integer getClasseArmadura() {
        return classeArmadura;
    }

    public void setClasseArmadura(Integer classeArmadura) {
        this.classeArmadura = classeArmadura;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getDestreza() {
        return destreza;
    }

    public void setDestreza(Integer destreza) {
        this.destreza = destreza;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Integer getVontade() {
        return vontade;
    }

    public void setVontade(Integer vontade) {
        this.vontade = vontade;
    }
}
