package com.java.abstractclass.challenge;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void transverse(ListItem root);
}
