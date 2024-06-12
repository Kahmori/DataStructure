package structures;

public class BinarySearchingTree {

  public Node root;

  public class Node{

    public int value;
    public Node left;
    public Node right;

    public Node(int value){
      this.value = value;
    }
  }

  public void insert(int value){
    if (root == null){
      root = new Node(value);
    } else{
      insert(root, value);
    }
  }

  private void insert(final Node root, final int value){
    if (root == null) return;
    if (value == root.value) return;
    if (value > root.value) {
      if (root.right == null) root.right = new Node(value);
      else insert(root.right, value);
    } else{
      if (root.left == null) root.left = new Node(value);
      else insert(root.left, value);
    }
  }

  public void inOrder(){
    inOrder(root);
  }

  public void inOrder(final Node node){
    if (node == null) return;
    inOrder(node.left);
    System.out.println(node.value);
    inOrder(node.right);
  }

  public static void main(String[] args) {
    BinarySearchingTree tree = new BinarySearchingTree();
    tree.insert(37);
    tree.insert(11);
    tree.insert(66);
    tree.insert(8);
    tree.insert(17);
    tree.insert(42);
    tree.insert(72);

    tree.inOrder();
  }
}
