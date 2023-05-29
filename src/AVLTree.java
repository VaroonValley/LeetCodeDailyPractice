/**
 * AVLTree
 */
public class AVLTree {
    private class AVLNode{
        private int height;
        private int value;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int value){
            this.value = value;
        }

    }
    private AVLNode root;
    public void insert(int value){
        root = insert(root, value);
    }
    private AVLNode insert(AVLNode root, int value){
        if(root == null){
            root = new AVLNode(value);
        }
        if(value < root.value){
            root.leftChild = insert(root.leftChild, value);
        }
        
        if(value > root.value){
            root.rightChild = insert(root.rightChild, value);
        }
        root.height = Math.max(height(root.leftChild), height(root.rightChild)) + 1;
        
        root = rotate(root);
        return root;
    }
    
    private int height(AVLNode root){
        return root == null ? 0 : root.height;
    }

    private int isBalanced(AVLNode root) {
        return height(root.leftChild) - height(root.rightChild);
    }
    private AVLNode rotate(AVLNode node) {
        // AVLNode node = root;
        if(isBalanced(node) < -1){
            node = rotateLeft(node);
        }

        if(isBalanced(node) > 1){
            node = rotateRight(node);
        }
        return node;
    }
    private AVLNode rotateLeft(AVLNode root){
        AVLNode newRoot = root.rightChild;
        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;
        
        root.height = Math.max(height(root.leftChild), height(root.rightChild)) + 1;
        newRoot.height = Math.max(height(newRoot.leftChild), height(newRoot.rightChild)) + 1;
        
        
        return newRoot;
    }
    private AVLNode rotateRight(AVLNode root){
        AVLNode newRoot = root.leftChild;
        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;

        root.height = Math.max(height(root.leftChild), height(root.rightChild)) + 1;
        newRoot.height = Math.max(height(newRoot.leftChild), height(newRoot.rightChild) + 1);
        return root;
    }
}