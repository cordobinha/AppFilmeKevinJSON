package com.example.opet.appfilmekevinjson;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by opet on 15/03/2019.
 */

public class Filme {

    @SerializedName("id")
    private long ID;

    private String nome;

    private Integer quantidadeAtores;

    private Date dataEstreia;

    public Filme(long ID, String nome, Integer quantidadeAtores, Date dataEstreia) {
        this.ID = ID;
        this.nome = nome;
        this.quantidadeAtores = quantidadeAtores;
        this.dataEstreia = dataEstreia;
    }

    public Filme() {

    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeAtores() {
        return quantidadeAtores;
    }

    public void setQuantidadeAtores(Integer quantidadeAtores) {
        this.quantidadeAtores = quantidadeAtores;
    }

    public Date getDataEstreia() {
        return dataEstreia;
    }

    public void setDataEstreia(Date dataEstreia) {
        this.dataEstreia = dataEstreia;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", quantidadeAtores=" + quantidadeAtores +
                ", dataEstreia=" + dataEstreia +
                '}';
    }
}
