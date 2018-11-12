package br.unesp.sgcd.beans;

import java.io.Serializable;
import java.util.Date;

public class Caminho implements Serializable {
    private static final long serialVersionUID = 1L;
    private String pasta;
    private int upload;
    private long espaco;
    private Date criacao;
    private Date atualizacao;

    public Caminho() {
    }

    public Caminho(String pasta) {
        this.pasta = pasta;
    }

    public Caminho(String pasta, int upload, long espaco, Date criacao) {
        this.pasta = pasta;
        this.upload = upload;
        this.espaco = espaco;
        this.criacao = criacao;
    }

    public String getPasta() {
        return pasta;
    }

    public void setPasta(String pasta) {
        this.pasta = pasta;
    }

    public int getUpload() {
        return upload;
    }

    public void setUpload(int upload) {
        this.upload = upload;
    }

    public long getEspaco() {
        return espaco;
    }

    public void setEspaco(long espaco) {
        this.espaco = espaco;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pasta != null ? pasta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caminho)) {
            return false;
        }
        Caminho other = (Caminho) object;
        if ((this.pasta == null && other.pasta != null) || (this.pasta != null && !this.pasta.equals(other.pasta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.Caminho[ pasta=" + pasta + " ]";
    }

}
