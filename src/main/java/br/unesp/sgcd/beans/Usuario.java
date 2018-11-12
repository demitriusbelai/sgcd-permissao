package br.unesp.sgcd.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    private String login;
    private String senha;
    private String nome;
    private String email;
    private String tipo;
    private Date criacao;
    private String excluido;
    private int acessos;
    private Date ultimoLogin;
    private List<PermissaoModulo> permissaoModuloList;
    private List<Permissao> permissaoList;
    private List<PermissaoPagina> permissaoPaginaList;
    private List<Modulo> moduloList;
    private List<Banner> bannerList;
    private List<Banner> bannerList1;

    public Usuario() {
    }

    public Usuario(String login) {
        this.login = login;
    }

    public Usuario(String login, String senha, String nome, String tipo, Date criacao, String excluido, int acessos) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.tipo = tipo;
        this.criacao = criacao;
        this.excluido = excluido;
        this.acessos = acessos;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        this.criacao = criacao;
    }

    public String getExcluido() {
        return excluido;
    }

    public void setExcluido(String excluido) {
        this.excluido = excluido;
    }

    public int getAcessos() {
        return acessos;
    }

    public void setAcessos(int acessos) {
        this.acessos = acessos;
    }

    public Date getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(Date ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public List<PermissaoModulo> getPermissaoModuloList() {
        return permissaoModuloList;
    }

    public void setPermissaoModuloList(List<PermissaoModulo> permissaoModuloList) {
        this.permissaoModuloList = permissaoModuloList;
    }

    public List<Permissao> getPermissaoList() {
        return permissaoList;
    }

    public void setPermissaoList(List<Permissao> permissaoList) {
        this.permissaoList = permissaoList;
    }

    public List<PermissaoPagina> getPermissaoPaginaList() {
        return permissaoPaginaList;
    }

    public void setPermissaoPaginaList(List<PermissaoPagina> permissaoPaginaList) {
        this.permissaoPaginaList = permissaoPaginaList;
    }

    public List<Modulo> getModuloList() {
        return moduloList;
    }

    public void setModuloList(List<Modulo> moduloList) {
        this.moduloList = moduloList;
    }

    public List<Banner> getBannerList() {
        return bannerList;
    }

    public void setBannerList(List<Banner> bannerList) {
        this.bannerList = bannerList;
    }

    public List<Banner> getBannerList1() {
        return bannerList1;
    }

    public void setBannerList1(List<Banner> bannerList1) {
        this.bannerList1 = bannerList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (login != null ? login.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.login == null && other.login != null) || (this.login != null && !this.login.equals(other.login))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.Usuario[ login=" + login + " ]";
    }

}
