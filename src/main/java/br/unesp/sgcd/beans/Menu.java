package br.unesp.sgcd.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer codigo;
    private Integer codigoPai;
    private String nome;
    private String linkPagina;
    private Integer codigoPagina;
    private String pasta;
    private String paginaInterna;
    private String paginaExterna;
    private String destino;
    private String abreMenu;
    private short ordem;
    private String loginUsuario;
    private Date criacao;
    private Date atualizacao;
    private int acessos;
    private String restricao;
    private String usuarioAtualizacao;
    private String usuarioResponsavel;
    private Date dataResponsavel;
    private List<Permissao> permissaoList;

    public Menu() {
    }

    public Menu(Integer codigo) {
        this.codigo = codigo;
    }

    public Menu(Integer codigo, String nome, String abreMenu, short ordem, String loginUsuario, Date criacao, int acessos, String restricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.abreMenu = abreMenu;
        this.ordem = ordem;
        this.loginUsuario = loginUsuario;
        this.criacao = criacao;
        this.acessos = acessos;
        this.restricao = restricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigoPai() {
        return codigoPai;
    }

    public void setCodigoPai(Integer codigoPai) {
        this.codigoPai = codigoPai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinkPagina() {
        return linkPagina;
    }

    public void setLinkPagina(String linkPagina) {
        this.linkPagina = linkPagina;
    }

    public Integer getCodigoPagina() {
        return codigoPagina;
    }

    public void setCodigoPagina(Integer codigoPagina) {
        this.codigoPagina = codigoPagina;
    }

    public String getPasta() {
        return pasta;
    }

    public void setPasta(String pasta) {
        this.pasta = pasta;
    }

    public String getPaginaInterna() {
        return paginaInterna;
    }

    public void setPaginaInterna(String paginaInterna) {
        this.paginaInterna = paginaInterna;
    }

    public String getPaginaExterna() {
        return paginaExterna;
    }

    public void setPaginaExterna(String paginaExterna) {
        this.paginaExterna = paginaExterna;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAbreMenu() {
        return abreMenu;
    }

    public void setAbreMenu(String abreMenu) {
        this.abreMenu = abreMenu;
    }

    public short getOrdem() {
        return ordem;
    }

    public void setOrdem(short ordem) {
        this.ordem = ordem;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
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

    public int getAcessos() {
        return acessos;
    }

    public void setAcessos(int acessos) {
        this.acessos = acessos;
    }

    public String getRestricao() {
        return restricao;
    }

    public void setRestricao(String restricao) {
        this.restricao = restricao;
    }

    public String getUsuarioAtualizacao() {
        return usuarioAtualizacao;
    }

    public void setUsuarioAtualizacao(String usuarioAtualizacao) {
        this.usuarioAtualizacao = usuarioAtualizacao;
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

    public List<Permissao> getPermissaoList() {
        return permissaoList;
    }

    public void setPermissaoList(List<Permissao> permissaoList) {
        this.permissaoList = permissaoList;
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
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.Menu[ codigo=" + codigo + " ]";
    }

    private Menu menuPai;

    private List<Menu> childs;

    public Menu getMenuPai() {
        return menuPai;
    }

    public List<Menu> getChilds() {
        return childs;
    }

}
