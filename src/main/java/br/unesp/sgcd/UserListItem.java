/*
 *  Copyright (C) 2016 FAAC - Faculdade de Arquitetura, Artes e Comunicação
 *  UNESP - Universidade Estadual Paulista “Júlio de Mesquita Filho”
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package br.unesp.sgcd;

import br.unesp.sgcd.beans.Menu;
import br.unesp.sgcd.beans.Pagina;
import br.unesp.sgcd.beans.Permissao;
import br.unesp.sgcd.beans.PermissaoPagina;
import br.unesp.sgcd.beans.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author demitrius
 */
public class UserListItem {

    private Usuario usuario;
    private boolean todos = true;
    private boolean removido = false;
    private boolean novo = false;
    private boolean adicionar = false;

    private List<Permissao> listPermissao = new ArrayList<Permissao>();
    private List<PermissaoPagina> listPermissaoPagina = new ArrayList<PermissaoPagina>();
    private List<Menu> listMenu = new ArrayList<Menu>();
    private List<Pagina> listPagina = new ArrayList<Pagina>();

    public UserListItem(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isTodos() {
        return todos;
    }

    public void setTodos(boolean todos) {
        this.todos = todos;
    }

    public boolean isRemovido() {
        return removido;
    }

    public void setRemovido(boolean removido) {
        this.removido = removido;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public boolean isAdicionar() {
        return adicionar;
    }

    public void setAdicionar(boolean adicionar) {
        this.adicionar = adicionar;
    }

    public List<Permissao> getListPermissao() {
        return listPermissao;
    }

    public List<PermissaoPagina> getListPermissaoPagina() {
        return listPermissaoPagina;
    }

    public List<Menu> getListMenu() {
        return listMenu;
    }

    public List<Pagina> getListPagina() {
        return listPagina;
    }

}
