/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.sgcd;

import java.util.Collections;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author demitrius
 */
public class UserListModel extends AbstractListModel {

    List<UserListItem> list = Collections.EMPTY_LIST;

    public List<UserListItem> getList() {
        return list;
    }

    public void setList(List<UserListItem> list) {
        this.list = list;
        fireContentsChanged(this, 0, list.size());
    }
    
    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Object getElementAt(int index) {
        return list.get(index);
    }

    void refresh() {
        fireContentsChanged(this, 0, list.size());
    }
    
}
