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
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author demitrius
 */
public class MenuTreeModel implements TreeModel {

    private Service service = Service.getInstance();

    private Menu root;

    public MenuTreeModel() {
        root = service.findMenu(1);
    }

    @Override
    public Object getRoot() {
        return root;
    }

    @Override
    public Object getChild(Object parent, int index) {
        Menu p = (Menu) parent;
        return p.getChilds().get(index);
    }

    @Override
    public int getChildCount(Object parent) {
        Menu p = (Menu) parent;
        return p.getChilds().size();
    }

    @Override
    public boolean isLeaf(Object node) {
        Menu m = (Menu) node;
        return m.getChilds().isEmpty();
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        Menu p = (Menu) parent;
        if (p.equals(root)) {
            return p.getChilds().indexOf(child) - 1;
        }
        return p.getChilds().indexOf(child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
    }

}
