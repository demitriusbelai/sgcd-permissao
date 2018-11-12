package br.unesp.sgcd.beans;

import java.io.Serializable;
import java.util.Date;

public class FaleConosco implements Serializable {
    private static final long serialVersionUID = 1L;
    private Short codigo;
    private String nome;
    private String email;
    private Date criacao;
    private char topo;

    public FaleConosco() {
    }

    public FaleConosco(Short codigo) {
        this.codigo = codigo;
    }

    public FaleConosco(Short codigo, String nome, String email, Date criacao, char topo) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.criacao = criacao;
        this.topo = topo;
    }

    public Short getCodigo() {
        return codigo;
    }

    public void setCodigo(Short codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        this.criacao = criacao;
    }

    public char getTopo() {
        return topo;
    }

    public void setTopo(char topo) {
        this.topo = topo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaleConosco)) {
            return false;
        }
        FaleConosco other = (FaleConosco) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.FaleConosco[ codigo=" + codigo + " ]";
    }

}
