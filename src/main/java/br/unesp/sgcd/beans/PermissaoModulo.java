package br.unesp.sgcd.beans;

import java.io.Serializable;
import java.util.Date;

public class PermissaoModulo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer codigo;
    private Date dataCriacao;
    private Usuario loginUsuario;
    private Modulo codigoModulo;

    public PermissaoModulo() {
    }

    public PermissaoModulo(Integer codigo) {
        this.codigo = codigo;
    }

    public PermissaoModulo(Integer codigo, Date dataCriacao) {
        this.codigo = codigo;
        this.dataCriacao = dataCriacao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Usuario getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(Usuario loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public Modulo getCodigoModulo() {
        return codigoModulo;
    }

    public void setCodigoModulo(Modulo codigoModulo) {
        this.codigoModulo = codigoModulo;
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
        if (!(object instanceof PermissaoModulo)) {
            return false;
        }
        PermissaoModulo other = (PermissaoModulo) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.PermissaoModulo[ codigo=" + codigo + " ]";
    }

}
