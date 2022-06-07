package br.edu.uniesp.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Serie {

    @Id
    @GeneratedValue
    private Integer Id;
    private String Titulo;
    private Integer Ano;
    private Integer TempoDeSerie;
    private String Relevancia;
    private String Sinopse;
    private String Trailer;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Integer getAno() {
        return Ano;
    }

    public void setAno(Integer ano) {
        Ano = ano;
    }

    public Integer getTempoDeSerie() {
        return TempoDeSerie;
    }

    public void setTempoDeSerie(Integer tempoDeSerie) {
        TempoDeSerie = tempoDeSerie;
    }

    public String getRelevancia() {
        return Relevancia;
    }

    public void setRelevancia(String relevancia) {
        Relevancia = relevancia;
    }

    public String getSinopse() {
        return Sinopse;
    }

    public void setSinopse(String sinopse) {
        Sinopse = sinopse;
    }

    public String getTrailer() {
        return Trailer;
    }

    public void setTrailer(String trailer) {
        Trailer = trailer;
    }
}
