import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;



public class TreeTest {
    Tree bt;

    @BeforeEach
    void setUp() {
        bt = new Tree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
    }

    @Test
    @DisplayName("Simple multiplication should work")
    void test_1() {
        System.out.println("Test 123");
        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));

        assertFalse(bt.containsNode(1));
    }

    @Test
    public void givenABinaryTree_WhenDeletingElements_ThenTreeDoesNotContainThoseElements() {
        assertTrue(bt.containsNode(9));
        bt.delete(9);
        assertFalse(bt.containsNode(9));
    }

    @Test
    public void traverseInOrderTest() {
        System.out.print("Обход InOrder:");
        bt.traverseInOrder(bt.root);
        System.out.println();
    }


    @Test
    public void traversePreOrderTest() {
        System.out.print("Обход PreOrder:");
        bt.traversePreOrder(bt.root);
        System.out.println();
    }

    @Test
    public void traversePostOrderTest() {
        System.out.print("Обход PostOrder:");
        bt.traversePostOrder(bt.root);
        System.out.println();
    }

    @Test
    public void traverseLevelOrderTest() {
        System.out.print("Обход LevelOrder:");
        bt.traverseLevelOrder();
        System.out.println();
    }
}
