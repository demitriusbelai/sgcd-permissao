package br.unesp.sgcd.beans;

import java.io.Serializable;
import java.util.Date;

public class Banner implements Serializable {
    private static final long serialVersionUID = 1L;
    private Short codigo;
    private String title;
    private String tipoLink;
    private String url;
    private String imagem;
    private String destino;
    private short ordem;
    private Date dataInicio;
    private Date dataFim;
    private Date dataCriacao;
    private Date dataAtualizacao;
    private Usuario usuarioCriacao;
    private Usuario usuarioAtualizacao;

    public Banner() {
    }

    public Banner(Short codigo) {
        this.codigo = codigo;
    }

    public Banner(Short codigo, String title, String imagem, String destino, short ordem, Date dataCriacao) {
        this.codigo = codigo;
        this.title = title;
        this.imagem = imagem;
        this.destino = destino;
        this.ordem = ordem;
        this.dataCriacao = dataCriacao;
    }

    public Short getCodigo() {
        return codigo;
    }

    public void setCodigo(Short codigo) {
        this.codigo = codigo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTipoLink() {
        return tipoLink;
    }

    public void setTipoLink(String tipoLink) {
        this.tipoLink = tipoLink;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public short getOrdem() {
        return ordem;
    }

    public void setOrdem(short ordem) {
        this.ordem = ordem;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Usuario getUsuarioCriacao() {
        return usuarioCriacao;
    }

    public void setUsuarioCriacao(Usuario usuarioCriacao) {
        this.usuarioCriacao = usuarioCriacao;
    }

    public Usuario getUsuarioAtualizacao() {
        return usuarioAtualizacao;
    }

    public void setUsuarioAtualizacao(Usuario usuarioAtualizacao) {
        this.usuarioAtualizacao = usuarioAtualizacao;
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
        if (!(object instanceof Banner)) {
            return false;
        }
        Banner other = (Banner) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.Banner[ codigo=" + codigo + " ]";
    }
    
}
