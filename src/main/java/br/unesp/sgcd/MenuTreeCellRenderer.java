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
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 *
 * @author demitrius
 */
public class MenuTreeCellRenderer extends DefaultTreeCellRenderer {

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        return super.getTreeCellRendererComponent(tree, ((Menu) value).getNome(), selected, expanded, leaf, row, hasFocus);
    }

}
