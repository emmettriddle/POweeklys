package ArrayToBst;

public class BST {
	
	static BstNode root;
	 
    BstNode sortedArrayToBST(int arr[], int start, int end) {
 
        if (start > end) {
            return null;
        }
 
        /* middle element and turn to root */
        int mid = (start + end) / 2;
        BstNode node = new BstNode(arr[mid]);
 
        /* recursively build the left sub-tree and make it
         left child of root */
        node.left = sortedArrayToBST(arr, start, mid - 1);
 
        /* recursively build the right sub-tree and make it
         right child of root */
        node.right = sortedArrayToBST(arr, mid + 1, end);
         
        return node;
    }
 
    /*function to print pre-order traversal of BST */
    void preOrder(BstNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
     
    public static void main(String[] args) {
        BST tree = new BST();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        root = tree.sortedArrayToBST(arr, 0, n - 1);
        System.out.println("Preorder traversal of constructed BST");
        tree.preOrder(root);
    }

}
