package br.unesp.sgcd.beans;

import java.io.Serializable;
import java.util.Date;

public class LogUpload implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer codigo;
    private String loginUsuario;
    private String operacao;
    private Date dataOperacao;
    private String arquivo;
    private String enderecoIP;

    public LogUpload() {
    }

    public LogUpload(Integer codigo) {
        this.codigo = codigo;
    }

    public LogUpload(Integer codigo, String loginUsuario, String operacao, Date dataOperacao, String arquivo) {
        this.codigo = codigo;
        this.loginUsuario = loginUsuario;
        this.operacao = operacao;
        this.dataOperacao = dataOperacao;
        this.arquivo = arquivo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public Date getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(Date dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public String getEnderecoIP() {
        return enderecoIP;
    }

    public void setEnderecoIP(String enderecoIP) {
        this.enderecoIP = enderecoIP;
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
        if (!(object instanceof LogUpload)) {
            return false;
        }
        LogUpload other = (LogUpload) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgcd.beans.LogUpload[ codigo=" + codigo + " ]";
    }

}
