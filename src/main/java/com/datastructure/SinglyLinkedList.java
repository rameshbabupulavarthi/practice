package com.datastructure;

/**
 * Created by Sunil Golla on 12/14/2018.
 */
public class SinglyLinkedList<T> {

    Node<T> head;

    public void add(T value){
        Node<T> node=new Node(value);

        if(head!=null){
            Node currentNode=head;
            Node prev=null;
            while(currentNode!=null){
                prev=currentNode;
                currentNode=currentNode.next;
            }
            prev.next=node;
        }else{
            head=node;
        }
    }

    public void remove(Node<T> node){
        if(head!=null && head.equals(node)){
            head=head.next;
        }else{
            Node currentNode=head;
            Node prev=null;
            Node foundNode=null;
            while(currentNode!=null){
                if(currentNode.equals(node)){
                    foundNode=currentNode;
                    break;
                }
                prev=currentNode;
                currentNode=currentNode.next;
            }
            if(foundNode!=null) {
                prev.next = foundNode.next;
            }
        }
    }

    public void print(){
        Node<T> node=head;
        while(node!=null){
            System.out.print(node);
            node=node.next;
        }
    }

    public static void main(String []args){
        SinglyLinkedList<Integer> linkedList=new SinglyLinkedList<>();
        for (int i = 0; i <= 5; i++) {
            linkedList.add(i);
        }
        linkedList.print();
    }
}

class Node<T> {

    public Node(T value){
        this.value=value;
    }

    T value;
    Node<T> next;

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
