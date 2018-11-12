package br.unesp.sgcd.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Pagina implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer codigo;
    private String nome;
    private String conteudo;
    private Date criacao;
    private Date atualizacao;
    private String usuarioAtualizacao;
    private String loginUsuario;
    private String usuarioResponsavel;
    private Date dataResponsavel;
    private int acessos;
    private Date ultimoAcesso;
    private String restricao;
    private List<PermissaoPagina> permissaoPaginaList;

    public Pagina() {
    }

    public Pagina(Integer codigo) {
        this.codigo = codigo;
    }

    public Pagina(Integer codigo, String nome, String conteudo, Date criacao, String loginUsuario, int acessos, String restricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.conteudo = conteudo;
        this.criacao = criacao;
        this.loginUsuario = loginUsuario;
        this.acessos = acessos;
        this.restricao = restricao;
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

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        this.criacao = criacao;
    }

    public Date getAtualizacao() {
        return atualizacao;
    }

    public void setAtualizacao(Date atualizacao) {
        this.atualizacao = atualizacao;
    }

    public String getUsuarioAtualizacao() {
        return usuarioAtualizacao;
    }

    public void setUsuarioAtualizacao(String usuarioAtualizacao) {
        this.usuarioAtualizacao = usuarioAtualizacao;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getUsuarioResponsavel() {
        return usuarioResponsavel;
    }

    public void setUsuarioResponsavel(String usuarioResponsavel) {
        this.usuarioResponsavel = usuarioResponsavel;
    }

    public Date getDataResponsavel() {
        return dataResponsavel;
    }

    public void setDataResponsavel(Date dataResponsavel) {
        this.dataResponsavel = dataResponsavel;
    }

    public int getAcessos() {
        return acessos;
    }

    public void setAcessos(int acessos) {
        this.acessos = acessos;
    }

    public Date getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(Date ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    public String getRestricao() {
        return restricao;
    }

    public void setRestricao(String restricao) {
        this.restricao = restricao;
    }

    public List<PermissaoPagina> getPermissaoPaginaList() {
        return permissaoPaginaList;
    }

    public void setPermissaoPaginaList(List<PermissaoPagina> permissaoPaginaList) {
        this.permissaoPaginaList = permissaoPaginaList;
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
        if (!(object instanceof Pagina)) {
            return false;
        }
        Pagina other = (Pagina) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.Pagina[ codigo=" + codigo + " ]";
    }

}
