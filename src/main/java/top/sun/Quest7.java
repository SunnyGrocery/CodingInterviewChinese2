package top.sun;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by SunnyGrocery on 2020/1/13 20:12
 */
public class Quest7 {
    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        cengxu(reConstructBinaryTree(pre, in));
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null) {
            return null;
        }
        return reBuild(0, pre.length - 1, 0, in.length - 1, pre, in);
    }


    public static TreeNode reBuild(int preStart, int preEnd, int inStart, int inEnd, int[] pre, int[] in) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);
        int newRootIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == root.val) {
                newRootIndex = i;
            }
        }
        if (newRootIndex == -1) {
            throw new RuntimeException("Error input!");
        }
        int leftTreeLength = newRootIndex - inStart;
        root.left = reBuild(preStart + 1, preStart + leftTreeLength, inStart, newRootIndex - 1, pre, in);
        root.right = reBuild(preStart + 1 + leftTreeLength, preEnd, newRootIndex + 1, inEnd, pre, in);
        return root;
    }

    public static void cengxu(TreeNode t) {//层序遍历
        Queue<TreeNode> q1 = new LinkedList<>();
        if (t == null)
            return;
        q1.add(t);
        while (!q1.isEmpty()) {
            TreeNode t1 = q1.poll();
            if (t1.left != null)
                q1.add(t1.left);
            if (t1.right != null)
                q1.add(t1.right);
            System.out.print(t1.val + " ");
        }
        System.out.println();
    }
}

/**
 * Definition for binary tree
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
