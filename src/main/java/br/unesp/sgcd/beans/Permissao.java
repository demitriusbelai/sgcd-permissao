package br.unesp.sgcd.beans;

import java.io.Serializable;
import java.util.Date;

public class Permissao implements Serializable {
    private static final long serialVersionUID = 1L;
    private PermissaoPK permissaoPK;
    private String acesso;
    private Date criacao;
    private Usuario usuario;
    private Menu menu;

    public Permissao() {
    }

    public Permissao(PermissaoPK permissaoPK) {
        this.permissaoPK = permissaoPK;
    }

    public Permissao(PermissaoPK permissaoPK, String acesso, Date criacao) {
        this.permissaoPK = permissaoPK;
        this.acesso = acesso;
        this.criacao = criacao;
    }

    public Permissao(int codigoMenu, String loginUsuario) {
        this.permissaoPK = new PermissaoPK(codigoMenu, loginUsuario);
    }

    public PermissaoPK getPermissaoPK() {
        return permissaoPK;
    }

    public void setPermissaoPK(PermissaoPK permissaoPK) {
        this.permissaoPK = permissaoPK;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
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

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permissaoPK != null ? permissaoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permissao)) {
            return false;
        }
        Permissao other = (Permissao) object;
        if ((this.permissaoPK == null && other.permissaoPK != null) || (this.permissaoPK != null && !this.permissaoPK.equals(other.permissaoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.Permissao[ permissaoPK=" + permissaoPK + " ]";
    }

}
