package br.unesp.sgcd.beans;

import java.io.Serializable;

public class GrupoPK implements Serializable {
    private String loginGrupo;
    private String loginUsuario;

    public GrupoPK() {
    }

    public GrupoPK(String loginGrupo, String loginUsuario) {
        this.loginGrupo = loginGrupo;
        this.loginUsuario = loginUsuario;
    }

    public String getLoginGrupo() {
        return loginGrupo;
    }

    public void setLoginGrupo(String loginGrupo) {
        this.loginGrupo = loginGrupo;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loginGrupo != null ? loginGrupo.hashCode() : 0);
        hash += (loginUsuario != null ? loginUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupoPK)) {
            return false;
        }
        GrupoPK other = (GrupoPK) object;
        if ((this.loginGrupo == null && other.loginGrupo != null) || (this.loginGrupo != null && !this.loginGrupo.equals(other.loginGrupo))) {
            return false;
        }
        if ((this.loginUsuario == null && other.loginUsuario != null) || (this.loginUsuario != null && !this.loginUsuario.equals(other.loginUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.GrupoPK[ loginGrupo=" + loginGrupo + ", loginUsuario=" + loginUsuario + " ]";
    }

}
