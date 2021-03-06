package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class oder {

    public List<Integer> preoderTraveal(TreeNode root){
        List<Integer> ans = new LinkedList<>();
        //特判
        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null ){
            ans.add(root.val);
            return ans;
        }
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        nodeStack.add(root);
        TreeNode thisNode;

        /**如果栈不空
         * 1.如果有右孩子就压入栈
         * 2.如果有左孩子压入栈
         * 3.访问栈顶
         */
        while (!nodeStack.empty()){
             thisNode =  nodeStack.pop();
            if(thisNode.right!=null){
                nodeStack.add(thisNode.right);
            }
            if(thisNode.left!=null){
                nodeStack.add(thisNode.left);
            }
            ans.add(thisNode.val);
        }
        return ans;
    }

    public List<Integer> innorder(TreeNode root){
        List<Integer> ans = new LinkedList<>();

        //特判
        if(root == null ) {
            return  ans;
        }
        if(root.left == null && root.right == null ){
            ans.add(root.val);
            return ans;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.add(root);
        TreeNode thisNode;

        /**
         * 如果栈非空
         *1.如果有左孩子，一直压栈
         * 2.访问栈顶元素，将右孩子压入栈
         * 重复1
         */
        while (!nodeStack.empty()){
            thisNode = nodeStack.pop();
            while (thisNode.left!=null){
                nodeStack.add(thisNode.left);
                thisNode = thisNode.left;
            }
            ans.add(thisNode.val);
            if(thisNode.right!=null){
                thisNode = thisNode.right;
                nodeStack.add(thisNode);
            }
        }
        return ans;

    }

    public List<Integer> postOrder(TreeNode root){
        List<Integer> ans = new LinkedList<>();

        //特判
        if(root == null ) {
            return  ans;
        }
        if(root.left == null && root.right == null ){
            ans.add(root.val);
            return ans;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.add(root);
        TreeNode thisNode = root;
        TreeNode preNode = null;
        /**1.一直访问左孩子
         * 2.如果栈顶元素有右节点且没被访问过的则不访问，将右节点入栈
         */
        while (!nodeStack.empty()){
            while (thisNode.left!=null){
                thisNode = thisNode.left;
                nodeStack.add(thisNode);
            }
            thisNode = nodeStack.peek();
            if(thisNode.right!=null&& preNode!=thisNode.right){
                thisNode = thisNode.right;
                nodeStack.add(thisNode);
            }else{
                thisNode = nodeStack.pop();
                preNode = thisNode;
                ans.add(thisNode.val);
                thisNode.left = null;
            }
        }
        return ans;
    }
}
