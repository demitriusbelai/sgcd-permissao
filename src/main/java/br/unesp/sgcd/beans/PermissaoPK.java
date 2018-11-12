package br.unesp.sgcd.beans;

import java.io.Serializable;

public class PermissaoPK implements Serializable {
    private int codigoMenu;
    private String loginUsuario;

    public PermissaoPK() {
    }

    public PermissaoPK(int codigoMenu, String loginUsuario) {
        this.codigoMenu = codigoMenu;
        this.loginUsuario = loginUsuario;
    }

    public int getCodigoMenu() {
        return codigoMenu;
    }

    public void setCodigoMenu(int codigoMenu) {
        this.codigoMenu = codigoMenu;
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
        hash += (int) codigoMenu;
        hash += (loginUsuario != null ? loginUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermissaoPK)) {
            return false;
        }
        PermissaoPK other = (PermissaoPK) object;
        if (this.codigoMenu != other.codigoMenu) {
            return false;
        }
        if ((this.loginUsuario == null && other.loginUsuario != null) || (this.loginUsuario != null && !this.loginUsuario.equals(other.loginUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.PermissaoPK[ codigoMenu=" + codigoMenu + ", loginUsuario=" + loginUsuario + " ]";
    }

}
