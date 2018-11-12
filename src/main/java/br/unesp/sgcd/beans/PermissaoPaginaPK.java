package br.unesp.sgcd.beans;

import java.io.Serializable;

public class PermissaoPaginaPK implements Serializable {
    private int codigoPagina;
    private String loginUsuario;

    public PermissaoPaginaPK() {
    }

    public PermissaoPaginaPK(int codigoPagina, String loginUsuario) {
        this.codigoPagina = codigoPagina;
        this.loginUsuario = loginUsuario;
    }

    public int getCodigoPagina() {
        return codigoPagina;
    }

    public void setCodigoPagina(int codigoPagina) {
        this.codigoPagina = codigoPagina;
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
        hash += (int) codigoPagina;
        hash += (loginUsuario != null ? loginUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermissaoPaginaPK)) {
            return false;
        }
        PermissaoPaginaPK other = (PermissaoPaginaPK) object;
        if (this.codigoPagina != other.codigoPagina) {
            return false;
        }
        if ((this.loginUsuario == null && other.loginUsuario != null) || (this.loginUsuario != null && !this.loginUsuario.equals(other.loginUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.PermissaoPaginaPK[ codigoPagina=" + codigoPagina + ", loginUsuario=" + loginUsuario + " ]";
    }

}
