public class Main {
    public static void main(String[] args) {
      // Добавил комментарий
      var x=1;
      var y=2;
        y += x;
        x+=y;
        test_1();
     
    }
    // https://javascopes.com/java-binary-tree-b6863141/

    static void test_1() {
        // write your code here
        System.out.println("Hello");
        Tree bt = new Tree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        bt.print(bt.root);
    }

}
