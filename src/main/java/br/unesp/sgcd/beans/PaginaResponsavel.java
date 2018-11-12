package br.unesp.sgcd.beans;

import java.io.Serializable;

public class PaginaResponsavel implements Serializable {
    private int codigo;
    private String usuarioResponsavel;

    public PaginaResponsavel() {
    }

    public PaginaResponsavel(int codigo, String usuarioResponsavel) {
        this.codigo = codigo;
        this.usuarioResponsavel = usuarioResponsavel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUsuarioResponsavel() {
        return usuarioResponsavel;
    }

    public void setUsuarioResponsavel(String usuarioResponsavel) {
        this.usuarioResponsavel = usuarioResponsavel;
    }

}
