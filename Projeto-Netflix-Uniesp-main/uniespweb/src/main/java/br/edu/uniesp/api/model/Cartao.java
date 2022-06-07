package br.edu.uniesp.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Cartao {

    @Id
    @GeneratedValue
    private Integer Id;
    private Integer NumerCartao;
    private Date ValidCartao;
    private Integer Cvv;
    private String TitularCartao;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getNumerCartao() {
        return NumerCartao;
    }

    public void setNumerCartao(Integer numerCartao) {
        NumerCartao = numerCartao;
    }

    public Date getValidCartao() {
        return ValidCartao;
    }

    public void setValidCartao(Date validCartao) {
        ValidCartao = validCartao;
    }

    public Integer getNumeroSeguCartao() {
        return Cvv;
    }

    public void setNumeroSeguCartao(Integer numeroSeguCartao) {
        Cvv = numeroSeguCartao;
    }

    public String getTitularCartao() {
        return TitularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        TitularCartao = titularCartao;
    }
}

