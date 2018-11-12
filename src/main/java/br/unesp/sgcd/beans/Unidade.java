package br.unesp.sgcd.beans;

import java.io.Serializable;

public class Unidade implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nomeCampus;
    private String nomeFaculdade;
    private String endereco;
    private String bairro;
    private String cep;
    private String cidade;
    private String telefone;
    private String fax;
    private String pabx;
    private String emailCorrecaoNoticia;
    private String emailNovosCadastros;
    private String diretorioAbsoluto;
    private String dominio;
    private String larguraMinimaPagina;
    private String larguraMaximaPagina;
    private Short tamanhoPasta;
    private String unidadeTamanhoPasta;
    private Short tamanhoArquivo;
    private String unidadeTamanhoArquivo;
    private String linkTopoImprensa;
    private String linkRapidoGraduacao;
    private String linkRapidoPos;
    private String linkRapidoPesquisa;
    private String linkRapidoExtensao;
    private String linkRapidoVestibular;
    private String linkRapidoCursinhos;
    private String linkRapidoTransf;
    private String linkRapidoTercIdade;
    private String linkRapidoEmpJunior;
    private String linkRapidoSalaEstudante;
    private String linkRodapePortal;
    private String linkRodapeUnidades;
    private String linkRodapePolitica;
    private String linkRodapeWebmail;

    public Unidade() {
    }

    public Unidade(String nomeCampus) {
        this.nomeCampus = nomeCampus;
    }

    public Unidade(String nomeCampus, String nomeFaculdade, String diretorioAbsoluto, String dominio) {
        this.nomeCampus = nomeCampus;
        this.nomeFaculdade = nomeFaculdade;
        this.diretorioAbsoluto = diretorioAbsoluto;
        this.dominio = dominio;
    }

    public String getNomeCampus() {
        return nomeCampus;
    }

    public void setNomeCampus(String nomeCampus) {
        this.nomeCampus = nomeCampus;
    }

    public String getNomeFaculdade() {
        return nomeFaculdade;
    }

    public void setNomeFaculdade(String nomeFaculdade) {
        this.nomeFaculdade = nomeFaculdade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPabx() {
        return pabx;
    }

    public void setPabx(String pabx) {
        this.pabx = pabx;
    }

    public String getEmailCorrecaoNoticia() {
        return emailCorrecaoNoticia;
    }

    public void setEmailCorrecaoNoticia(String emailCorrecaoNoticia) {
        this.emailCorrecaoNoticia = emailCorrecaoNoticia;
    }

    public String getEmailNovosCadastros() {
        return emailNovosCadastros;
    }

    public void setEmailNovosCadastros(String emailNovosCadastros) {
        this.emailNovosCadastros = emailNovosCadastros;
    }

    public String getDiretorioAbsoluto() {
        return diretorioAbsoluto;
    }

    public void setDiretorioAbsoluto(String diretorioAbsoluto) {
        this.diretorioAbsoluto = diretorioAbsoluto;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getLarguraMinimaPagina() {
        return larguraMinimaPagina;
    }

    public void setLarguraMinimaPagina(String larguraMinimaPagina) {
        this.larguraMinimaPagina = larguraMinimaPagina;
    }

    public String getLarguraMaximaPagina() {
        return larguraMaximaPagina;
    }

    public void setLarguraMaximaPagina(String larguraMaximaPagina) {
        this.larguraMaximaPagina = larguraMaximaPagina;
    }

    public Short getTamanhoPasta() {
        return tamanhoPasta;
    }

    public void setTamanhoPasta(Short tamanhoPasta) {
        this.tamanhoPasta = tamanhoPasta;
    }

    public String getUnidadeTamanhoPasta() {
        return unidadeTamanhoPasta;
    }

    public void setUnidadeTamanhoPasta(String unidadeTamanhoPasta) {
        this.unidadeTamanhoPasta = unidadeTamanhoPasta;
    }

    public Short getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(Short tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getUnidadeTamanhoArquivo() {
        return unidadeTamanhoArquivo;
    }

    public void setUnidadeTamanhoArquivo(String unidadeTamanhoArquivo) {
        this.unidadeTamanhoArquivo = unidadeTamanhoArquivo;
    }

    public String getLinkTopoImprensa() {
        return linkTopoImprensa;
    }

    public void setLinkTopoImprensa(String linkTopoImprensa) {
        this.linkTopoImprensa = linkTopoImprensa;
    }

    public String getLinkRapidoGraduacao() {
        return linkRapidoGraduacao;
    }

    public void setLinkRapidoGraduacao(String linkRapidoGraduacao) {
        this.linkRapidoGraduacao = linkRapidoGraduacao;
    }

    public String getLinkRapidoPos() {
        return linkRapidoPos;
    }

    public void setLinkRapidoPos(String linkRapidoPos) {
        this.linkRapidoPos = linkRapidoPos;
    }

    public String getLinkRapidoPesquisa() {
        return linkRapidoPesquisa;
    }

    public void setLinkRapidoPesquisa(String linkRapidoPesquisa) {
        this.linkRapidoPesquisa = linkRapidoPesquisa;
    }

    public String getLinkRapidoExtensao() {
        return linkRapidoExtensao;
    }

    public void setLinkRapidoExtensao(String linkRapidoExtensao) {
        this.linkRapidoExtensao = linkRapidoExtensao;
    }

    public String getLinkRapidoVestibular() {
        return linkRapidoVestibular;
    }

    public void setLinkRapidoVestibular(String linkRapidoVestibular) {
        this.linkRapidoVestibular = linkRapidoVestibular;
    }

    public String getLinkRapidoCursinhos() {
        return linkRapidoCursinhos;
    }

    public void setLinkRapidoCursinhos(String linkRapidoCursinhos) {
        this.linkRapidoCursinhos = linkRapidoCursinhos;
    }

    public String getLinkRapidoTransf() {
        return linkRapidoTransf;
    }

    public void setLinkRapidoTransf(String linkRapidoTransf) {
        this.linkRapidoTransf = linkRapidoTransf;
    }

    public String getLinkRapidoTercIdade() {
        return linkRapidoTercIdade;
    }

    public void setLinkRapidoTercIdade(String linkRapidoTercIdade) {
        this.linkRapidoTercIdade = linkRapidoTercIdade;
    }

    public String getLinkRapidoEmpJunior() {
        return linkRapidoEmpJunior;
    }

    public void setLinkRapidoEmpJunior(String linkRapidoEmpJunior) {
        this.linkRapidoEmpJunior = linkRapidoEmpJunior;
    }

    public String getLinkRapidoSalaEstudante() {
        return linkRapidoSalaEstudante;
    }

    public void setLinkRapidoSalaEstudante(String linkRapidoSalaEstudante) {
        this.linkRapidoSalaEstudante = linkRapidoSalaEstudante;
    }

    public String getLinkRodapePortal() {
        return linkRodapePortal;
    }

    public void setLinkRodapePortal(String linkRodapePortal) {
        this.linkRodapePortal = linkRodapePortal;
    }

    public String getLinkRodapeUnidades() {
        return linkRodapeUnidades;
    }

    public void setLinkRodapeUnidades(String linkRodapeUnidades) {
        this.linkRodapeUnidades = linkRodapeUnidades;
    }

    public String getLinkRodapePolitica() {
        return linkRodapePolitica;
    }

    public void setLinkRodapePolitica(String linkRodapePolitica) {
        this.linkRodapePolitica = linkRodapePolitica;
    }

    public String getLinkRodapeWebmail() {
        return linkRodapeWebmail;
    }

    public void setLinkRodapeWebmail(String linkRodapeWebmail) {
        this.linkRodapeWebmail = linkRodapeWebmail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomeCampus != null ? nomeCampus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidade)) {
            return false;
        }
        Unidade other = (Unidade) object;
        if ((this.nomeCampus == null && other.nomeCampus != null) || (this.nomeCampus != null && !this.nomeCampus.equals(other.nomeCampus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.Unidade[ nomeCampus=" + nomeCampus + " ]";
    }

}
