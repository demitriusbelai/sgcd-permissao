package br.unesp.sgcd.beans;

import java.io.Serializable;
import java.util.Date;

public class PermissaoPagina implements Serializable {
    private static final long serialVersionUID = 1L;
    private PermissaoPaginaPK permissaoPaginaPK;
    private Date criacao;
    private Usuario usuario;
    private Pagina pagina;

    public PermissaoPagina() {
    }

    public PermissaoPagina(PermissaoPaginaPK permissaoPaginaPK) {
        this.permissaoPaginaPK = permissaoPaginaPK;
    }

    public PermissaoPagina(PermissaoPaginaPK permissaoPaginaPK, Date criacao) {
        this.permissaoPaginaPK = permissaoPaginaPK;
        this.criacao = criacao;
    }

    public PermissaoPagina(int codigoPagina, String loginUsuario) {
        this.permissaoPaginaPK = new PermissaoPaginaPK(codigoPagina, loginUsuario);
    }

    public PermissaoPaginaPK getPermissaoPaginaPK() {
        return permissaoPaginaPK;
    }

    public void setPermissaoPaginaPK(PermissaoPaginaPK permissaoPaginaPK) {
        this.permissaoPaginaPK = permissaoPaginaPK;
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        this.criacao = criacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pagina getPagina() {
        return pagina;
    }

    public void setPagina(Pagina pagina) {
        this.pagina = pagina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permissaoPaginaPK != null ? permissaoPaginaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermissaoPagina)) {
            return false;
        }
        PermissaoPagina other = (PermissaoPagina) object;
        if ((this.permissaoPaginaPK == null && other.permissaoPaginaPK != null) || (this.permissaoPaginaPK != null && !this.permissaoPaginaPK.equals(other.permissaoPaginaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.PermissaoPagina[ permissaoPaginaPK=" + permissaoPaginaPK + " ]";
    }

}
