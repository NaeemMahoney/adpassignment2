package za.ac.cput;

/**
 * Na'eem Mahoney
 * 218190751
 * ADP372S
 * Assignment 2
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTest {
    List<ShoppingList> shoppingList = new ArrayList<>();
    ShoppingList item1 = new ShoppingList(1, "milk");
    ShoppingList item2 = new ShoppingList(2, "bread");
    ShoppingList item3 = new ShoppingList(3, "coffee");

    //Adding objects to list before each test is run - List size = 3
    @BeforeEach
    void listSetUp(){
        shoppingList.add(item1);
        shoppingList.add(item2);
        shoppingList.add(item3);
    }

    //Adding a new object to the "BeforeEach "list - List size = 3 + 1
    @Test
    void listAddTest(){
        ShoppingList item4 = new ShoppingList(4, "cereal");
        shoppingList.add(item4);
        assertEquals(4, shoppingList.size());
    }

    //Removing an object from the "BeforeEach" list - List size = 3 - 1
    @Test
    void listRemoveTest(){
        shoppingList.remove(item2);
        assertEquals(2, shoppingList.size());
    }

    //finding an item in the list
    //True - this will pass as item1 is in the list
    @Test
    void listFindTestTrue(){
        assertTrue(shoppingList.contains(item1));
    }

    //False - this will fail as item1 is in the list
    @Test
    void listFindTestFalse(){
        assertFalse(shoppingList.contains(item1));
    }

}