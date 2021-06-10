package com.thedevconf.swaggerui.resteasyjackson;

    

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Cacheable
public class Endereco extends PanacheEntity {

    @Column(length = 15, unique = false)
    public String cpf;

    @Column(length = 100, unique = false)
    public String logradouro;

    @Column(length = 50, unique = false)
    public String bairro;

    @Column(length = 50, unique = false)
    public String cidade;

    @Column(length = 2, unique = false)
    public String estado;

    @Column(length = 10, unique = false)
    public String cep;

    public Endereco() {

    }
    public Endereco(String cpf, String logradouro, String bairro, String cidade, String estado, String cep) {
        this.cpf = cpf;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }


}