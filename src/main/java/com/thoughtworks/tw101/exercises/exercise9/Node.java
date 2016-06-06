package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private String name;
    public Node left;
    public Node right;

    public Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public void add(String nameOfNewNode) {
        int compare = this.name.compareToIgnoreCase(nameOfNewNode);
        if (compare < 0 && this.left == null) {
            this.left = new Node(nameOfNewNode);
        }else if (compare > 0 && this.right == null){
            this.right = new Node(nameOfNewNode);
        }else if (compare < 0){
            this.left.add(nameOfNewNode);
        } else if (compare > 0){
            this.right.add(nameOfNewNode);
        }
    }
    public void link(Node first, Node second){
        first.right = second;
        second.left = first;
    }

    public Node concat(Node first, Node second){
        if (first == null){
            return second;
        }
        if(second==null){
            return first;
        }
        Node firstPrev = first.left;
        Node secondPrev = second.left;
        link(firstPrev, second);
        link(secondPrev, first);
        return first;
    }

    public Node treeToList(Node root){
        if(root == null){
            return null;
        }
        Node list1 = treeToList(root.left);
        Node list2 = treeToList(root.right);
        root.left = root;
        root.right = root;
        list1 = concat(list1, root);
        list1 = concat(list1, list2);
        return list1;
    }

    public List<String> names() {
        Node head = treeToList(this);
        List<String> list = new ArrayList<String>();
        Node tmp = head.left;
        head.left = null;

        while(tmp.left != null){
            list.add(tmp.name);
            tmp = tmp.left;
        }
        return list;
    }

}
