package br.edu.uniesp.api.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Usuario  {

    @Id
    @GeneratedValue
    private Integer Id;
    private String Nome;
    private Date DataNascimento;
    private String Email;
    private String Senha;
    private Integer Cpf;
    private Integer Cnpj;

    public Integer getCpf() {
        return Cpf;
    }

    public void setCpf(Integer cpf) {
        Cpf = cpf;
    }

    public Integer getCnpj() {
        return Cnpj;
    }

    public void setCnpj(Integer cnpj) {
        Cnpj = cnpj;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }
}

