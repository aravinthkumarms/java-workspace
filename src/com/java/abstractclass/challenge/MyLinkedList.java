package com.java.abstractclass.challenge;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "root=" + root +
                '}';
    }

    @Override
    public boolean addItem(ListItem newItem) {
       if(this.root == null){
           // the list is empty so this would be the root element of the list
           this.root = newItem;
           return true;
       }
       ListItem currentItem = this.root;
       while (currentItem != null){
           int comparision = currentItem.compareTo(newItem);
           if( comparision < 0){
               // the new item is greater than the root, so move right
              if( currentItem.next() != null){
                  currentItem = currentItem.next();
              }
              else {
                  // no next item so inserting at the end
                  currentItem.setNext(newItem).setPrevious(currentItem);
                  return true;
              }
           } else if (comparision  > 0) {
               // the new item is lesser than the root element so insert before
               if(currentItem.previous() != null) {
                   currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                   newItem.setNext(currentItem).setPrevious(newItem);
//                   newItem.setPrevious(currentItem.previous());
//                   newItem.setNext(currentItem);
//                   currentItem.setPrevious(newItem);
               }
               else{
                   // previous item is root
                   newItem.setNext(this.root).setPrevious(newItem);
//                   this.root.setPrevious(newItem);
                   this.root = newItem;
               }
               return true;
           }
           else{
               //equal
               System.out.println(newItem.getValue() + " is already present. Not added");
               return false;
           }
       }
       return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.println("Deleting item "+ item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem!= null){
            int comparsion = currentItem.compareTo(item);
            if(comparsion == 0){
              // found the item to delete
              if(currentItem == this.root){
                  this.root = currentItem.next();
              }
              else{
                  currentItem.previous().setNext(currentItem.next());
                  if(currentItem.next() != null){
                      currentItem.next().setPrevious(currentItem.previous());
                  }
              }
              return true;
          }
          else if(comparsion < 0){
              currentItem = currentItem.next();
          }
          else{
              // comparison > 0
              // item not found in the list since the comparison is greater than last element
              return false;
          }
        }
        // we reached the end of the list
        // without finding the item to delete
        return false;
    }

    @Override
    public void transverse(ListItem root) {
        if(root == null){
            System.out.println("The list is null");
        }else{
            while(root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
