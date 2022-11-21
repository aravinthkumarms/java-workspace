package com.java.abstractclass.challenge;

import java.util.Optional;

public class Main {
    public static void main(String[] args){
        SearchTree searchTree = new SearchTree(null);
        searchTree.transverse(searchTree.getRoot());
        String stringData = "5 6 3 2 1 0 9 8 4";
        String[] data = stringData.split(" ");
        for(String s: data){
            searchTree.addItem(new Node(s));
        }
        searchTree.transverse(searchTree.getRoot());
        System.out.println("Root - "+searchTree.getRoot().getValue());
        searchTree.removeItem(new Node("2"));
        searchTree.transverse(searchTree.getRoot());
        searchTree.removeItem(new Node("0"));
        searchTree.transverse(searchTree.getRoot());
        searchTree.removeItem(new Node("5"));
        searchTree.transverse(searchTree.getRoot());
        searchTree.removeItem(new Node("4"));
        searchTree.transverse(searchTree.getRoot());
        searchTree.removeItem(new Node("3"));
        searchTree.transverse(searchTree.getRoot());
        searchTree.removeItem(new Node("7"));
        searchTree.transverse(searchTree.getRoot());
        searchTree.removeItem(new Node("8"));
        searchTree.transverse(searchTree.getRoot());
        searchTree.removeItem(new Node("9"));
        searchTree.transverse(searchTree.getRoot());
    }
}
