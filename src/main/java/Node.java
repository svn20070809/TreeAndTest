public class Node {
    public int value;
    public Node left;
    public Node right;
    Node(int value){
        this.value=value;
        left=null;
        right=null;
    }
    public void printNode(){
        System.out.println("value:"+value);
    }
}
