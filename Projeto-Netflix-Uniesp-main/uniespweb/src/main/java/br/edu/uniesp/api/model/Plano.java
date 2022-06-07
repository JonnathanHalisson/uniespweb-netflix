package br.edu.uniesp.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Plano {
    @Id
    @GeneratedValue
    private Integer Id;
    private String PlanoBasico;
    private String PlanoPadrao;
    private String PlanoPremium;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getPlanoBasico() {
        return PlanoBasico;
    }

    public void setPlanoBasico(String planoBasico) {
        PlanoBasico = planoBasico;
    }

    public String getPlanoPadrao() {
        return PlanoPadrao;
    }

    public void setPlanoPadrao(String planoPadrao) {
        PlanoPadrao = planoPadrao;
    }

    public String getPlanoPremium() {
        return PlanoPremium;
    }

    public void setPlanoPremium(String planoPremium) {
        PlanoPremium = planoPremium;
    }
}
