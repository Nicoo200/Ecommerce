package com.revisao.ecommerce.dto;

import com.revisao.ecommerce.entities.Categoria;

public class CategoriaDTO {

    private long id;
    private String nome;

    public CategoriaDTO(){

    }

    public CategoriaDTO(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public CategoriaDTO(Categoria entity){
        id = entity.getId();
        nome = entity.getNome();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
