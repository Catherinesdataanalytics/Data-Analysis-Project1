package com.company;

//tree in java
class TreeNode{
    public int val;
    public TreeNode left, right;

    public TreeNode(int value){
        val = value;
        left = right = null;
    }
}

//comparing to linkedlist
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int value){
        val = value;
        next = null;
    }
}

//simeple tree
public class Main {

    public static void print(TreeNode root){
        //left root right
        if (root == null){
            return;
        }
        print(root.left);
        System.out.println(root.val + " ");
        print(root.right);



    }


    public static void main(String[] args){
        TreeNode node1 = new TreeNode (8);
        TreeNode node2 = new TreeNode (3);
        TreeNode node3 = new TreeNode ( 10);
        TreeNode node4 = new TreeNode ( 1);
        TreeNode node5 = new TreeNode ( 6);
        TreeNode node6 = new TreeNode ( 4);
        TreeNode node7 = new TreeNode ( 7);
        TreeNode node8 = new TreeNode ( 13);
        TreeNode node9 = new TreeNode ( 14);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node5.left = node6;
        node5.right = node7;

        node3.right = node9;
        node9.left = node8;

        print(node1);


        System.out.println("node value:"+node1.val);
        System.out.println("node left value:"+node1.left.val);
        System.out.println("node left value:"+node1.left.left.val);



    }
}

//Traversal

//Preorder traversal: root -> left -> right
//Inorder traversal : left -> root -> right
//Postorder traversal : left -> right -> root


//Recursion

//DFS : deep first search
//Recursion

//DFS : deep first search

//find all leaf node sum
public class Solution1 {
    public int leafSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root != null && root.left == null && root.right == null) {
            return root.val;
        }
        return leafSum(root.left) + leafSum(root.right);
    }
}
//find the deepth of the tree

public class Solution2 {
    public int maxDepth（TreeNode node） {


        if (node == null) {
            return 0;
        }
        return Math.max(maxDepth(node.left),
                        maxDepth(node.right))+1;
    }
}

//find all the path: same question

//find same pattern tree
//identical or not identical
public class Solution3 {
    public boolean isIdentical(TreeNode a, TreeNode b){
        if (a == null && b == null){
            return true;
        }
        if ( a!= null && b == null || a == null && b != null){
            return false;
        }
        return a.val == b.val && isIdentical(a.left, b.left) &&
                isIdentical(a.right, b.right);
    }
}



















