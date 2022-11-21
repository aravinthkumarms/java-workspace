package com.java.abstractclass.challenge;

public class SearchTree  implements NodeList{
    private ListItem root =  null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            // the tree was empty, so new item would be the root element of the tree
            this.root = newItem;
            return true;
        }
        //start comparing from the head of the tree
        ListItem currentItem = this.root;
        while (currentItem!= null){
            int comparison = currentItem.compareTo(newItem);
            if(comparison < 0){
                // new item is greater, move to right side
                if( currentItem.next() != null){
                    currentItem = currentItem.next();
                }
                else{
                    // there's no node to the right , so add it here
                    currentItem.setNext(newItem);
                    return true;
                }
            }
            else if(comparison > 0 ){
                // newItem is less, move to left side
                if(currentItem.previous() != null){
                    currentItem = currentItem.previous();
                }
                else{
                    // no element to the left of the currentItem, so add it here
                    currentItem.setPrevious(newItem);
                    return true;
                }
            }
            else{
                // equal so not adding the element
                System.out.println(newItem.getValue() + " is already present. Not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if( item != null){
            System.out.println("Deleting Item "+item.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;
        while(currentItem != null){
            int comparison = currentItem.compareTo(item);
            if( comparison < 0){
               parentItem = currentItem;
               currentItem = currentItem.next();
            }
            else if(comparison > 0){
                parentItem = currentItem;
                currentItem = currentItem.previous();
            }
            else{
                // equal ,perform removal
                performRemoval(currentItem,parentItem);
                return true;
            }
        }
        return false;
    }


    private void performRemoval(ListItem item, ListItem parent){
        //remove item from the tree
        if ( item.next() == null){
            /// no right tree so make parent point to left tree
            if(parent.next() == item){
                // item is right child of its parent
                parent.setNext(item.previous());
            }
            else if(parent.previous() == item){
                // item is left child of its parent
                parent.setPrevious(item.previous());
            }
            else{
                //parent must be the remove item, which means root of the tree
                this.root = item.previous();
            }
        }
       else if ( item.previous() == null){
            /// no left tree so make parent point to right tree
            if(parent.next() == item){
                // item is right child of its parent
                parent.setNext(item.next());
            }
            else if(parent.previous() == item){
                // item is left child of its parent
                parent.setNext(item);
            }
            else{
                //parent must be the remove item, which means root of the tree
                this.root = item.next();
            }
        }
       else{
           // neither left nor right are null deletion is now a lot trickier!
            // from the right sub-tree find the smallest value(i.e leftmost)
            ListItem current = item.next();
            ListItem leftMostParent = item ;
            while (current.previous() != null){
                leftMostParent = current;
                current = current.previous();
            }
            // now put the smallest value into our node to be deleted
            item.setValue(current.getValue());
            // and delete the smallest
            if (leftMostParent == item){
                //there was no left most node, so current points to the smallest
                // node (the one that must now be deleted
                item.setNext(current.next());
            }
            else{
                //set the smallest nodes parent to point to
                // the smallest node's right child (which may be null)
                leftMostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void transverse(ListItem root) {
        //recursive method
        if (root != null){
            transverse(root.previous());
            System.out.println(root.getValue());
            transverse(root.next());
        }
    }
}
