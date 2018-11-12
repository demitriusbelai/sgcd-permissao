package br.unesp.sgcd.beans;

import java.io.Serializable;
import java.util.Date;

public class Grupo implements Serializable {
    private static final long serialVersionUID = 1L;
    protected GrupoPK grupoPK;
    private Date criacao;

    public Grupo() {
    }

    public Grupo(GrupoPK grupoPK) {
        this.grupoPK = grupoPK;
    }

    public Grupo(GrupoPK grupoPK, Date criacao) {
        this.grupoPK = grupoPK;
        this.criacao = criacao;
    }

    public Grupo(String loginGrupo, String loginUsuario) {
        this.grupoPK = new GrupoPK(loginGrupo, loginUsuario);
    }

    public GrupoPK getGrupoPK() {
        return grupoPK;
    }

    public void setGrupoPK(GrupoPK grupoPK) {
        this.grupoPK = grupoPK;
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        this.criacao = criacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grupoPK != null ? grupoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupo)) {
            return false;
        }
        Grupo other = (Grupo) object;
        if ((this.grupoPK == null && other.grupoPK != null) || (this.grupoPK != null && !this.grupoPK.equals(other.grupoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.Grupo[ grupoPK=" + grupoPK + " ]";
    }

}
