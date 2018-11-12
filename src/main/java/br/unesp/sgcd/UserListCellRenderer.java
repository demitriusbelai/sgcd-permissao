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

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author demitrius
 */
public class UserListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        UserListItem userListItem = ((UserListItem) value);
        JLabel label = (JLabel) super.getListCellRendererComponent(list, userListItem.getUsuario().getNome(), index, isSelected, cellHasFocus);
        if (!userListItem.isTodos()) {
            label.setForeground(Color.gray);
        } else {
            label.setForeground(javax.swing.UIManager.getDefaults().getColor("Label.foreground"));
        }
        if (userListItem.isRemovido()) {
            label.setBackground(Color.red);
        }
        if (userListItem.isNovo()) {
            label.setBackground(Color.blue);
        }
        if (userListItem.isAdicionar()) {
            label.setBackground(Color.green);
        }
        return label;
    }

}
