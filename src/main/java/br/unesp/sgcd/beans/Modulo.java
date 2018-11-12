package br.unesp.sgcd.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Modulo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer codigo;
    private String nome;
    private Date dataCriacao;
    private String servidorBD;
    private String usuarioBD;
    private String senhaBD;
    private String bancoBD;
    private List<PermissaoModulo> permissaoModuloList;
    private Usuario usuarioCriacao;

    public Modulo() {
    }

    public Modulo(Integer codigo) {
        this.codigo = codigo;
    }

    public Modulo(Integer codigo, String nome, Date dataCriacao, String servidorBD, String usuarioBD, String senhaBD, String bancoBD) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.servidorBD = servidorBD;
        this.usuarioBD = usuarioBD;
        this.senhaBD = senhaBD;
        this.bancoBD = bancoBD;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getServidorBD() {
        return servidorBD;
    }

    public void setServidorBD(String servidorBD) {
        this.servidorBD = servidorBD;
    }

    public String getUsuarioBD() {
        return usuarioBD;
    }

    public void setUsuarioBD(String usuarioBD) {
        this.usuarioBD = usuarioBD;
    }

    public String getSenhaBD() {
        return senhaBD;
    }

    public void setSenhaBD(String senhaBD) {
        this.senhaBD = senhaBD;
    }

    public String getBancoBD() {
        return bancoBD;
    }

    public void setBancoBD(String bancoBD) {
        this.bancoBD = bancoBD;
    }

    public List<PermissaoModulo> getPermissaoModuloList() {
        return permissaoModuloList;
    }

    public void setPermissaoModuloList(List<PermissaoModulo> permissaoModuloList) {
        this.permissaoModuloList = permissaoModuloList;
    }

    public Usuario getUsuarioCriacao() {
        return usuarioCriacao;
    }

    public void setUsuarioCriacao(Usuario usuarioCriacao) {
        this.usuarioCriacao = usuarioCriacao;
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
        if (!(object instanceof Modulo)) {
            return false;
        }
        Modulo other = (Modulo) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.Modulo[ codigo=" + codigo + " ]";
    }

}
