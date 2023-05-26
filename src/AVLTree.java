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
    private AVLNode insert(AVLNode root, int value) {
        System.out.println();
        if(root == null){
            root = new AVLNode(value);
        }
        if(value < root.value){
            root.leftChild = insert(root.leftChild, value);
        }
        
        if(value > root.value){
            root.rightChild = insert(root.rightChild, value);
        }
        root.height = root.height + 1;
        System.out.println("root " + root.value);
        root = rotate(root);
        return root;
    }
    
    private int balance(AVLNode root) {
        var lefh = root.leftChild == null ? 0 : root.leftChild.height;
        var refh = root.rightChild ==null ? 0 : root.rightChild.height;
        var x = lefh - refh;
        return x;
    }
    
    private AVLNode rotate(AVLNode root){
        //rightrotate
        if(balance(root) < -1){
            root.rightChild.leftChild = new AVLNode(root.value);
            root = root.rightChild;
        }
        if(balance(root) > 1){
            root.leftChild.rightChild = new AVLNode(root.value);
            root = root.leftChild;
        }
        return root;
    }
}
